package com.cybertek.tests.AssignmentsPractice.assignment_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ExportGrid {
    @Test
    public void ExportGridCkeck() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to http://https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");

        //Find UserName field and type it
        WebElement UserNameField = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        UserNameField.sendKeys("user185");

        //Find Password field and type it + click enter button
        WebElement PasswordField = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        PasswordField.sendKeys("UserUser123" + Keys.ENTER);


        WebElement fleetModule = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]"));

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        fleetModule.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement vehicles = driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[1]/div/div/ul/li[3]/a/span"));
        vehicles.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement grid = driver.findElement(By.xpath("//div[@class='btn-group']//a[@title='With this button you will export the content" +
                " of the grid as it appears to you, with filters and sorting applied. All pages will be exported.']"));
       grid.click();





    }
}