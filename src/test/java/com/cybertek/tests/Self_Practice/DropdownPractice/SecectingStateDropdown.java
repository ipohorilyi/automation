package com.cybertek.tests.Self_Practice.DropdownPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SecectingStateDropdown {
    //Open Chrome browser

   @Test
    public void IllinoisTest() throws InterruptedException {


       WebDriver driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       // 2.Go to http://practice.cybertekschool.com/dropdown
       driver.get("http://practice.cybertekschool.com/dropdown");


       // 3.Select Illinois
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       String expectedIllinois = "Illinois";
       WebElement stateBox = driver.findElement(By.id("state"));
       Select IllinoisSelect = new Select(stateBox);

       IllinoisSelect.selectByVisibleText("Illinois");
       WebElement actualState = IllinoisSelect.getFirstSelectedOption();
       String stateActualText = actualState.getText();
       System.out.println("stateActualText = " + stateActualText);
       Assert.assertEquals(stateActualText, expectedIllinois);

        // 5.Select California


       Thread.sleep(1000);

       String expectCali = "California";
       Select caliSelect = new Select(stateBox);
       caliSelect.selectByVisibleText("California");
       WebElement actualStateCali = caliSelect.getFirstSelectedOption();
       String actualStateText= actualStateCali.getText();
       System.out.println("actualStateText = " + actualStateText);
       Assert.assertEquals(actualStateText,expectCali);


        // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)
       //Select allSelect = new Select(stateBox);
       List<WebElement> stateOptions = new ArrayList<>();
       stateOptions = caliSelect.getOptions();




       driver.quit();
       }
}