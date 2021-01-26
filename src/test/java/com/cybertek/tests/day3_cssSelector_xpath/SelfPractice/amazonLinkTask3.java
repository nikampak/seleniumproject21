package com.cybertek.tests.day3_cssSelector_xpath.SelfPractice;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonLinkTask3 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3. Enter search term (use cssSelector to locate search box)
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        searchBox.sendKeys("socks"+ Keys.ENTER);
        //4. Verify title contains search term
        String expectedTitle = "socks";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
    }
}
