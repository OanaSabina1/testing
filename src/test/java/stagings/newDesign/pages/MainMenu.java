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
    By designationOfTheItemInput = By.cssSelector("[id=\"thread.omfShortDescr\"] input");
    By manufacturerInput = By.cssSelector("[id=\"thread.creator\"] input");
    By MPNInput = By.cssSelector("[id=\"thread.crtNumber\"] input");
    By EmailInput = By.cssSelector("[id=\"thread.crtContact\"] input");
    By technicalDescriptionInput = By.cssSelector("[id=\"thread.descr\"] input");


    public void pressCreateCase() throws InterruptedException {
        click(createCaseButton);
        Thread.sleep(5000);
    }

    public void completeCPNField() throws InterruptedException {
        writeText(CPNInput, String.valueOf(4023));
    }

    public void selectMPN() throws InterruptedException {
        click(MPNInput);
        Thread.sleep(5000);
    }

    public void selectRandomValueForMPN() throws InterruptedException {
        By z = By.cssSelector("div:nth-child(2) > span:nth-child(1) > a");
        click(z);
    }

    public void completeEmail() throws InterruptedException {
        String elementval = driver.findElement(By.cssSelector("[id=\"thread.crtContact\"] input")).getAttribute("ng-reflect-model");
        System.out.println(elementval);
        if (elementval == null)
            writeText(EmailInput, String.valueOf("a"));
        else System.out.println(elementval);
    }

    public void completeDesignationOfTheItem() throws InterruptedException {
        if (designationOfTheItemInput == null) {
            writeText(designationOfTheItemInput, String.valueOf("DesignationType A"));
        }
    }

    public void completeManufacturer() throws InterruptedException {
        if (manufacturerInput == null) {
            writeText(manufacturerInput, String.valueOf("Nice"));
        }
    }

    public void completeMPN() throws InterruptedException {
        if (MPNInput == null) {
            writeText(MPNInput, String.valueOf(20013356));
        }
    }

    public void completeTechnicalDescription() throws InterruptedException {
        if (technicalDescriptionInput == null) {
            writeText(technicalDescriptionInput, String.valueOf("Electronic"));
        }
    }
}


