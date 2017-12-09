package com.hendisantika.candidateapp.controller;

import com.hendisantika.candidateapp.entity.Candidate;
import com.hendisantika.candidateapp.repository.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : candidate-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 19.58
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    CandidateRepo repo;


    @GetMapping("/")
    Page<Candidate> getAllCandidates(Pageable pageable){
        return repo.findAll(pageable);
    }

    @PostMapping("/")
    Candidate saveData(@RequestBody Candidate candidate){
        return repo.save(candidate);
    }

    @GetMapping()
    Candidate findById(@RequestParam(value = "id") String id){
        return repo.findOne(Long.parseLong(id));
    }

    @DeleteMapping()
    void deleteCandidate(@RequestParam(value = "id") String id){
        Candidate candidate = repo.findOne(Long.parseLong(id));

        if (candidate != null) {
            repo.delete(Long.parseLong(id));

        }

    }
}
