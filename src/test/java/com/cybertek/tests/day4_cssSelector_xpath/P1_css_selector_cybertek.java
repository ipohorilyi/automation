package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_css_selector_cybertek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //a. “Home” link
        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        //d. E-mail input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[type='text']"));

        //e. “Retrieve password” button
        WebElement retriveButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retriveButton.isDisplayed() = " + retriveButton.isDisplayed());


    }
}
