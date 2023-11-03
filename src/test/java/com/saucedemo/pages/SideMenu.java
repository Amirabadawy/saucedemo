package com.saucedemo.pages;

import org.openqa.selenium.By;

public class SideMenu extends BasePage{


    private final By logoutButton = By.id("logout_sidebar_link");

    public void clickOnLogout(){
        findElement(logoutButton).click();
    }
}
