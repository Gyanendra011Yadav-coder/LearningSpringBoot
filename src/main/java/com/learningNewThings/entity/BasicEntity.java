package com.learningNewThings.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-03,Aug,2023
 * in Project: LearningSpringBoot
 */

@EntityScan
public class BasicEntity {
    int id;
    String userName;
    String companyName;

    public BasicEntity(int id, String name, String companyName){
        this.id=id;
        this.userName=name;
        this.companyName=companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
