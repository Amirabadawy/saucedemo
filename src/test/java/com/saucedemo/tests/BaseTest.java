package com.saucedemo.tests;

import com.saucedemo.utilities.PropertiesConfig;
import com.saucedemo.browser.Browser;
import com.saucedemo.driver.WebDriverHandler;

public class BaseTest {
    protected WebDriverHandler webDriverHandler;
    protected static Browser browser;
    protected static PropertiesConfig config;
}
