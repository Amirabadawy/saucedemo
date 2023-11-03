package com.saucedemo.pages;

import com.saucedemo.driver.WebDriverHandler;
import org.openqa.selenium.By;

public class Checkout extends BasePage{

    private final By finishButton = By.id("finish");

    public void clickOnFinish(){
        findElement(finishButton).click();
    }

    public By getFinishButton() {
        return finishButton;
    }

    public void scrollDownToFinishButton() {
        scrollDownToElement(WebDriverHandler.getWebDriver(), finishButton);
    }
}
