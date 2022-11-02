package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {

        //HRMS Application Negative Login:
        //Open chrome browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // maximize the window
        driver.manage().window().maximize();

        //Enter valid username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        //Leave password field empty
        //Click on login button
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

        //Verify error message with text “Password cannot be empty” is displayed.
        String text = driver.findElement(By.xpath("//span[text()='Password cannot be empty']")).getText();

        if(text.equals("Password cannot be empty")) {
            System.out.println("The message 'Password cannot be empty' is displayed on the page");
        }
        else {
            System.out.println("The message 'Password cannot be empty' is NOT displayed on the page");
        }

    }
}