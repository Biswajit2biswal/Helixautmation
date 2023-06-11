package com.helix.qa.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
    private final WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void clickElement(By locator, Duration timeout) {
        WebElement element = findElement(locator, timeout);
        element.click();
    }

    public void sendKeysToElement(By locator, String keysToSend) {
        WebElement element = findElement(locator, null);
        element.sendKeys(keysToSend);
    }
}