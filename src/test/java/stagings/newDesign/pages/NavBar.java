package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class NavBar extends BasePage {
    public NavBar(WebDriver driver) {
        super(driver);
    }

    By logOutButton = By.id("logout-button");

    public void presslogout() throws InterruptedException {
        click(logOutButton);
        Thread.sleep(5000);
    }
}
