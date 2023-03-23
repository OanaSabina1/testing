package stagings.newDesign.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stagings.newDesign.pages.*;
import utils.BasePage;
import utils.BaseTest;


import java.io.IOException;

import static utils.Constants.*;
import static utils.LanguageConstants.NL;

public class LoginTests extends BaseTest {

    private LoginPage loginPage;
    private BasePage basePage;
    private NavBar navBar;


    @BeforeMethod
    public void setUp() throws IOException {
        WebDriver driver = initializeDriver();
        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        navBar = new NavBar(driver);
    }

    @Test
    public void failedLoginFunctionality() throws InterruptedException {
        loginPage.openSpecificUrl(URL_NS);
        loginPage.checkLoginErrorText(TEAM_ACCOUNT, PASSWORD_WRONG, 3, "Name or password is incorrect.");
        loginPage.checkLoginErrorText(TEAM_ACCOUNT, PASSWORD_WRONG, 2, "Name oder Passwort ist falsch.");

    }

    @Test
    public void checkNLErrorForLogin() throws InterruptedException {
        //login cu credentiale corecte
        loginPage.openSpecificUrl(URL_NS);
        loginPage.login(TEAM_ACCOUNT, PASSWORD);

        //click pe NL
        Thread.sleep(5000);
        basePage.selectLanguage(NL);

        //click log out
        Thread.sleep(5000);
        navBar.presslogout();

        //login cu credentiale gresite
        //verifica mesajul de eroare
        loginPage.checkLoginErrorText(TEAM_ACCOUNT, PASSWORD_WRONG, 1, "Naam of Wachtwoord is niet correct.");

    }

}