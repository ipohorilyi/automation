package com.cybertek.tests.day1_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahooPPractice {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //3. Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo";

        //actual title
        String actualTitle=driver.getTitle();

         if (expectedTitle.equalsIgnoreCase(actualTitle)){
             System.out.println("corect");
         }
    }
}