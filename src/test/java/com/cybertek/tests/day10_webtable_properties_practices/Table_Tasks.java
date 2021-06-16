package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        String browser = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty(""));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("");

    }

    @Test
    public void task3_return_tims_due_amount(){
        //1.	Open browser and go to: http://practice.cybertekschool.com/tables#edit
        //2.	Locate first table and verify Tim has due amount of “$50”

        // 1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        // 2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tim's cell is not returning as expected.");





        //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
    }

}
