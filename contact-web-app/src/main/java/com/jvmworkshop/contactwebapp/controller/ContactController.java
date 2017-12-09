package com.jvmworkshop.contactwebapp.controller;

import com.jvmworkshop.contactwebapp.entity.Contact;
import com.jvmworkshop.contactwebapp.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * Project : contact-web-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/12/17
 * Time: 09.56
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    ContactRepo repo;

    @GetMapping("")
    Page<Contact> getAllContacts(Pageable page){
        return repo.findAll(page);
    }

    @PostMapping("")
    ResponseEntity<Object> saveCandidate(@RequestBody Contact contact){
        if (contact != null) {
            return new ResponseEntity<>(repo.save(contact), HttpStatus.OK);
        }else {

            return new ResponseEntity<>("Data Null", HttpStatus.OK);
        }

    }

    @GetMapping("/findById")
    Contact findContactById(@RequestParam(value = "id") String id){
        return repo.findOne(Long.parseLong(id));

    }

    @GetMapping("/{id}/find")
    Contact findById(@PathVariable(value = "id") String id){
        return repo.findOne(Long.parseLong(id));
    }

    @DeleteMapping("/{id}/delete")
    void deleteContact(@PathVariable(value = "id") String id){
        Contact hasil = repo.findOne(Long.parseLong(id));

        if (hasil != null) {
            repo.delete(Long.parseLong(id));
        }


    }



}
