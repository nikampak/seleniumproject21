package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTasks1 {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//3. Verify title
//Expected: “Zero - Log in”
        String expectedTitle = "Zero - Log in";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.err.println("Title verification FAILED!");
        }
        driver.close();
    }
}
