package com.learningNewThings.dao;

import com.learningNewThings.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-02,Nov,2023
 * in Project: LearningSpringBoot
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> getAllRoles();
}
