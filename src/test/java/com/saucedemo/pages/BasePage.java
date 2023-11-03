package com.saucedemo.pages;

import com.saucedemo.driver.WebDriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {
    public WebElement findElement(By locator) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));

        return WebDriverHandler.getWebDriver().findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        WebDriverWait wait = new WebDriverWait(WebDriverHandler.getWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return WebDriverHandler.getWebDriver().findElements(locator);
    }

    public void scrollDownToElement(WebDriver driver, By targetElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(targetElement);

        // Scroll down until the target element is in view
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
