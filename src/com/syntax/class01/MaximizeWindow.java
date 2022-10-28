package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        // go to google.com
        // maximize the window

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        // maximize window
        driver.manage().window().maximize();

        // fullscreen
        driver.manage().window().fullscreen();

        // quit
        driver.quit();
    }
}
