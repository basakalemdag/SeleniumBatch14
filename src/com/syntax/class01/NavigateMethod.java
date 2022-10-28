package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        // go to google.com
        // go to fb.com
        // go back to google.com

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.navigate().to("https://facebook.com");

        Thread.sleep(2000);  // pause for 2000 milliseconds (2 seconds). Add exception to method signature on the word "sleep"

        // go back to google.com
        driver.navigate().back();

        Thread.sleep(2000);

        // go back to fb
        driver.navigate().forward();

        Thread.sleep(2000);

        // refresh the page
        driver.navigate().refresh();

        // quit
        driver.quit();


    }
}
