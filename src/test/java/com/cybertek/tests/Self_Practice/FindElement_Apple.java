package com.cybertek.tests.Self_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElement_Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.apple.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement IphoneLink = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        IphoneLink.click();

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
        }

        int LinksMissingText=0;
        for (WebElement each : listOfLinks) {
            if (each.getText().length()<=1) {
                LinksMissingText++;
            }
        }
        System.out.println("========================================");
        System.out.println("LinksMissingText = " + LinksMissingText);

    }
}
