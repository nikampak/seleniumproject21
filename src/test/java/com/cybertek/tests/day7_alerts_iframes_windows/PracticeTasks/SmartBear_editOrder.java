package com.cybertek.tests.day7_alerts_iframes_windows.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import com.cybertek.utilitties.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBear_editOrder {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void smartBear_editOrder() throws InterruptedException {

        //open SmartBear url
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
        //Login to SmartBear
        WebOrderUtils.loginToSmartBear(driver);

        //2. Click to edit button from the right for “Steve Johns”
        WebElement editButtonSteveJohns = driver.findElement(By.xpath("(//input[@type='image'])[3]"));
        editButtonSteveJohns.click();
    //    Thread.sleep(5000); //
        //3. Change name to “Michael Jordan”
        WebElement inputNameBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
        inputNameBox.sendKeys(Keys.LEFT_CONTROL, "A", Keys.DELETE);
        inputNameBox.sendKeys("Michael Jordan"); //error "Name cannot be empty

        //4. Click Update
        WebElement updateButton = driver.findElement(By.cssSelector("//a[@class='btn_light']"));
        updateButton.click();
//
//        //5. Assert “Michael Jordan” is in the list
//        WebElement michaelJordanName = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[4]//td[2]"));
//        Assert.assertTrue(michaelJordanName.isDisplayed());


    }
}
