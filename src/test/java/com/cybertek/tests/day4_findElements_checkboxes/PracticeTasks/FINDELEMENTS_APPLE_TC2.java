package com.cybertek.tests.day4_findElements_checkboxes.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FINDELEMENTS_APPLE_TC2 {
    public static void main(String[] args) {
       //1. Open Chrome browser
        //2. Go to https://www.apple.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        //3. Click to iPhone
        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
        //4. Print out the texts of all links
        iphone.click();
        //5. Print out how many link is missing text
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //6. Print out how many link has text
        int linkWithText = 0;
        int linkWithoutText = 0;
        for (WebElement each: listOfLinks) {
            if (listOfLinks.size() == 0) {
                linkWithoutText++;
            } else {
                linkWithText++;
            }
        }
        System.out.println(linkWithText); // 189
        System.out.println(linkWithoutText); // 0
        //7. Print out how many total link
        System.out.println(linkWithText+linkWithoutText); // 189
    }
}
