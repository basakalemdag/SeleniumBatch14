package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW3 {
    //  (do not use thread .sleep  or Explicit wait)
    // 1.Goto https://syntaxprojects.com/dynamic-elements-loading.php
    //2.Click on start button
    //3. get the text Welcome Syntax technologies and print on console
    //the text will be Empty
    //write down  whatever the reason you understand  of text being empty after exploring DOM

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        Thread.sleep(6000);

        WebElement welcomeText = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text = welcomeText.getText();
        System.out.println("the text is :"+text);

        // the text wasn't printed, because the text was present in the DOM before the UI (before we clicked the button)
        // and the driver sees "display : none" in the DOM related to this particular text.
        // So implicit wait doesn't work.

        // it worked after thread.sleep. Why?? It still says display : none??? If ıt finds the element,
        // why doesn't it print the text in it? It doesn't know whether or not if it's displayed on the UI right?

        // the lesson is that whenever you need to wait for a condition to be met, you need to use Explicit.
        // you won't use thread.sleep in real life.
    }
}
