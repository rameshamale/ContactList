package Tests;

import Utilities.PropertyManger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void LogoutTest() throws InterruptedException {
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();
        contactListPage.clickOnLogoutButton();
        wait.until(ExpectedConditions.urlContains("https://thinking-tester-contact-list.herokuapp.com"));
        softAssert.assertTrue(driver.getCurrentUrl().equals("https://thinking-tester-contact-list.herokuapp.com"), "Redirection to login page failed.");
    }
}
