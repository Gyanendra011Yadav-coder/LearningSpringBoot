package com.learningNewThings.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-05,Aug,2023
 * in Project: LearningSpringBoot
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "EmployeeDetails.findAll", query = "select e from EmployeeDetails e")
})
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String surname;
    private String dob;
    private String email;
    private String telephone;
    private String address;
    private String department;
    private String gender;
    private Double salary;
    private String address2;
    private String apartment;
    private String postCode;
    private String designation;
    private String status;
    private String dateHired;
    private String jobTitle;

    // Constructors, getters, setters, equals, and hashCode methods

    // Constructor
    public EmployeeDetails() {
    }

    // Getters and Setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    // Equals and HashCode methods

    public EmployeeDetails(Long id, String firstName, String surname, String dob, String email, String telephone, String address, String department, String gender, Double salary, String address2, String apartment, String postCode, String designation, String status, String dateHired, String jobTitle) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.dob = dob;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.address2 = address2;
        this.apartment = apartment;
        this.postCode = postCode;
        this.designation = designation;
        this.status = status;
        this.dateHired = dateHired;
        this.jobTitle = jobTitle;
    }
}
