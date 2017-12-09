package com.hendisantika.candidateapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : candidate-app
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 20.41
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("")
public class IndexController {
    @GetMapping({"", "/"})
    String getIndex(){
        return "Hallo semuanya ! " + new Date();
    }
}
