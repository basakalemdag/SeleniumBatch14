package com.syntax.ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {
        //       setting up the webDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
//        create an instance
        WebDriver driver= new ChromeDriver();
//        open the syntax
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//     find the checkBoxes
                List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

// what does this list contain?
//        it contains all the 6 Web elements

        for(WebElement checkBx:checkbxes){

            String color = checkBx.getAttribute("value"); // using text is not recommended

            if(color.equalsIgnoreCase("orange")){
                checkBx.click();
                break;  // use a break not to waste time
            }


        }



    }
}



