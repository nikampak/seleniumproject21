package com.cybertek.tests.day4_findElements_checkboxes.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasy_Checkbox_TC3 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify “Check All” button text is “Check All”
        WebElement checkAllButton = driver.findElement(By.cssSelector("input#check1"));
        //4. Click to “Check All” button
        checkAllButton.click();
        //5. Verify all check boxes are checked
        if (checkAllButton.isEnabled()){
            System.out.println("Check All Boxes verification PASSED");
        }else{
            System.out.println("Check All Boxes verification FAILED");
        }
        //6. Verify button text changed to “Uncheck All”
        WebElement uncheckAllButton = driver.findElement(By.xpath("//input[@value='Uncheck All']"));

        if (checkAllButton.isEnabled() && uncheckAllButton.isDisplayed()){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED");
        }
    }
}
