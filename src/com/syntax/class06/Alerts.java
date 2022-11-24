package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to link
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        // maximize the window
        driver.manage().window().maximize();

        // find the click me button on Java Script Alert Box
       WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));

       // click on it
       simpleAlert.click();

       Thread.sleep(2000);

       // Handling the alert
       Alert simpleAlert1 = driver.switchTo().alert();
       simpleAlert1.accept();

        // find the click me button on Java Script Confirm Box
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));

        // click on it
        confirmationAlert.click();

        Thread.sleep(2000);

        // Handling the alert
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

        // find the Prompt Alert and send some text and accept it
        WebElement promptAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promptAlert.click();

        Thread.sleep(2000);

        // switch the focus to the alert
        Alert prompt1 = driver.switchTo().alert();
        prompt1.sendKeys("abracadabra");
        prompt1.accept();


    }
}
