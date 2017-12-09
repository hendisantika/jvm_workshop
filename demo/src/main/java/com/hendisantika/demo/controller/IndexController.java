package com.hendisantika.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/12/17
 * Time: 23.44
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping("")
    public String getIndex(){
        return "Hello World " + new Date();
    }
}
