package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        // fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Basak");
        driver.findElement(By.id("customer.lastName")).sendKeys("Alemdag");
        driver.findElement(By.id("customer.address.street")).sendKeys("1166 Xyz Blvd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("90019");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3109030284");
        driver.findElement(By.name("customer.ssn")).sendKeys("111999333");
        driver.findElement(By.name("customer.username")).sendKeys("basakalemdag");
        driver.findElement(By.name("customer.password")).sendKeys("pass12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("pass12345");

        // click on register
        driver.findElement(By.className("button")).click();

        // close the browser
        driver.quit();


    }
}
