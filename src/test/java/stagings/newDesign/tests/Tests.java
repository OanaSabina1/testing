package stagings.newDesign.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class Tests {

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
    public void test12() {
        int nr = 80;
        for (int i = 2; i <= 10; i++)
            if (nr % i == 0) System.out.println(i);
    }

    @Test
    public void test13() {
        int nr = 50;
        for (int i = 2; i <= 10; ++i)
            if (nr % i == 0) System.out.println(i);
            else System.out.println("2 nu este divizor");
        for (int i = 3; i <= 10; ++i)
            if (nr % i == 0) System.out.println(i);
            else System.out.println("3 nu este divizor");
    }

    @Test
    public static void assertTrue(){
        Random random = new Random();
        int rand = random.nextInt();
        String x = "Number of manufacturers fetched: " + rand + "\n" +
                "Number of parts fetched: 234";
        String x1 = x.replace("Number of manufacturers fetched: ", "");
        String y = x1.substring(0, x1.indexOf("\n" + "Number of parts fetched"));
        int z = Integer.parseInt(y);
        System.out.println(z);
        boolean w;
        if (z > 0) {
            w = true;
        } else {
            w = false;
        }
        System.out.println(w);
    }
}

//    @Test
//    public void test15(){
//        const str = 'Number of manufacturers fetched: 100\\n +\n Number of parts fetched: 234';
//        const result = str.split('Number of parts fetched')[0];
//        console.log(result);
//    }
