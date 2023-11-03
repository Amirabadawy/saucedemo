package com.saucedemo.tests;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.saucedemo.utilities.PropertiesConfig;
import com.saucedemo.browser.Browser;
import com.saucedemo.driver.WebDriverHandler;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.IOException;

public class HooksHandler extends BaseTest {

    @Before
    public void setUp() throws IOException {
        webDriverHandler = new WebDriverHandler();
        browser = new Browser();
        config = new PropertiesConfig("resources/config/config.properties");
        webDriverHandler.navigateTo("https://www.saucedemo.com/");
        webDriverHandler.maximizeWindow();
    }

    @AfterStep
    public void AfterStep(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.isFailed()) {
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Screenshot()).build());
        }
    }

    @After()
    public void tearDown() {
        webDriverHandler.close();
    }

    public String getBase64Screenshot() {
        return ((TakesScreenshot) WebDriverHandler.getWebDriver()).getScreenshotAs(OutputType.BASE64);
    }

}
