package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to fb.com
        driver.get("https://www.facebook.com/");

        //click on create new account
        driver.findElement(By.linkText("Yeni Hesap Oluştur")).click();

        Thread.sleep(2000);

        //fill up all the textboxes
        driver.findElement(By.name("firstname")).sendKeys("Jane");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("janesmith98765432@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("janesmith98765432@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Pass123456");

        // close the pop-up
        driver.findElement(By.xpath("//img[contains(@src, 'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();

        // quit the browser
        driver.quit();




    }
}
