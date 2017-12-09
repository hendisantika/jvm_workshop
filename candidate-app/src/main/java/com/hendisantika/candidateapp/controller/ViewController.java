package com.hendisantika.candidateapp.controller;

import com.hendisantika.candidateapp.entity.Candidate;
import com.hendisantika.candidateapp.repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : candidate-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 20.28
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/candidates")
public class ViewController {

    @Autowired
    CandidateRepo repo;

    @GetMapping("/")
    String index(Model m){

        List<Candidate> candidates = repo.findAll();

        m.addAttribute("candidate", new Candidate());
        m.addAttribute("candidates", candidates);

        return "index";
    }

    @GetMapping("/list")
    String listCandidates(Model m){

        List<Candidate> candidates = repo.findAll();

        m.addAttribute("candidates", candidates);

        return "list";
    }

    @GetMapping("/add")
    String formCandidate(Model m){
        m.addAttribute("candidate", new Candidate());
        return  "add";
    }

    @PostMapping(value = "/save")
    public String prosesForm(@Valid Candidate c, BindingResult errors,
                             HttpSession session) throws Exception {
        if (errors.hasErrors()) {
            return "/candidate/add";
        }

        repo.save(c);

        return "redirect:/candidates/";
    }

    @GetMapping("/edit/{id}")
    String editCandidate(@PathVariable(value = "id", required = false) String id, Model m){
        if(id != null && !id.isEmpty()){
            Candidate c = repo.findOne(Long.parseLong(id));
            if(c != null){
                m.addAttribute("c", c);
            }
        }
        m.addAttribute("candidate", new Candidate());
        return  "edit";
    }


    @GetMapping("/delete/{id}")
    String deleteCandidate(@PathVariable(value = "id", required = false) String id, Model m){
        if(id != null && !id.isEmpty()){
            Candidate c = repo.findOne(Long.parseLong(id));
            if(c != null){
                m.addAttribute("c", c);
            }
        }
        repo.delete(Long.parseLong(id));

        return  "redirect:/candidates/";
    }


}
