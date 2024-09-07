package Tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class AddUserTest extends BaseTest {

    @Test
    public void addNewuser() throws InterruptedException {
        String fakerName=ukFaker.name().firstName();
        String fakerLastName=ukFaker.name().lastName();
        String fakerEmail=ukFaker.name().username().toLowerCase(Locale.ROOT);

        addUser.clickSignButton();
        addUser.enterFirstName(fakerLastName);
        addUser.enterLastName(fakerLastName);
        addUser.enterEmail(fakerEmail+"@test.com");
        addUser.enterPassword("Test@123");
        addUser.clickSubmitButton();
        wait.until(ExpectedConditions.urlContains("https://thinking-tester-contact-list.herokuapp.com/contactList"));
        softAssert.assertTrue(driver.getCurrentUrl().equals("https://thinking-tester-contact-list.herokuapp.com/contactList"), "Redirection to login page failed.");

    }
    @Test
    public void adduserWithInvalidEmail(){
        addUser.clickSignButton();
        addUser.enterFirstName("Ramesh");
        addUser.enterLastName("Amale");
        addUser.enterEmail("rameshamale51gmail.com");
        addUser.enterPassword("Test@123");
        addUser.clickSubmitButton();
        addUser.verifyErrrorMessage();
        Assert.assertEquals(addUser.verifyErrrorMessage(),"User validation failed: email: Email is invalid");

    }
}
