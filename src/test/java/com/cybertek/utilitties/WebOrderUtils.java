package com.cybertek.utilitties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtils {

    //Make the method static so that we don't have to create instance of the class

    public static void loginToSmartBear(WebDriver driver) {
        //3. Enter username: “Tester”
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();
    }

    public static void logoutToSmartBear(WebDriver driver) {
        WebElement logoutButton = driver.findElement(By.xpath("//a[@id='ctl00_logout']"));
        logoutButton.click();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){ }

        driver.close();
    }


}
