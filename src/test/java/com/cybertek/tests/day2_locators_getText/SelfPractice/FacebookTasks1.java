package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTasks1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
// 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
//2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//3. Verify title:
//Expected: “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.err.println("Title verification FAILED!"); // Failed!
        }
        driver.close();
    }
}
