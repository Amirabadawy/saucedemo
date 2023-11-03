package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Complete extends BasePage{
    private final By backToHomeButton = By.id("back-to-products");

    public void clickOnBackToHome(){
        findElement(backToHomeButton).click();
    }

}
