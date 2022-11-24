package com.syntax.ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBHomework {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to fb.com
        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        // create new account (xpath)
        driver.findElement(By.xpath("//a[text()='Yeni Hesap Oluştur']")).click();

        // wait 5 seconds
        Thread.sleep(5000);

        //enter first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Laura");

        // enter last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("White");

        // close the pop-up
        driver.findElement(By.xpath("//img[contains(@src, 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();

        // quit the browser
        driver.quit();
    }
}