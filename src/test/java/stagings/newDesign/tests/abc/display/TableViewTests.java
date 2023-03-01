package stagings.newDesign.tests.abc.display;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stagings.newDesign.pages.*;
import utils.BaseTest;


import java.io.IOException;

import static utils.Constants.*;

public class TableViewTests extends BaseTest {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() throws IOException {
        WebDriver driver = initializeDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void failedLoginFunctionality() throws InterruptedException {
        loginPage.openSpecificUrl(URL_NS);
        loginPage.checkLoginErrorText(TEAM_ACCOUNT, PASSWORD_WRONG, 2, "Name oder Passwort ist falsch.");
        loginPage.checkLoginErrorText(TEAM_ACCOUNT, PASSWORD_WRONG, 3, "Name or password is incorrect.");

    }

    @Test
    public void checkNLErrorForLogin() {
        //login cu credentiale corecte
        loginPage.openSpecificUrl(URL_NS);
        loginPage.login(TEAM_ACCOUNT, PASSWORD);

        //scroll pana la footer

        //click pe NL
        //scroll pana dai de log out button
        //click log out
        //login cu credentiale gresite
        //verifica mesajul de eroare
    }
}