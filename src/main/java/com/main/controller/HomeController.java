package com.main.controller;

import com.main.model.User;
import com.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.stream.*;


@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String home() {
        return "ok";
    }


    @RequestMapping("/create")
    public String create() {
    User user = new User();
        user.setEmail("drytrok@test.test");
        user.setLogin("dmytrok");
        user.setPassword("123");

        try {
            userRepository.save(user);
            return "user was created";
        } catch ( Exception ex ) {
            return ex.getMessage();
        }
    }


    @RequestMapping(value = "/users", produces ="application/json")
    public Iterable<User> getUsers() {

       return StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());

    }
}
