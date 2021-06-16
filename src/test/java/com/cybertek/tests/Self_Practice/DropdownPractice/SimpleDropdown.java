package com.cybertek.tests.Self_Practice.DropdownPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SimpleDropdown {
    public static void main(String[] args) {
//        TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
//        1.Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2.Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

//        3.Verify “Simple dropdown”
//        default selected value is correctExpected: “Please select an option”
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id = 'dropdown']"));
        Select select = new Select(simpleDropdown);

        String expected ="Please select an option";
        String actual = select.getFirstSelectedOption().getText();

        System.out.println("actual = " + actual);

        if(actual.equals(expected)) {
            System.out.println("Default selected value verification PASSED");
        } else{
            System.out.println("Default selected value verification FAILED");

        }



        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        WebElement stateSelectionDropdown = driver.findElement(By.xpath("//select[@id = 'state']"));
        Select select2 = new Select(stateSelectionDropdown);

        String expected2 = "Select a State";
        String actual2 = select2.getFirstSelectedOption().getText();

        if(actual2.equals(expected2)) {
            System.out.println("Default selected value for state verification PASSED");
        } else{
            System.out.println("Default selected value state verification FAILED");

        }
    }
}
