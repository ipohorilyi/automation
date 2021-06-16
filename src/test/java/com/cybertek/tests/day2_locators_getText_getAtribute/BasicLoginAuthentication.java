package com.cybertek.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

//3- Verify	title	equals:
//Expected:	Web	Orders	Login
        String titleName= driver.getTitle();
        if (titleName.equalsIgnoreCase("Web Orders Login")){
            System.out.println("test passed");
        }
//4- Enter	username:	Tester
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//5- Enter	password:	test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//6- Click	“Sign	In”	button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
//7- Verify	title equals:
//Expected:	Web	Orders
        String titleNameWebOrder= driver.getTitle();
        if (titleNameWebOrder.equalsIgnoreCase("Web Orders")){
            System.out.println("test passed");
        }
    }
}
