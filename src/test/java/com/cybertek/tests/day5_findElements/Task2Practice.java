package com.cybertek.tests.day5_findElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//        1. Go	to	http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//        2. Confirm	checkbox	#1	is	NOT	selected	by	default
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println(!checkBox1.isSelected());

//        3. Confirm	checkbox	#2	is	SELECTED	by	default.
        WebElement checkbox2= driver.findElement(By.xpath("//input[@id='box2']"));
        System.out.println(checkbox2.isSelected());

//        4. Click	checkbox	#1	to	select	it.
//        5. Click	checkbox	#2	to	deselect	it.
//        6. Confirm	checkbox	#1	is	SELECTED.
//        7. Confirm	checkbox	#2	is	NOT	selected.`

              //driver.quit();
    }
}
