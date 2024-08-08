package Tests;

import Utilities.PropertyManger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest    {

    @Test
    public void loginWithValidLoginDetails(){
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();
        Assert.assertEquals(driver.getTitle(),"Contact List App");
    }
    @Test
    public void loginWithInValidEmail(){
        loginPage.EnterEmail(PropertyManger.invalidUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();
        String ActulResult=loginPage.GetErrorrText();
        Assert.assertEquals(ActulResult,"Incorrect username or password");

    }
    @Test
    public void loginWithInValidPassword(){
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.invalidPassword);
        loginPage.ClickOnSubmitButton();
        String ActulResult=loginPage.GetErrorrText();
//        Assert.assertEquals(ActulResult,"Incorrect username or password");

    }
    @Test
    public void loginWithInValidLoginDeatils(){
        loginPage.EnterEmail(PropertyManger.invalidUsername);
        loginPage.EnterPassword(PropertyManger.invalidPassword);
        loginPage.ClickOnSubmitButton();
        String ActulResult=loginPage.GetErrorrText();
        Assert.assertEquals(ActulResult,"Incorrect username or password");

    }

}
