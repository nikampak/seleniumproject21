package com.cybertek.tests.day9_driver_actiona_uploads;

import com.cybertek.utilitties.ConfigurationReader;
import com.cybertek.utilitties.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DriverUtilsPractice {

    @Test
    public void simple_google_search_test(){
        //Go to google.com

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.google.com");
//  OR
//        Driver.getDriver().get("https://www.google.com");
//  OR
        String url = ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);
        //Search for a value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        String searchValue= ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(searchValue + Keys.ENTER);
        //Assert title contains the value

        //actual --> actual page, browser
        String actualTitle = Driver.getDriver().getTitle();

        String expectedInTitle = searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
