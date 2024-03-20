package com.demo.service.impl;

import com.demo.models.User;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>();

    public UserServiceImpl() {
        users.add(new User(UUID.randomUUID().toString(), "tej", "tej@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "tejpratap", "tejpratap@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "tejpratapk", "tejpratapk@gmail.com"));
    }

    @Override
    public List<User> getUsers() {
        return this.users;
    }
}
