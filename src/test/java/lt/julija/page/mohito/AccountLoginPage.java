package lt.julija.page.mohito;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

public class AccountLoginPage extends PageBase {

    public static void refreshWebPage(int sec) {
        Common.refreshPage(sec);
    }

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Mohito.AccountRegistration.buttonAcceptCookies, 6);
        Common.clickOnElement(Locator.Mohito.AccountRegistration.buttonAcceptCookies);
    }

    public static void enterEmail(String email) {
        Common.waitElementVisible(Locator.Mohito.AccountLogin.inputEmail, 8);
        Common.sendKeysToElement(Locator.Mohito.AccountLogin.inputEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Mohito.AccountLogin.inputPassword, password);
    }

    public static String readAccountName() {
        Common.waitElementVisible(Locator.Mohito.AccountLogin.paragraphReadAccountName, 8);
        return Common.getTextFromElement(Locator.Mohito.AccountLogin.paragraphReadAccountName);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Mohito.AccountLogin.buttonLogin);
    }
}
