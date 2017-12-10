package com.hendisantika.thymeleaf.controller;

import com.hendisantika.thymeleaf.domain.User;
import com.hendisantika.thymeleaf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 18.45
 * To change this template use File | Settings | File Templates.
 */


@Controller
@RequestMapping("app")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("create-user")
    public ModelAndView createUserView() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user-creation");
        mav.addObject("user", new User());
        mav.addObject("allProfiles", getProfiles());
        return mav;
    }

    @PostMapping("create-user")
    public ModelAndView createUser(@Valid User user, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            logger.info("Validation errors while submitting form.");
            mav.setViewName("user-creation");
            mav.addObject("user", user);
            mav.addObject("allProfiles", getProfiles());
            return mav;
        }
        userService.addUser(user);
        mav.addObject("allUsers", userService.getAllUserArticles());
        mav.setViewName("user-info");
        logger.info("Form submitted successfully.");
        return mav;
    }

    private List<String> getProfiles() {
        List<String> list = new ArrayList<>();
        list.add("Developer");
        list.add("Manager");
        list.add("Director");
        return list;
    }
} 