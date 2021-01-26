package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        // 1 - set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2 - create the instance of the chrome driver (opens the browser)
        WebDriver driver = new ChromeDriver();

        //this line maximizes the browser
        driver.manage().window().maximize();

        // 3 - test if driver is working
        driver.get("https://www.google.com");

        System.out.println("Current title of the page: "+ driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("CurrentURL = " + currentUrl);

        // we are using navigate.back method from SELENIUM LIBRARY
        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().to("https://www.tesla.com");

        System.out.println("Current title of the page:  "+driver.getTitle());

        //we are refreshing(re-assigning) the value of "currentURL"

        //closing the browser
        driver.close();




    }
}
