package stagings.newDesign.tests.abc.display;

import org.openqa.selenium.WebDriver;
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
    public void loginWithValidCredentials() throws InterruptedException {
        loginPage.loginFunctionality(URL_NS, TEAM_ACCOUNT, PASSWORD);
    }
}

//    @Test
//    public void loginWithValidCredentialsbvg() throws InterruptedException {
//        loginPage.loginFunctionality("https://newdesign.lcm-client.com/login", "user bvg", "Parola1993!");
//    }

//    @Test
//    public void loginWithValidCredentialsdb() throws InterruptedException {
//        loginPage.loginFunctionality(URL_DB, "team db", "Parola1993!");
//    }

//    @Test
//    public void loginWithValidCredentialscardio() throws InterruptedException {
//        loginPage.loginFunctionality("https://newdesign.lcm-client.com/login", "team cardio", "Parola1993!");
//    }
//
//    @Test
//    public void loginWithValidCredentialsORICE() throws InterruptedException {
//        loginPage.
//                loginFunctionality("https://newdesign.lcm-client.com/login", "user bvg", PASSWORD_WRONG);
//    }

//    @Test
//    public void failedLoginFunctionalityDE() throws InterruptedException {
//        loginPage.failedLoginFunctionality(URL_NS, TEAM_ACCOUNT, PASSWORD_WRONG);
//    }
//}
