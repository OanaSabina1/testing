package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BasePage;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

//    public void loginFunctionality(String url, String username, String password) throws InterruptedException {
//        driver.get(url);
//        driver.manage().window().maximize();
//
//        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
//        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);
//
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(5000);
//        Assert.assertTrue(driver.findElement(By.cssSelector(".fa-folder-plus")).isDisplayed());
//
//    }

//        public void failedLoginFunctionality(String url, String username, String password) throws InterruptedException {
//        driver.get(url);
//        driver.manage().window().maximize();
//
//        driver.findElement(By.cssSelector()
//        Thread.sleep(5000);
//
//        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
//        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);
//
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(5000);
//        Assert.assertTrue(driver.findElement(By.cssSelector(".fas.fa-exclamation-triangle")).isDisplayed());
//
//    }
//}
//
    public void failedLoginFunctionality(String url, String username, String password) throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("app-footer .btn-group")).click();
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);

        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.cssSelector(".fas.fa-exclamation-triangle")).isDisplayed());

    }
}

//    public void loginFunctionality(String url, String username, String password) throws InterruptedException {
//        driver.get(url);
//        driver.manage().window().maximize();
//        JavascriptExecutor je = (JavascriptExecutor) driver;
//
//        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
//        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);
//
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(5000);
//        Assert.assertTrue(driver.findElement(By.cssSelector(".fa-folder-plus")).isDisplayed());
//
//        WebElement element = driver.findElement(By.cssSelector(".app-footer.d-flex"));
//        je.executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("/html/body/app-root/app-main/div[2]/app-footer/div/div/div/div/div[1]/button")).click();
//        Thread.sleep(10000);
//        WebElement element1 = driver.findElement(By.id("logout-button"));
//        je.executeScript("arguments[0].scrollIntoView(true);", element1);
//        Thread.sleep(5000);
//
//        driver.findElement(By.id("logout-button")).click();
//        Thread.sleep(5000);
//    }
//
//    public void failedLoginFunctionality(String url, String username, String password) throws InterruptedException {
//        driver.findElement(By.cssSelector("[id=\"user.name\"] input")).sendKeys(username);
//        driver.findElement(By.cssSelector("[id=\"user.password\"] input")).sendKeys(password);
//
//        driver.findElement(By.id("login-button")).click();
//        Thread.sleep(5000);
//        Assert.assertTrue(driver.findElement(By.cssSelector(".fas.fa-exclamation-triangle")).isDisplayed());
//
//    }
//}