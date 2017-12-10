package com.hendisantika.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 10/12/17
 * Time: 06.25
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("")
public class IndexController {
    @GetMapping()
    String index(Model m){
        m.addAttribute("now", new Date());
        m.addAttribute("nama", "Hendi Santika");
        return "index";
    }

}
