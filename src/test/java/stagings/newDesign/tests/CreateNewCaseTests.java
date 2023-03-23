package stagings.newDesign.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stagings.newDesign.pages.LoginPage;
import stagings.newDesign.pages.MainMenu;
import stagings.newDesign.pages.NavBar;
import utils.BasePage;
import utils.BaseTest;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.openqa.selenium.net.LinuxEphemeralPortRangeDetector.getInstance;
import static utils.Constants.*;

public class CreateNewCaseTests {

    @BeforeMethod
    public void setUp() throws IOException {
    }

//    @Test
//    public void login() throws InterruptedException {
//        loginPage.openSpecificUrl(URL_NS);
//        loginPage.login(TEAM_ACCOUNT, PASSWORD);
//    }

    @Test
    public void test1() {
        System.out.println("Hey");
    }

    @Test
    public void test2() {
        double x = 2.2;
        double y = 2;
        double number = (Math.pow(x, y));
        System.out.printf("Se afiseaza doar primele 2 zecimale din numar %.2f\n", number);
    }

    @Test
    public void test3() {
        String x = "casa";
        String y = "as";
        if (x.contains(y)) {
            System.out.println("String " + y + " is contained in String " + x + "");
        } else {
            System.out.println("String " + y + " is not contained in String " + x + "");
        }
    }

    @Test
    public void test4() {
        String x = "casa";
        String y = "as";
        String result = x + y;
//        System.out.println(result);
        String resultnew = result.replace("a", "");
        System.out.println(resultnew);
    }

    @Test
    public void test5() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void test6() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i + " ");
        }
    }

    @Test
    public void test7() {
        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i + " ");

        }
    }

    @Test
    public void test8() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i + " ");
        }
    }

    @Test
    public void test9() {
        int sum = 0;
        for (int i = 0; i <= 10; ++i) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    @Test
    public void test10() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 100);
    }

    @Test
    public void test11() {
        double smallBase = -2;
        double bigBase = -5;
        double height = 1.5;
        if ((smallBase > 0) && (bigBase > 0) && (height > 0)) {
            double area = ((smallBase + bigBase) * height) / 2;
            System.out.println("The Area of trapezium is " + area);
        } else {
            System.out.println(("One of the values is negative, therefore the value can not be calculated"));
        }
    }

    @Test
    public void test12(){
    int x = 0;
    int y = getInstance(int 1,int 10);
    }
}
