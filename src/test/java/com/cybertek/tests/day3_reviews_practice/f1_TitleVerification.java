package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class f1_TitleVerification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:/www.facebook.com");
        String expectedTitle ="Facebook - Log in or sign up";
        String actualResult = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualResult)){
            System.out.println(" Title verification passed");
        }

        WebElement inputUserName = driver.findElement(By.id("email"));
        inputUserName.sendKeys("somethingtime@gmail.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("123qweasd"+ Keys.ENTER);






    }
}
