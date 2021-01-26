package com.cybertek.tests.day4_findElements_checkboxes.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumEasy_Checkbox_TC2 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //2. Go to https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //3. Verify “Success – Check box is checked” message is NOT displayed.
        WebElement checkBox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        //4. Click to checkbox under “Single Checkbox Demo” section
        checkBox1.click();
        //5. Verify “Success – Check box is checked” message is displayed.
        WebElement successMessage = driver.findElement(By.cssSelector("div#txtAge"));

        if (checkBox1.isSelected() && successMessage.isDisplayed() ){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED");
        }
    }
}
