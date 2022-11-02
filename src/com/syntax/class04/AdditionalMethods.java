package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethods {

    public static void main(String[] args) {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to syntaxProject.com simple-form-demo
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        // get the web element button, assign it to a variable
        WebElement btn = driver.findElement(By.cssSelector("button#buttoncheck"));

        // get the text from it
        String text = btn.getText();

       // print it on the console
        System.out.println("The text on the button is: "+text);

        // get the value of the attribute id from this web element
        String idValue = btn.getAttribute("id");

        // print it on the console
        System.out.println(idValue);



    }
}