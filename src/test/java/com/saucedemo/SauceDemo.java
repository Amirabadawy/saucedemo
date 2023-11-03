package com.saucedemo;

import com.saucedemo.pages.*;

public class SauceDemo {
    public Login login;
    public Home home;
    public Cart cart;
    public CheckoutInfo checkoutInfo;
    public Checkout checkout;
    public Complete complete;
    public SideMenu sideMenu;

    public SauceDemo() {
        login = new Login();
        home = new Home();
        sideMenu = new SideMenu();
        cart = new Cart();
        checkout = new Checkout();
        complete = new Complete();
        checkoutInfo = new CheckoutInfo();
    }
}
