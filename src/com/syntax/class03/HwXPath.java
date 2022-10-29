package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwXPath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to http://syntaxprojects.com/
        driver.get("http://syntaxprojects.com/");

        // maximize window:
        driver.manage().window().maximize();

        // Using Xpath:
        //Click on start practicing
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

        //click on simple form demo
        // driver.findElement(By.xpath("(//a[text()='Simple Form Demo'])[2]")).click();

        Thread.sleep(5000);

        //click on simple form demo using AND Operator with Xpath
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();

        //enter any text on first text box
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Example Text");

        //click on show message
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();

        Thread.sleep(3000);

        //quit the browser
        driver.quit();


    }

}
