package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); // set the path to the driver to link it with our class.

        WebDriver driver = new ChromeDriver();  // create a WebDriver instance

        String path = "https://www.google.com/";
        driver.get(path);  // navigate to the specified URL

        String URL = driver.getCurrentUrl();

        System.out.println(path);
        System.out.println(URL);

        String title= driver.getTitle();

        if(path.equalsIgnoreCase(URL)) {
            System.out.println("Path matches URL");
        }
        else {
            System.out.println("Path doesn't match URL");
        }

        if(title.equalsIgnoreCase("Google")) {
            System.out.println("Title matches.");
        }
        else {
            System.out.println("Title doesn't match");
        }

        driver.quit();

    }
}