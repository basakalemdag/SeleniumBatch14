package com.syntax.class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

    public static void main(String[] args) throws InterruptedException {
        //  set the path to the driver to link it with our clas. On mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //  task : goto gmail signup and get the window handle

        // go to gmail sign up page
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

        // get the window handle for the current page
        String gmailHandle = driver.getWindowHandle();

        // print
        System.out.println("the handle of the current page is :"+gmailHandle);


    }
}