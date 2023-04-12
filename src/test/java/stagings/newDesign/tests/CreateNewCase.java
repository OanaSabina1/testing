package stagings.newDesign.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stagings.newDesign.pages.LoginPage;
import stagings.newDesign.pages.MainMenu;
import stagings.newDesign.pages.NavBar;
import utils.BasePage;
import utils.BaseTest;

import java.io.IOException;
import static utils.Constants.*;
import static utils.LanguageConstants.NL;
import java.util.Arrays;
import java.util.Random;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class CreateNewCase extends BaseTest {

    private LoginPage loginPage;
    private BasePage basePage;
    private NavBar navBar;
    private MainMenu mainMenu;


    @BeforeMethod
    public void setUp() throws IOException {
        WebDriver driver = initializeDriver();
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        navBar = new NavBar(driver);
        mainMenu = new MainMenu(driver);
    }

    @Test
    public void login() throws InterruptedException {
        loginPage.openSpecificUrl(URL_NS);
        loginPage.login(TEAM_ACCOUNT, PASSWORD);

        Thread.sleep(2000);
        mainMenu.pressCreateCase();
    }
}