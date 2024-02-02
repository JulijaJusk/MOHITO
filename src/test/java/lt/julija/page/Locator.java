package lt.julija.page;

import org.openqa.selenium.By;

public class Locator {
    public static class Mohito {
        public static class AccountRegistration {

            public static By buttonAcceptCookies = By.xpath("//button[@id='cookiebotDialogOkButton']");
            public static By buttonEnterRegistration = By
                    .xpath("//button[@data-selen='register-select']");
            public static By inputEmail = By
                    .xpath("//input[@id='email_id']");
            public static By inputName = By.xpath("//input[@id='firstname_id']");
            public static By inputLastName = By.xpath("//input[@id='lastname_id']");
            public static By inputPassword = By.xpath("//input[@id='password_id']");
            public static By buttonCreateAccount = By
                    .xpath("//button[@data-selen='create-account-submit']");
            public static By paragraphReadAccountName = By
                    .xpath("//div[@data-testid='account-info-logged-true']//p");
        }

        public static class AccountLogin {
            public static By inputEmail = By.xpath("//input[@id='login[username]_id']");
            public static By inputPassword = By.xpath("//input[@id='login[password]_id']");
            public static By buttonLogin = By.xpath("//button[@data-selen='login-submit']");
            public static By paragraphReadAccountName = By
                    .xpath("//div[@data-testid='account-info-logged-true']//p");
        }

        public static class AccountRemoval {

            public static By buttonAcceptCookies = By.xpath("//button[@id='cookiebotDialogOkButton']");
            public static By inputEmail = By.xpath("//input[@id='login[username]_id']");
            public static By inputPassword = By.xpath("//input[@id='login[password]_id']");
            public static By buttonLogin = By.xpath("//button[@data-selen='login-submit']");
            public static By paragraphReadAccountName = By
                    .xpath("//div[@data-testid='account-info-logged-true']//p");
            public static By buttonAccountDetails = By.
                    xpath("//div[@data-testid='account-info-logged-true']//p");
            public static By activeAccountRemovalLink = By
                    .xpath(
                            "//a[@href='https://www.mohito.com/lt/lt/account-management/accountRemoval/firststep/']");
            public static By buttonAccountRemovalHere = By.xpath("//div[@id='main']//a");
            public static By paragraphReadAccountRemoval = By
                    .xpath("//div[@class='customer-remove']//h2");
        }
    }
}
