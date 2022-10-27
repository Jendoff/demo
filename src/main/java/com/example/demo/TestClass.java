package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestClass {

    @Value("${tea}")
    private String testText;

    public void getTea(){
        System.out.println("My tea is " + this.testText);
    }



}
