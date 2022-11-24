package com.syntax.ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {

    public static void main(String[] args) {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        //     find the radio Button

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        traverse through the list of webElements.
        // the reason to use a loop instead of just selecting: 1) We don't have to find the element again to select sth else.
        // 2) If the order changes etc, the code may change, locators may change so our code(locator) may be invalid.

        for (WebElement radioBtn : radioBtns) {

//            find the desired radio button
            String option = radioBtn.getAttribute("value");

            if (option.equalsIgnoreCase("5 - 15")) {
//                click on the radio Btn
                radioBtn.click();

            }


        }
    }
}