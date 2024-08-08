package Tests;

import Utilities.PropertyManger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteContactTest extends BaseTest {
    @Test
      public void deleteContactTest(){
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();
        int initialRowCount=addContactPage.getNumberOfRows();
        contactListPage.clickOnRandomContact();
        contactDetailsPage.clickOnDeleteContactButton();
        contactDetailsPage.acceptDeleteContactAlert();
        int finalRowCount=addContactPage.getNumberOfRows();
    }
}
