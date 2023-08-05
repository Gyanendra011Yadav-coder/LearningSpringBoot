package com.learningNewThings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-03,Aug,2023
 * in Project: LearningSpringBoot
 */

@RestController
public class BasicApi {

    @RequestMapping("/callingBasicAPI")
    public String returnResponse() {
        return "Hiiii!";
    }


}
