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
        Assert.assertTrue(driver.findElement(By.cssSelector(".fa-folder-plus")).isDisplayed());

    }

    public void failedLoginFunctionality(String url, String username, String password) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-auth/div[2]/app-footer/div/div/div/div/div[2]/button")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector(".fas.fa-exclamation-triangle")).isDisplayed());


    }










}
