package com.cybertek.tests.day4_findElements_checkboxes.PracticeTasks;

import com.cybertek.utilitties.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FINDELEMENTS_APPLE_TC3 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://www.apple.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.apple.com");
        //3. Click to all of the headers one by one
        //a. Mac, iPad, iPhone, Watch, TV, Music, Support
        WebElement mac = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-mac']"));
        mac.click();
//        WebElement ipad = driver.findElement(By.xpath("//a[@href='https://www.apple.com/ipad/']"));
//        WebElement iphone = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-iphone']"));
//        WebElement watch = driver.findElement(By.xpath("a[@href='https://www.apple.com/watch/']"));
//        WebElement tv = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-music']"));
//        WebElement music = driver.findElement(By.xpath("//a[@href='https://www.apple.com/music/']"));
//        WebElement support = driver.findElement(By.xpath("//a[@class='ac-gn-link ac-gn-link-support']"));
        //4. Print out how many links on each page with the titles of the pages
        //5. Loop through all
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));

        int linksWithText = 0;
        int linksWithoutText = 0;
        for (WebElement each : links){
            System.out.println(each);
            if (each.getText().isEmpty()){
                linksWithoutText++;
            }else{
                linksWithText++;
            }
        }
        //6. Print out how many link is missing text TOTAL
        System.out.println("Links without text: "+linksWithoutText);
        //7. Print out how many link has text TOTAL
        System.out.println("Links with text: "+linksWithText);
        //8. Print out how many total link TOTAL
        System.out.println("Total links: "+ linksWithoutText+linksWithText);
    }
}
