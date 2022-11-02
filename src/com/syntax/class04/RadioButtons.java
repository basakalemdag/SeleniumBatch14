package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    //        goto syntaxProject.com radio button
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

    //        get the radio button Male
    WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));

    //        check if the radio btn male is displayed
    boolean displayStatus = maleRadioBtn.isDisplayed();

    //        print the display status
        System.out.println("The radio button is Displayed :"+displayStatus);

        //    check if the radio btn male is enabled
        boolean enabledStatus = maleRadioBtn.isEnabled();
        System.out.println("The radio button is Enabled :"+enabledStatus);

       // check if the radio btn male is selected
        boolean selectStatus = maleRadioBtn.isSelected();
        System.out.println("The radio button is Selected :"+selectStatus);

        // check if the male radio button is not selected then click on it
        if(!selectStatus) {
            maleRadioBtn.click();
        }

        selectStatus = maleRadioBtn.isSelected();  // you need to assign it again or you'll get the old value

        System.out.println("The radio button is Selected :"+selectStatus);



}
}