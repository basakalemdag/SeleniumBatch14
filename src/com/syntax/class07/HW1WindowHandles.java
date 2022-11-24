package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW1WindowHandles {

    // 1.goto http://accounts.google.com/signup
    //  2.click on help and privacy btn
    //  3.click on community Button
    //  4.goto gmail.com page and enter your user name in form

    public static void main(String[] args) {

        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //  task : goto gmail signup and get the window handle

        // go to gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

        // save window handle for later use
        String gmail = driver.getWindowHandle();

        //        click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        //        click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        // the title of my desired page is  Google Account Help (we got it manually)

        //        get all the window handles
        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            //    switching the focus to the current handle from list
            driver.switchTo().window(handle);

            //    get the title of the window to which the driver has switched
            String title = driver.getTitle();

            //   compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
        }
        //   find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

        //  4.goto gmail.com page and enter your user name in form
        driver.switchTo().window(gmail);
        WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
        userName.sendKeys("basakalemdag");



    }


}


