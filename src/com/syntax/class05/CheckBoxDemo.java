package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

    public static void main(String[] args) {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to link
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        // maximize the window
        driver.manage().window().maximize();

        // find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));

        // click on it
        checkBox.click();


    }
}
