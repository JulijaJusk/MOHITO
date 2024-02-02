package lt.julija.page.mohito;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

public class AccountRegistrationPage extends PageBase {

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Mohito.AccountRegistration.buttonAcceptCookies, 6);
        Common.clickOnElement(Locator.Mohito.AccountRegistration.buttonAcceptCookies);
    }

    public static void clickOnButtonRegistration() {
        Common.clickOnElement(Locator.Mohito.AccountRegistration.buttonEnterRegistration);
    }

    public static void enterEmail(String email) {
        Common.waitElementVisible(Locator.Mohito.AccountRegistration.inputEmail, 8);
        Common.sendKeysToElement(Locator.Mohito.AccountRegistration.inputEmail, email);
    }

    public static void enterName(String name) {
        Common.sendKeysToElement(Locator.Mohito.AccountRegistration.inputName, name);
    }

    public static void enterLastName(String lastName) {
        Common.sendKeysToElement(Locator.Mohito.AccountRegistration.inputLastName, lastName);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Mohito.AccountRegistration.inputPassword, password);
    }

    public static void clickOnButtonCreateAccount() {
        Common.clickOnElement(Locator.Mohito.AccountRegistration.buttonCreateAccount);
    }

    public static String readAccountName() {
        Common.waitElementVisible(Locator.Mohito.AccountRegistration.paragraphReadAccountName, 8);
        return Common.getTextFromElement(Locator.Mohito.AccountRegistration.paragraphReadAccountName);
    }
}
