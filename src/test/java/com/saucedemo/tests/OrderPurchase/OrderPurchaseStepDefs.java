package com.saucedemo.tests.OrderPurchase;

import com.saucedemo.tests.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OrderPurchaseStepDefs extends BaseTest {
    @Given("login with valid username {string} and valid password {string}")
    public void loginWithValidUsernameAndPassword(String userName, String password) {
        browser.sauceDemo.login.enterUserName(userName);
        browser.sauceDemo.login.enterPassword(password);
        browser.sauceDemo.login.clickOnLogin();
    }

    @When("click on add to cart button in home page")
    public void clickOnAddToCartButton(){
        browser.sauceDemo.home.clickOnAddToCart();
    }

    @When("click on cart icon in home page")
    public void clickOnCartIcon(){
        browser.sauceDemo.home.clickOnShoppingCart();
    }

    @When("click on checkout button in cart page")
    public void clickOnCheckout(){
        browser.sauceDemo.cart.clickOnCheckout();
    }

    @When("enter first name {string}, last name {string}, and postal code {string} in checkout info page")
    public void enterFirstNameAndLastNameAndPostalCode(String firstName, String lastName, String postalCode){
        browser.sauceDemo.checkoutInfo.enterFirstName(firstName);
        browser.sauceDemo.checkoutInfo.enterLastName(lastName);
        browser.sauceDemo.checkoutInfo.enterZipCode(postalCode);
        browser.sauceDemo.checkoutInfo.clickOnContinue();
    }

    @When("click on finish button in checkout page")
    public void clickOnFinish(){
        browser.sauceDemo.checkout.scrollDownToFinishButton();
        browser.sauceDemo.checkout.clickOnFinish();
    }

    @When("click on back to home button in complete page")
    public void clickOnBackToHome(){
        browser.sauceDemo.complete.clickOnBackToHome();
    }

    @When("click on side menu button in home page")
    public void clickOnSideMenu(){
        browser.sauceDemo.home.clickOnMenu();
    }

    @When("click on Logout button in side menu")
    public void clickOnLogout(){
        browser.sauceDemo.sideMenu.clickOnLogout();
    }


}
