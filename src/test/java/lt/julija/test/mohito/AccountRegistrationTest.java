package lt.julija.test.mohito;

import lt.julija.page.mohito.AccountRegistrationPage;
import lt.julija.test.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountRegistrationTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        AccountRegistrationPage.open("https://www.mohito.com/lt/lt/customer/account/login/", 8);
        AccountRegistrationPage.clickOnButtonAcceptCookies();
        AccountRegistrationPage.clickOnButtonRegistration();
    }

    @Test
    public void testEnterValidUserInformation(){
        String email = "julijazbarauskaite3d@gmail.com";
        String name = "Julija";
        String lastName = "Juskeviciene";
        String password = "Vasara24*";
        String expectedResult = "Julija";
        String actualResult;

        AccountRegistrationPage.enterEmail(email);
        AccountRegistrationPage.enterName (name);
        AccountRegistrationPage.enterLastName(lastName);
        AccountRegistrationPage.enterPassword(password);
        AccountRegistrationPage.clickOnButtonCreateAccount();
        actualResult = AccountRegistrationPage.readAccountName();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                "\nExpected result: %s\nActual result: %s".formatted(expectedResult, actualResult)
        );
    }
}
