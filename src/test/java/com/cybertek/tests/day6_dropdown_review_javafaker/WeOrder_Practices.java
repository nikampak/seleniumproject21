package com.cybertek.tests.day6_dropdown_review_javafaker;

import com.cybertek.utilitties.WebDriverFactory;
import com.cybertek.utilitties.WebOrderUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WeOrder_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //2. Go to website:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebOrderUtils.loginToSmartBear(driver);
    }


    public void test1_link_verifications(){


        //6. Print out count of all the links on landing page
        List<WebElement>allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("Number of all link in this page: " + allLinks.size());

        //7. Print out each link text on this page
        for (WebElement each : allLinks){
            System.out.println("Each link: " + each.getText());
        }
    }

    @Test
    public void test2_create_order_with_java_faker() throws InterruptedException {
        //6. Click on Order
        WebElement orderLink = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderLink.click();

        //7. Select familyAlbum from product, set quantity to 2
        Select productDropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']") )) ;
        productDropdown.selectByIndex(1);

        //Locate quantityInput box
        WebElement inputQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

        //inputQuantity.clear();
        Thread.sleep(1000);
        inputQuantity.sendKeys(Keys.BACK_SPACE );

        Thread.sleep(1000);
        inputQuantity.sendKeys("2");

        //8. Click to “Calculate” button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        //Locating web elements using ID locator
        WebElement nameinput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityAddress = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));

        //9. Fill address Info with JavaFaker
        Faker faker = new Faker();

        //• Generate: name, street, city, state, zip code
        nameinput.sendKeys(faker.name().fullName());
        streetInput.sendKeys(faker.address().streetAddress());
        cityAddress.sendKeys(faker.address().city());
        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));


        //10. Click on “visa” radio button
        WebElement visaRadioButton = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadioButton.click();

        //11. Generate card number using JavaFaker
        WebElement inputCreditCard = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox6"));
        inputCreditCard.sendKeys(faker.finance().creditCard().replaceAll("-", ""));

        //enter expiration date
        WebElement expirationDate = driver.findElement(By.cssSelector("input#ctl00_MainContent_fmwOrder_TextBox1"));
        expirationDate.sendKeys("01/26");

        //12. Click on “Process”
        WebElement processButton = driver.findElement(By.linkText("Process"));
        processButton.click();
        //13.Verify success message “New order has been successfully added.”
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));

        Assert.assertTrue(successMessage.isDisplayed(), "Success message is NOT displayed!!!");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
