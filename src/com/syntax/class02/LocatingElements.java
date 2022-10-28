package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {

    public static void main(String[] args) {

        // go to fb.com
        // enter username
        // enter password
        // click login

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // go to fb.com
        driver.get("https://www.facebook.com/");

        // maximize the window - best practice is to maximize your window when you're testing.

        driver.manage().window().maximize();

        // enter the username in the textbox - 1) Locate the element 2) send the keys

        driver.findElement(By.id("email")).sendKeys("John@gmail.com");

        // enter password

        driver.findElement(By.name("pass")).sendKeys("password123");

        // click login

        driver.findElement(By.name("login")).click();

       // For Task 2 or 3 to work, make sure to comment the login functionality and the other task.

        // Task 2 - Click on Forgot Password using Link Text

        // driver.findElement(By.linkText("Şifreni mi Unuttun?")).click();

        //Task 3 - Click on Forgot Password using Partial Link Text

       // driver.findElement(By.partialLinkText("Unuttun?")).click();

    }
}
