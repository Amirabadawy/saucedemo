package com.saucedemo.pages;

import org.openqa.selenium.By;

public class Home extends BasePage{

    private final By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By shoppingCartIcon = By.id("shopping_cart_container");
    private final By menuButton = By.id("react-burger-menu-btn");




    public void clickOnAddToCart(){
        findElement(addToCartButton).click();
    }

    public void clickOnShoppingCart(){
        findElement(shoppingCartIcon).click();
    }

    public void clickOnMenu(){
        findElement(menuButton).click();
    }



}
