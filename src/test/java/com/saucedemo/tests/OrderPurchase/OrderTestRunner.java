package com.saucedemo.tests.OrderPurchase;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/saucedemo/tests/OrderPurchase/OrderPurchase.feature",
        glue = {"com.saucedemo.tests"},
        plugin = {"pretty","html:reports/saucedemo-Report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class OrderTestRunner extends AbstractTestNGCucumberTests {
}
