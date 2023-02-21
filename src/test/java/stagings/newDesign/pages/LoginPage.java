package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginFunctionality(String url, String username, String password) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector(".fa-fo564-plus")).isDisplayed());

    }










}
