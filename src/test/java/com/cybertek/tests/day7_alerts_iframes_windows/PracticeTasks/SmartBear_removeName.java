package com.cybertek.tests.day7_alerts_iframes_windows.PracticeTasks;

import com.cybertek.utilitties.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SmartBear_removeName {

    public void removeName(WebDriver driver, String name){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
        WebOrderUtils.loginToSmartBear(driver);
        // choose a Name to edit and click on the check box next to the name
        List <WebElement> checkBox = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[1]"));

    }
}
