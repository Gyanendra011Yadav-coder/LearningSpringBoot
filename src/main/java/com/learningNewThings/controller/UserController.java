package com.learningNewThings.controller;

import com.learningNewThings.dao.UserRepository;
import com.learningNewThings.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
         userRepository.save(user);
    }
}

