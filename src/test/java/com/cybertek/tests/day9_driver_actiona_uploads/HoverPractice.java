package com.cybertek.tests.day9_driver_actiona_uploads;

import com.cybertek.utilitties.BrowserUtils;
import com.cybertek.utilitties.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPractice {

    @Test
    public void hover_test(){
//1. Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all the web elements needed

        //locating all the images from the page
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //locating all the "user" texts from the page for "isDisplayed" verification
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        BrowserUtils.sleep(2);

        //We MUST create object of Actions class' object to be able to use its method
        Actions actions = new Actions(Driver.getDriver());

        //2. Hover over to first image
        actions.moveToElement(img1).perform();
        //actions.perform();

        //3. Assert:
        //a. “name: user1” is displayed

        Assert.assertTrue(user1.isDisplayed());
        BrowserUtils.sleep(1);

        //4. Hover over to second image
        actions.moveToElement(img2).perform();

        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());

        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
    }
}
