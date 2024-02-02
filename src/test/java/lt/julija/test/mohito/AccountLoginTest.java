package lt.julija.test.mohito;

import lt.julija.page.mohito.AccountLoginPage;
import lt.julija.page.mohito.AccountRegistrationPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountLoginTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AccountLoginPage.open("https://www.mohito.com/lt/lt/customer/account/login/", 8);
        AccountLoginPage.clickOnButtonAcceptCookies();
        AccountLoginPage.refreshWebPage(7);
    }

    @Test
    public void testEnterValidLoginDetails(){
        String email = "julijazbarauskaite3d@gmail.com";
        String password = "Vasara24*";
        String expectedResult = "Julija";
        String actualResult;

        AccountLoginPage.enterEmail(email);
        AccountLoginPage.enterPassword(password);
        AccountLoginPage.clickOnButtonLogin();
        actualResult = AccountLoginPage.readAccountName();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
