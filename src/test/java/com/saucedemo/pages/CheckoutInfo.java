package com.saucedemo.pages;

import org.openqa.selenium.By;

public class CheckoutInfo extends BasePage{

    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By zipCodeInput = By.id("postal-code");
    private final By continueButton = By.id("continue");

    public void clickOnContinue(){
        findElement(continueButton).click();
    }
    public void enterFirstName(String firstName) {
        findElement(firstNameInput).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterZipCode(String zipCode) {
        findElement(zipCodeInput).sendKeys(zipCode);
    }

}
