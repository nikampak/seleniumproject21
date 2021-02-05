package com.cybertek.tests.SelfPractice.PracticeTasks_02_04_2021;

import com.cybertek.utilitties.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class tc18_contextClick_homework {

    @Test
    public void TC18_Context_Click_Homework(){

        //1.Go to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        //2.Right click to the box
        Actions action = new Actions( Driver.getDriver() );
        action.moveToElement(Driver.getDriver().findElement(By.id("hot-spot"))).contextClick().perform();

        //3.Alert will open
        //4.Accept alert No assertion needed for this
        Driver.getDriver().switchTo().alert().accept();

    }
}