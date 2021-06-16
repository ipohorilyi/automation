package com.cybertek.tests.day2_locators_getText_getAtribute;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:/www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple.com"+ Keys.ENTER);

        // 5- Verify title:
        //Expected: Title should start with “apple” word
        String expectedInTitle= "apple";
        String actualInTitle= driver.getTitle();

        if (actualInTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!");
        }
//WebDriver driver = WebDriverFactory.getDriver("chrome");


    }
}
