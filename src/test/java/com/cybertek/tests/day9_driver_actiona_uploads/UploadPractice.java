package com.cybertek.tests.day9_driver_actiona_uploads;

import com.cybertek.utilitties.BrowserUtils;
import com.cybertek.utilitties.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UploadPractice {
    @Test
    public void upload_test(){
//        1.Go to
//        http://practice.cybertekschool.com/upload
        //driver = Driver.getDriver()
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

//        2.Find some small file from your computer, and get the path of it
        String path = "C:\\Users\\pakal\\Desktop\\testDocumentUpload.txt";

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(2);

        chooseFile.sendKeys(path);

//        3.Upload the file.
        uploadButton.click();

//      Locating the 'File Uploaded' Header
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

//        4.Assert: -Fileuploaded text is displayed on the page
        Assert.assertTrue(fileUploadedMessage.isDisplayed());
    }
}
