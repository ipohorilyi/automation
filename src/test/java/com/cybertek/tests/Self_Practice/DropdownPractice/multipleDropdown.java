package com.cybertek.tests.Self_Practice.DropdownPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class multipleDropdown {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @AfterClass
    public void tearDown(){driver.quit();}
    @Test (priority = 1)
    public void yearSelector(){
        WebElement yearDropDown = driver.findElement(By.id("year"));
        Select select =new Select(yearDropDown);
        select.selectByVisibleText("1922");
        String actualYearSelection = select.getFirstSelectedOption().getText();
        String expectedYearSelection = "1922";
        Assert.assertEquals(actualYearSelection,expectedYearSelection);

    }



}
