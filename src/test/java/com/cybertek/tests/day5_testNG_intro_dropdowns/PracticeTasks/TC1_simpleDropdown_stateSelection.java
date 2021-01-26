package com.cybertek.tests.day5_testNG_intro_dropdowns.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_simpleDropdown_stateSelection {

    WebDriver driver;

    @BeforeClass
    public void setupClass() {
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void dropdown_test1() {
        //3. Verify “Simple dropdown” default selected value is correct
        WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown"));
        //Expected: “Please select an option”
        String expectedDropdownValue = "Please select an option";
        String actualDropdownValue = dropdown.getText();
        Assert.assertEquals(expectedDropdownValue, actualDropdownValue);
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
    }
}
