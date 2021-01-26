package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WR_CybertekLinkVerifiction {
    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
//3. Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//4. Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();
//5. Verify URL contains:
//Expected: “email_sent”
        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!");
        }
        System.out.println("actualUrl = " + actualURL);
        System.out.println("expectedInUrl = " + expectedURL);
//6. Verify textbox displayed the content as expected.
//Expected: “Your e-mail’s been sent!”

        WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));
        //first verification is to check if it is displayed on the page or not.
        if(confirmation_message.isDisplayed()){
            System.out.println("Confirmation message is displayed, PASSED!");
        }else{
            System.err.println("Confirmation message is NOT displayed, FAILED");
        }
        //Second verification : is to check the content of the confirmation_message web element
        //Expected: “Your e-mail’s been sent!”
        String expectedMessage = "Your e-mail's been sent!";
        String actualMessage = confirmation_message.getText();

        if(actualMessage.equals(expectedMessage)){
            System.out.println("Message verification PASSED!");
        }else{
            System.err.println("Message verification FAILED");
        }
        driver.close();
    }
}
