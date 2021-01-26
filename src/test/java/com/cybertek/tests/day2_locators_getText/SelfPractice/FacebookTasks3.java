package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTasks3 {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//3. Verify header text is as expected:
//Expected: “Connect with friends and the world around you on Facebook.”
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.className("_8eso")).getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        }else{
            System.err.println("Header verification FAILED!");
        }
        driver.close();
    }
}
