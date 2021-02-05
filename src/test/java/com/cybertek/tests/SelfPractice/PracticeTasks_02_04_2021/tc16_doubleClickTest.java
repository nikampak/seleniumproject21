package com.cybertek.tests.SelfPractice.PracticeTasks_02_04_2021;

import com.cybertek.utilitties.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class tc16_doubleClickTest {

    @Test
    public void TC16_Double_Click_Test(){
        //TC	#16:	Double	ClickTest
        //1.Go	to	https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2.Switch	to	iframe
        Actions action = new Actions(Driver.getDriver().switchTo().frame(0));

        //3.Double	click	on	the	text	“Double-click	me	to	change	my	text	color.
        action.moveToElement(Driver.getDriver().findElement(By.id("demo"))).doubleClick().perform();

        //4.Assert:	Text’s	“style”	attribute	value	cont
        WebElement style = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));

        Assert.assertTrue(style.isDisplayed());
    }

}