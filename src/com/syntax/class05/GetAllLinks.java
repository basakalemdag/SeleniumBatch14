package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {

    public static void main(String[] args) {

        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to ebay.com
        driver.get("https://www.ebay.com/");

        // get all the links (anchor tags) from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));

        // print the size of the list
        System.out.println("The size of the list is: "+ebayLinks.size());

        // implementing a for loop to travers through the list of elements

        for(WebElement ebaylink:ebayLinks) {
            // extracting the value of attribute href because it contains the link embedded in the web element
            String link = ebaylink.getAttribute("href");
            // print the link
            System.out.println(link);
        }

    }
}
