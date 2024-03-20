package com.demo.controllers;

import com.demo.models.User;
import com.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<User> getUser() {
        this.logger.info("getting users");
        return service.getUsers();
    }

    @GetMapping("/current-user")
    public String loggedInUser(Principal principal) {
        this.logger.info("getting logged in user");
        return principal.getName();
    }


    @RequestMapping("/test")
    public String test() {
        this.logger.warn("This is working message");
        return "Testing message";
    }


}