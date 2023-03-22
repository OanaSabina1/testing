package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    private JavascriptExecutor je;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(8000));
    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) throws InterruptedException {
        waitVisibility(elementBy);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elementBy);
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(1500);
        driver.findElement(elementBy).click();
    }

    public String readAttribute(By elementBy, String attribute) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute(attribute);
    }

    public String readText(By elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertIfTextIsDisplayedOnTheScreen(String text) {
        boolean presence = driver.getPageSource().contains(text);
        Assert.assertTrue(presence);
    }

    public void assertEquals(By elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void selectNlLanguage(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    public void selectLanguage(int languagePosition) throws InterruptedException {
        By x = By.cssSelector("app-footer  div > div > div > div:nth-child("+ languagePosition +")");
        click(x);
    }

}

