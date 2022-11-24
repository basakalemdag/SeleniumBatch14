package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {

    // HW:
    //goto https://chercher.tech/practice/frames
    //1.check the checkBox
    //2.Select BabyCat from dropdown
    //3. Send text in text box "DONE"

    public static void main(String[] args) throws InterruptedException {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to Syntax project / dropdown demo
        driver.get("https://chercher.tech/practice/frames");

        //1.check the checkBox
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        driver.findElement(By.xpath("//input[@id='a']")).click();

        //2.Select BabyCat from dropdown
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

       WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));

        Select select = new Select(dd);

        select.selectByValue("babycat");

        //3. Send text in text box "DONE"
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");

        driver.findElement(By.xpath("//input")).sendKeys("DONE");



    }
}