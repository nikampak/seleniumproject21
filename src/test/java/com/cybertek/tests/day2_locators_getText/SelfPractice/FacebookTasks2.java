package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTasks2 {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//3. Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("incorrect.username@gmail.com");
//4. Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("IncoRrecT123!@#"+ Keys.ENTER);
//5. Verify title changed to:
//Expected: “Log into Facebook | Facebook”
        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.err.println("Title verification FAILED!");
        }
        driver.close();
    }
}
