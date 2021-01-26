package com.cybertek.tests.day2_locators_getText.SelfPractice;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankTasks3 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Enter username: username
        WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
        username.sendKeys("username");
        //4. Enter password: password
        WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
        username.sendKeys("password"+ Keys.ENTER);
        //5. Verify title changed to:
        //Expected: “Zero – Account Summary”
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


    }
}
// Not finished, web site issues