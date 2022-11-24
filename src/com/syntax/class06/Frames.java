package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws InterruptedException {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to Syntax project / dropdown demo
        driver.get("https://chercher.tech/practice/frames");

        // maximize the window
        driver.manage().window().maximize();

        // Task 1: Print the Animals text on screen

           //Step1 - Switch to the frame using By Index
        driver.switchTo().frame(1);

          // find the text Animals and print on console
       WebElement animalText = driver.findElement(By.xpath("//b[text()='Animals :']"));

        String text = animalText.getText();

        System.out.println(text);

        // Task 2: send text to the Topic textbox

        // switch the focus back to the main page
        driver.switchTo().defaultContent();

        // switch to the frame containing the subframe which has textbox
        driver.switchTo().frame("frame1");

        WebElement inputTxt = driver.findElement(By.xpath("//input")); // the other element with the input tag is in another frame, so this is actually unique at the moment

        inputTxt.sendKeys("abracadbra");

        // Task 3: check the checkbox

        // finding the frame through xpath and switching using BY Webelement method

        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        //        find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();


    }
}
