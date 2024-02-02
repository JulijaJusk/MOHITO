package lt.julija.page.mohito;

import lt.julija.page.Common;
import lt.julija.page.Locator;
import lt.julija.page.PageBase;

public class AccountRemovalPage extends PageBase {

    public static void refreshWebPage(int sec) {
        Common.refreshPage(sec);
    }

    public static void clickOnButtonAcceptCookies() {
        Common.waitElementVisible(Locator.Mohito.AccountRemoval.buttonAcceptCookies, 6);
        Common.clickOnElement(Locator.Mohito.AccountRemoval.buttonAcceptCookies);
    }

    public static void enterEmail(String email) {
        Common.waitElementVisible(Locator.Mohito.AccountRemoval.inputEmail, 8);
        Common.sendKeysToElement(Locator.Mohito.AccountRemoval.inputEmail, email);
    }

    public static void enterPassword(String password) {
        Common.sendKeysToElement(Locator.Mohito.AccountRemoval.inputPassword, password);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Mohito.AccountRemoval.buttonLogin);
    }

    public static void readAccountName() {
        Common.waitElementVisible(Locator.Mohito.AccountRemoval.paragraphReadAccountName, 8);
        Common.getTextFromElement(Locator.Mohito.AccountLogin.paragraphReadAccountName);
    }

    public static void clickOnUserButton() {
        Common.clickOnElement(Locator.Mohito.AccountRemoval.buttonAccountDetails);
    }

    public static void clickOnAccountRemovalActiveLink() {
        Common.clickOnElement(Locator.Mohito.AccountRemoval.activeAccountRemovalLink);
    }

    public static void clickOnButtonRemoveAccountHere() {
        Common.clickOnElement(Locator.Mohito.AccountRemoval.buttonAccountRemovalHere);
    }

    public static String readRemovalConfirmation() {
        Common.waitElementVisible(Locator.Mohito.AccountRemoval.paragraphReadAccountRemoval, 8);
        return Common.getTextFromElement(Locator.Mohito.AccountRemoval.paragraphReadAccountRemoval);
    }
}
