package com.syntax.class05;

import net.sourceforge.htmlunit.corejs.javascript.tools.shell.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {

    // 1.Go to ebay.com
    //2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
    //3.select Computers/Tables & Networking
    //4.click on search
    //5.verify the title

    public static void main(String[] args) {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to ebay.com
        driver.get("https://www.ebay.com/");

        // get all the categories and print them in the console
       WebElement categoryDD = driver.findElement(By.xpath("//select[@aria-label='Select a category for search']"));

       Select select = new Select(categoryDD);

       List<WebElement> options = select.getOptions();

        for(WebElement option:options) {
            String category = option.getText();
            System.out.println(category);
        }

        // select Computers/Tables & Networking
        select.selectByVisibleText("Computers/Tablets & Networking");

        // click on search
        driver.findElement(By.xpath("//input[@value='Search']")).click();

        // verify the title
        String title = driver.getTitle();

        if(title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")) {
            System.out.println("Page title "+title+" is correct");
        }
        else {
            System.out.println("Page title "+title+" is incorrect");
        }


    }
}
