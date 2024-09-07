package Tests;

import Utilities.PropertyManger;
import org.testng.annotations.Test;

public class editContactTest extends BaseTest {

    @Test
    public void editFirstNameTest() throws InterruptedException {
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();
        contactListPage.clickOnRandomContact();
        contactDetailsPage.clickOnEditButton();
        editContactPage.setFirstName("Siddhi");
        editContactPage.clickOnSubmitButton();
        Thread.sleep(20000);

    }
}
