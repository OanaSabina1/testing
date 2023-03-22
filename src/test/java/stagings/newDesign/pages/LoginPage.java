package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BasePage;

import static utils.Constants.*;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.id("login-button");
    By userNameInput = By.cssSelector("[id=\"user.name\"] input");
    By userPasswordInput = By.cssSelector("[id=\"user.password\"] input");
    By errorNotification = By.cssSelector("app-auth > div.top-bar.error-notification > div > div");


        public void checkLoginErrorText(String username, String password, int languagePosition, String expected) throws InterruptedException {
        driver.findElement(By.cssSelector("app-footer  div > div > div > div:nth-child("+ languagePosition +")")).click();
        Thread.sleep(5000);

        login(username, password);
        Thread.sleep(5000);

        Assert.assertEquals(readText(errorNotification), expected);
    }

    public void openSpecificUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void login(String username, String password) throws InterruptedException {
        writeText(userNameInput, username);
        writeText(userPasswordInput, password);
        click(loginButton);

        Thread.sleep(5000);
    }


}

