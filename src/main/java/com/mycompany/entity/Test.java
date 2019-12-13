/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Admin
 */
@Entity
public class Test implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String test;
    private int active;
    private String description;
    private String password;
    private int question_number;
    private String test_name;
    private int test_time;
    private String test_type_id;

    @ManyToMany

    private List<Question> test_question;

    public Test() {
    }

    public Test(String test, int active, String description, String password, int question_number, String test_name, int test_time, String test_type_id) {
        this.test = test;
        this.active = active;
        this.description = description;
        this.password = password;
        this.question_number = question_number;
        this.test_name = test_name;
        this.test_time = test_time;
        this.test_type_id = test_type_id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQuestion_number() {
        return question_number;
    }

    public void setQuestion_number(int question_number) {
        this.question_number = question_number;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    public int getTest_time() {
        return test_time;
    }

    public void setTest_time(int test_time) {
        this.test_time = test_time;
    }

    public String getTest_type_id() {
        return test_type_id;
    }

    public void setTest_type_id(String test_type_id) {
        this.test_type_id = test_type_id;
    }

}
