package com.syntax.Test;

import com.syntax.Pages.LoginPage;
import com.syntax.utils.CommonMethods;

public class LoginPageTest {

    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPage login = new LoginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();


    }
}
