package stagings.newDesign.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MainMenu extends BasePage {
    public Object pressCreateCase;

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    By createCaseButton = By.cssSelector(".fas.fa-folder-plus");
    By CPNInput = By.cssSelector("[id=\"thread.artNumber\"] input");
    By designationOfTheItem = By.cssSelector("[id=\"thread.omfShortDescr\"] input");
    By MPNInput = By.cssSelector("[id=\"thread.crtNumber\"] input");


    public void pressCreateCase() throws InterruptedException {
        click(createCaseButton);
        Thread.sleep(5000);
    }

    public void completeCPNField() throws InterruptedException {
        writeText(CPNInput, String.valueOf(22775134));
    }

    public void selectMPN() throws InterruptedException {
        click(MPNInput);
        Thread.sleep(5000);
    }

    public void selectRandomValueForMPN() throws InterruptedException {
        By MPNInput = By.id("thread.crtNumber");
        By z = By.cssSelector("span:nth-child(1) > a");
        Thread.sleep(1000);
        if (z != null) {
            click(z);
        } else {
            writeText(MPNInput, String.valueOf(5946328));
        }
    }
}

