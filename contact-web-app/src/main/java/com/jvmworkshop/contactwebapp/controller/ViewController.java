package com.jvmworkshop.contactwebapp.controller;

import com.jvmworkshop.contactwebapp.entity.Contact;
import com.jvmworkshop.contactwebapp.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-web-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/12/17
 * Time: 11.37
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/contacts")
public class ViewController {
    @Autowired
    ContactRepo repo;

    @GetMapping("")
    String index(Model m){
        Iterable<Contact> contacts = repo.findAll();

        m.addAttribute("contacts", contacts);
        m.addAttribute("contact", new Contact());

        return "index";
    }

    @PostMapping(value = "/save")
    public String prosesForm(@Valid Contact c, BindingResult errors,
                             HttpSession session) throws Exception {
        if (errors.hasErrors()) {
            return "/contacts/";
        }

        repo.save(c);

        return "redirect:/contacts/";
    }

    @GetMapping("/edit/{id}")
    String editCandidate(@PathVariable(value = "id", required = false) String id, Model m){
        if(id != null && !id.isEmpty()){
            Contact c = repo.findOne(Long.parseLong(id));
            if(c != null){
                m.addAttribute("c", c);
            }
        }
        m.addAttribute("candidate", new Contact());
        return  "edit";
    }

    @GetMapping("/delete/{id}")
    String deleteCandidate(@PathVariable(value = "id", required = false) String id, Model m){
        if(id != null && !id.isEmpty()){
            Contact c = repo.findOne(Long.parseLong(id));
            if(c != null){
                m.addAttribute("c", c);
            }
        }
        repo.delete(Long.parseLong(id));

        return  "redirect:/contacts/";
    }

}
