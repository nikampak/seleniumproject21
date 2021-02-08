package com.cybertek.tests.SelfPractice.PracticeTasks_02_04_2021;

import com.cybertek.utilitties.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class tc17_hoverTest {

    @Test
    public void TC17_Hover_Test(){

        //1.Go	to	https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //2.Drag and drop the small circle to bigger circle
        Actions action = new Actions(Driver.getDriver());

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement((By.id("droptarget")));

        action.dragAndDrop(smallCircle, bigCircle).perform();

        //3.Assert:	-Text in big circle changed to: “You did great"
        WebElement expectedText = Driver.getDriver().findElement(By.xpath("//div[.='You did great!']"));

        Assert.assertTrue(expectedText.isDisplayed());

    }
}
/*



 */