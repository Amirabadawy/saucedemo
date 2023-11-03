package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Login extends BasePage{
    private final By userNameInput = By.id("user-name");

    private final By passwordInput = By.id("password");

    private final By loginButton = By.id("login-button");

    public void clickOnLogin(){
        findElement(loginButton).click();
    }

    public void enterPassword(String password) {
        findElement(passwordInput).sendKeys(password);
    }

    public void enterUserName(String userName) {
        findElement(userNameInput).sendKeys(userName);
    }
}
