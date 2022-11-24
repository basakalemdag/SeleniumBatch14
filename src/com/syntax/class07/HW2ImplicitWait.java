package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2ImplicitWait {

    // 1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php
    // 2. click on get New User
    // 3. get the firstname  of user and print it on console

    public static void main(String[] args) {

        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-data-loading-demo.php");

        WebElement button = driver.findElement(By.xpath("//button[text()='Get New User']"));
        button.click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        String text = firstName.getText();

        System.out.println(text);

    }
}
