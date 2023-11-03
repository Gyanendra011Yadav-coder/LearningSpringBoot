package com.learningNewThings.dao;

import com.learningNewThings.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-11-02,Nov,2023
 * in Project: LearningSpringBoot
 */

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
