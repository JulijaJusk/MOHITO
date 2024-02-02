package lt.julija.test.mohito;

import lt.julija.page.Locator;
import lt.julija.page.mohito.AccountLoginPage;
import lt.julija.page.mohito.AccountRegistrationPage;
import lt.julija.page.mohito.AccountRemovalPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountRemovalTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AccountRemovalPage.open("https://www.mohito.com/lt/lt/customer/account/login/", 8);
        AccountRemovalPage.clickOnButtonAcceptCookies();
        AccountRemovalPage.refreshWebPage(7);
    }

    @Test
    public void testRemoveAccount() {
        String email = "julijazbarauskaite3d@gmail.com";
        String password = "Vasara24*";
        String expectedResult = "PASKYRA NAIKINAMA";
        String actualResult;

        AccountRemovalPage.enterEmail(email);
        AccountRemovalPage.enterPassword(password);
        AccountRemovalPage.clickOnButtonLogin();
        AccountRemovalPage.readAccountName();
        AccountRemovalPage.clickOnUserButton();
        AccountRemovalPage.clickOnAccountRemovalActiveLink();
        AccountRemovalPage.clickOnButtonRemoveAccountHere();
        actualResult = AccountRemovalPage.readRemovalConfirmation();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
