package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class MainMenu extends BasePage {
    public Object pressCreateCase;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    By createCaseButton = By.cssSelector(".fas.fa-folder-plus");
    By CPNInput = By.cssSelector("[id=\"thread.artNumber\"] input");
    By designationOfTheItem = By.cssSelector("[id=\"thread.omfShortDescr\"] input");


    public void pressCreateCase() throws InterruptedException {
        click(createCaseButton);
        Thread.sleep(5000);
    }

    public void completeCPNField (String CPN) throws InterruptedException {
        writeText(CPNInput, String.valueOf(4023));
    }


}
