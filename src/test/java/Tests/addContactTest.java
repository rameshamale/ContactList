package Tests;

import Utilities.PropertyManger;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class addContactTest extends BaseTest {


    @Test
    public void testCreateNewContactForm() {
        // Generate fake data
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        Date dateOfBirth = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateOfBirth = dateFormat.format(dateOfBirth);
        String email = faker.internet().emailAddress();
        String phone = faker.number().digits(10);
        String street1 = faker.address().streetAddress();
        String street2 = faker.address().secondaryAddress();
        String city = faker.address().city();
        String stateProvince = faker.address().state();
        String postalCode = faker.address().zipCode();
        String country = faker.address().country();

        // Enter data into the form
        loginPage.EnterEmail(PropertyManger.validUsername);
        loginPage.EnterPassword(PropertyManger.validPassword);
        loginPage.ClickOnSubmitButton();

        System.out.println(addContactPage.getNumberOfRows());
        addContactPage.clickOnAddNewContactButton();
        addContactPage.enterFirstName(firstName);
        addContactPage.enterLastName(lastName);
        addContactPage.enterBirthdate(formattedDateOfBirth);
        addContactPage.enterEmail(email);
        addContactPage.enterPhone(phone);
        addContactPage.enterStreet1(street1);
        addContactPage.enterStreet2(street2);
        addContactPage.enterCity(city);
        addContactPage.enterStateProvince(stateProvince);
        addContactPage.enterPostalCode(postalCode);
        addContactPage.enterCountry(country);
        addContactPage.clickcOnSubmitButton();
        System.out.println(addContactPage.getNumberOfRows());
    }

}
