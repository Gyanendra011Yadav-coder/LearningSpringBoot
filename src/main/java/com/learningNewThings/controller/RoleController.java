package com.learningNewThings.controller;

import com.learningNewThings.dao.RoleRepository;
import com.learningNewThings.entity.Role;
import com.learningNewThings.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleServiceImpl;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleServiceImpl.getAllRoles();
    }
}

