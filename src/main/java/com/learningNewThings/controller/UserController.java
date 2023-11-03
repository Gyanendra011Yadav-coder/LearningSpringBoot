package com.learningNewThings.controller;

import com.learningNewThings.dao.UserRepository;
import com.learningNewThings.entity.User;
import com.learningNewThings.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userServiceImpl.addUser(user);
    }
}

