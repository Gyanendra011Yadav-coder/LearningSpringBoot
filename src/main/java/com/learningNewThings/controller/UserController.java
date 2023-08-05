package com.learningNewThings.controller;

import com.learningNewThings.entity.BasicEntity;
import com.learningNewThings.entity.EmployeeDetails;
import com.learningNewThings.service.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-03,Aug,2023
 * in Project: LearningSpringBoot
 */

@RequestMapping("/userDetailController")
@RestController
public class UserController {

    @Autowired
    EmployeeInfo employeeInfo;
    @RequestMapping("/returnList")
    public List<EmployeeDetails> returnCollection() throws ParseException {
        return employeeInfo.returnEmployeeInfo();
    }
}
