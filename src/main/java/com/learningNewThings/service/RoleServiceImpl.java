package com.learningNewThings.service;

import com.learningNewThings.dao.RoleRepository;
import com.learningNewThings.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-03,Nov,2023
 * in Project: LearningSpringBoot
 */
@Service
public abstract class RoleServiceImpl implements RoleRepository {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}

