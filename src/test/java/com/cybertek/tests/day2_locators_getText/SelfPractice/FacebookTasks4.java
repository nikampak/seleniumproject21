package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTasks4 {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
//3. Verify “Create a page” link href value contains text:
//Expected: “registration_form”
        String expectedHrefValue = "registration_form";
        String actualHrefValue = driver.findElement(By.className("_8esh")).getAttribute("href");

        if (actualHrefValue.contains(expectedHrefValue)){
            System.out.println("Link href value verification PASSED!");
        }else{
            System.err.println("Link href value verification FAILED!");
        }
    }
}
