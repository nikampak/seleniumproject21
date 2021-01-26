package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Xpath_Practice {
    public static void main(String[] args) {
        //go to this link: http://practice.cybertekschool.com/multiple_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 USING XPATH LOCATOR

        WebElement button2 = driver.findElement(By.xpath("//button[.='Button 2']"));

        button2.click();
    }
}
