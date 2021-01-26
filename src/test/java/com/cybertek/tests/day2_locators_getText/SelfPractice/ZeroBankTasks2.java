package com.cybertek.tests.day2_locators_getText.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTasks2 {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
//3. Verify link text from top left:
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
//Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link TEXT verification PASSED!");
        }else{
            System.err.println("Link TEXT verification FAILED!!!");
            System.out.println("actualLinkText = " + actualLinkText);
            System.out.println("expectedLinkText = " + expectedLinkText);
        }
//4. Verify link href attribute value contains:
//Expected: “index.html”
        String expectedInHref = "index.html";
        String actualInHref = zeroBankLink.getAttribute("href");

        if(actualInHref.contains(expectedInHref)){
            System.out.println("HREF value verification PASSED!");
        }else{
            System.err.println("HREF value verification FAILED!");
        }

        System.out.println("expectedInHref = " + expectedInHref);
        System.out.println("actualHref = " + actualInHref);
    }
}
