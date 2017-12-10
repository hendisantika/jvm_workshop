package com.hendisantika.thymeleaf.service;

import com.hendisantika.thymeleaf.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/12/17
 * Time: 18.37
 * To change this template use File | Settings | File Templates.
 */

@Service
public class UserService {
    private List<User> allUsers = new ArrayList<>();

    public List<User> getAllUserArticles() {
        return allUsers;
    }

    public void addUser(User user) {
        allUsers.add(user);
    }
}
