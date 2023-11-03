package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Cart extends BasePage{
    private final By checkoutButton = By.id("checkout");

    public void clickOnCheckout(){
        findElement(checkoutButton).click();
    }
}
