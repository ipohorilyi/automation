package com.cybertek.tests.AssignmentsPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class VyTrackLogIn {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");

        //Find UserName field and type it
        WebElement UserNameField = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        UserNameField.sendKeys("user185");

        //Find Password field and type it + click enter button
        WebElement PasswordField = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        PasswordField.sendKeys("UserUser123"+ Keys.ENTER);



    }
}
