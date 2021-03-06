package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Click on Button 1
        // locating using XPATH with class attribute value
        //WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        // locating using text of the button with XPATH
        //WebElement button1= driver.findElement(By.xpath("//button[.='Button 1']"));

        // locating using "onclick" attribute value with xpath locator
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

    }
}
