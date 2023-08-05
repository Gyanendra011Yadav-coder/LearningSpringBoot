package com.learningNewThings.service;

import com.learningNewThings.entity.EmployeeDetails;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-05,Aug,2023
 * in Project: LearningSpringBoot
 */

@Service
public class EmployeeInfo {

    public List<EmployeeDetails> returnEmployeeInfo() throws ParseException {

        List<EmployeeDetails> list=new ArrayList<>();
        EmployeeDetails entity = new EmployeeDetails();

        entity.setFirstName("John");
        entity.setSurname("Doe");
        entity.setDob(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-15")));
        entity.setEmail("john.doe@example.com");
        entity.setTelephone("123-456-7890");
        entity.setAddress("123 Main St");
        entity.setDepartment("Finance");
        entity.setGender("Male");
        entity.setSalary(50000.0);
        entity.setAddress2("Apt 2B");
        entity.setApartment("456 Side Rd");
        entity.setPostCode("AB12 3CD");
        entity.setDesignation("Senior Analyst");
        entity.setStatus("Active");
        entity.setDateHired(String.valueOf(new SimpleDateFormat("yyyy-MM-dd").parse("2020-05-10")));
        entity.setJobTitle("Financial Analyst");
        list.add(entity);
        return list;
    }
}
