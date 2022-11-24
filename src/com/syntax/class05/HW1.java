package com.syntax.class05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {

    // 1.Go to facebook
    //2.click on create New Account
    //3.Fill out the whole form
    //4.Take screen shot of filled out form manually and share in HW channel along with code

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // navigate to fb.com
            driver.get("https://www.facebook.com/");

            //click on create new account
            driver.findElement(By.linkText("Yeni Hesap Oluştur")).click();

            Thread.sleep(2000);

            // fill up all the textboxes
            driver.findElement(By.name("firstname")).sendKeys("Jane");
            driver.findElement(By.name("lastname")).sendKeys("Smith");
            driver.findElement(By.name("reg_email__")).sendKeys("janesmith98765432@gmail.com");
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("janesmith98765432@gmail.com");
            driver.findElement(By.id("password_step_input")).sendKeys("Pass123456");

            // select day from dropdown
            WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
            Select select = new Select(day);
            select.selectByValue("10");
            Thread.sleep(2000);

            // select month from dropdown
            WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
            Select select2 = new Select(month);
            select2.selectByIndex(4);
            Thread.sleep(2000);

            // select year from dropdown
            WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
            Select select3 = new Select(year);
            select3.selectByVisibleText("1992");
            Thread.sleep(2000);

            // select gender via radio buttons
            WebElement femaleButton = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
            femaleButton.click();














        }
    }


