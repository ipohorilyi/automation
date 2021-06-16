package com.cybertek.tests.Self_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class findelements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

       // Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com");

//        Print out the texts of all links
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
     }


        //Print out how many link is missing text
        //links with num only and only one char
        int LinksMissingText=0;
        for (WebElement each : listOfLinks) {
            if (each.getText().length()<=3) {
                LinksMissingText++;
            }
        }
        System.out.println("========================================");
        System.out.println("LinksMissingText = " + LinksMissingText);
       
       //Print out how many link has text
        int LinksHasText=0;
        for (WebElement each : listOfLinks) {
            if (each.getText().length()>3) {
                LinksHasText++;
            }
        }
        System.out.println("LinksHasText = " + LinksHasText);

//        Print out how many total link
        int TotalLinks=0;
        for (WebElement each : listOfLinks) {
           TotalLinks++;
        }
        System.out.println("TotalLinks = " + TotalLinks);

    }
}
