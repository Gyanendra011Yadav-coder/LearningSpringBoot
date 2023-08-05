package com.learningNewThings.controller;

import com.learningNewThings.entity.BasicEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-03,Aug,2023
 * in Project: LearningSpringBoot
 */

@Controller
public class ReturningCollection {

    @RequestMapping("/returnList")
    public List<BasicEntity> returnCollection(){
        return Arrays.asList(new BasicEntity(1, "Gyanendra","DeltaTech"),
                new BasicEntity(2, "Manya","Kaizzen"),
                new BasicEntity(3, "Ramesh","gumd"));
    }
}
