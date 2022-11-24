package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo2 {

    public static void main(String[] args) {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to link
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        // maximize the window
        driver.manage().window().maximize();

        // find the all the textboxes we want
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // traverse through the checkboxes to find the desired one

        for(WebElement checkbox: checkBoxes) {

            // get the attribute value to check the
            String optionName = checkbox.getAttribute("value");

            // if condition to make sure it's the right check box:

            if(optionName.equalsIgnoreCase("Option-2")) {
                // if passed click on it
                checkbox.click();
            }

            if(optionName.equalsIgnoreCase("Option-3")) {
                // if passed click on it
                checkbox.click();
            }
        }
    }
}