package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectetTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectetTitle)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is fail");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test"+ Keys.ENTER);

        String expectetTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();
        if (actualTitle.equals(expectetTitle)){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is fail");
        }
    }
}
