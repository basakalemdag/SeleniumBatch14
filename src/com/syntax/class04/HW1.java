package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

        // Open chrome browser
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // maximize the window
        driver.manage().window().maximize();

        //Enter valid username and password (username - Admin, password - Hum@nhrm123)
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        //Click on login button
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(2000);

        //Then verify the message "Welcome Admin " is there on the top right corner
        String text = driver.findElement(By.linkText("Welcome Admin")).getText();

        if(text.equals("Welcome Admin")) {
            System.out.println("The message 'Welcome Admin' is displayed on the page");
        }
        else {
            System.out.println("The message 'Welcome Admin' is NOT displayed on the page");
        }
    }
}