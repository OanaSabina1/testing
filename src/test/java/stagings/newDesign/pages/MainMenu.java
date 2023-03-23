package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class MainMenu extends BasePage {
    public MainMenu(WebDriver driver) {
        super(driver);
    }

    By newCaseButton = By.className(".btn-sm.btn-default-red.mt-2");

}