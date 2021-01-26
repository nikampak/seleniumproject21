package com.cybertek.tests.day3_cssSelector_xpath.SelfPractice;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class cyberteckSchoolTask2 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements");
        //3. Click to “Add Element” button

        //4. Verify “Delete” button is displayed after clicking.
        //5. Click to “Delete” button.
        //6. Verify “Delete” button is NOT displayed after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
// Website doesn't open up