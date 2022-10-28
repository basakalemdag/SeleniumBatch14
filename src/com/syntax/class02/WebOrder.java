package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // go to smartbearsoftware.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        // maximize the window
        driver.manage().window().maximize();

        // enter the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        // enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

        // click login
        driver.findElement(By.className("button")).click();

        // make sure that the title is correct i.e. Web Orders

        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")) {
            System.out.println("The title is correct: "+title);
        }
        else {
            System.out.println("The title is incorrect: "+title);
        }
    }
}
