package com.cybertek.tests.day2_locators_getText.SelfPractice;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZeroBankTasks4 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Enter username: username
        WebElement username = driver.findElement(By.xpath("//input[@name='user_login']"));
        username.sendKeys("username");
        //4. Enter password: password
        WebElement password = driver.findElement(By.xpath("//input[@name='user_password']"));
        password.sendKeys("password"+ Keys.ENTER);

        //5. Click to “Account Activity” link
        //6. Verify title changed to:
        //Expected: “Zero – Account Activity” 7. Click to “Transfer Funds” link
        //8. Verify title changed to:
        //Expected: “Zero – Transfer Funds” 9. Click to “Pay Bills” link
        //10. Verify title changed to:
        //Expected: “Zero - Pay Bills” 11. Click to “My Money Map” link 12. Verify title changed to:
        //Expected: “Zero – My Money Map” 13. Click to “Online Statements” link 14. Verify title changed to:
        //Expected: “Zero – Online Statements”
    }
}
