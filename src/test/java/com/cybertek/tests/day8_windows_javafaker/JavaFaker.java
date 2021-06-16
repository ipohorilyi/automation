package com.cybertek.tests.day8_windows_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {
    @Test
    public void test(){
        Faker faker = new Faker();

        String fullName = faker.name().fullName();

        System.out.println("fullName = " + fullName);
        
    }
    }
