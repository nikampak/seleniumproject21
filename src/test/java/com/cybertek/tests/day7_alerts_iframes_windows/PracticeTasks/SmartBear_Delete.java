package com.cybertek.tests.day7_alerts_iframes_windows.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import com.cybertek.utilitties.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear_Delete {
    //TC #9: SmartBear delete order
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void smartBearDeleteOrder(){

        //open SmartBear url
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
        //Login to SmartBear
        WebOrderUtils.loginToSmartBear(driver);

        //2. Delete “Mark Smith” from the list
        WebElement checkBoxForMarkSmith = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl03_OrderSelector"));
        checkBoxForMarkSmith.click();

        WebElement deleteSelectedButton = driver.findElement(By.xpath("//input[@type='submit']"));
        deleteSelectedButton.click();

        //3. Assert it is deleted from the list
        List<WebElement> names = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        Assert.assertFalse(names.contains("Mark Smith"));
    }
}
