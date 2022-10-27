package com.example.demo;

import org.springframework.beans.factory.annotation.Value;

public class TestClass {

    @Value("${tea}")
    private String testText;

    public void getTea(){
        System.out.println("My tea is " + this.testText);
    }



}
