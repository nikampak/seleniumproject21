package com.cybertek.tests.day10_pom_synchronization_jsExecutor;

import com.cybertek.utilitties.BrowserUtils;
import com.cybertek.utilitties.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_test1(){

        //Get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Use "js" to reach JavascriptExecutor methods
        //first one is for x axis, second is y axis
        //We are saying, move down 750 pixels using this js function

        //Creating the loop just to scroll 750pixels down 10 times.
        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");

        }

    }
}
