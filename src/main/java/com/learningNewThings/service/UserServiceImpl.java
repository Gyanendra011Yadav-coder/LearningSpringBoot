package com.learningNewThings.service;

import com.learningNewThings.dao.UserRepository;
import com.learningNewThings.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class UserServiceImpl implements UserRepository {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }
}

