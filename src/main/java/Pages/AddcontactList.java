package Pages;

import Utilities.PropertyManger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddcontactList extends Methods {
    By contactTable=By.xpath("//table[@class='contactTable']");
    By addNewContactButton=By.id(PropertyManger.addNewContact);
    By firstNameField = By.cssSelector(PropertyManger.firstName);
    By lastNameField = By.xpath(PropertyManger.lastName);
    By birthdateField = By.xpath(PropertyManger.birthdate);
    By emailField = By.xpath(PropertyManger.email);
    By phoneField = By.cssSelector(PropertyManger.phone);
    By street1Field = By.cssSelector(PropertyManger.street1);
    By street2Field = By.cssSelector(PropertyManger.street2);
    By cityField = By.cssSelector(PropertyManger.city);
    By stateProvinceField = By.cssSelector(PropertyManger.stateProvince);
    By postalCodeField = By.cssSelector(PropertyManger.postalCode);
    By countryField = By.cssSelector(PropertyManger.country);
    By submitButton=By.xpath("//button[@id='submit']");

    public AddcontactList(WebDriver driver, WebDriverWait wait , Actions actions){
        super(driver,wait,actions);
    }
    public int getNumberOfRows(){
        WebElement conetactTable=element(contactTable);
        List<WebElement> rowBefore=conetactTable.findElements(By.tagName("tr"));
        return rowBefore.size();
    }
    public void clickOnAddNewContactButton(){
        click(addNewContactButton);
    }
    public void enterFirstName(String firstName) {
        click(firstNameField);
        sendKeys(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeys(lastNameField, lastName);
    }

    public void enterBirthdate(String birthdate) {
        sendKeys(birthdateField, birthdate);
    }

    public void enterEmail(String email) {
        sendKeys(emailField, email);
    }

    public void enterPhone(String phone) {
        sendKeys(phoneField, phone);
    }

    public void enterStreet1(String street1) {
        sendKeys(street1Field, street1);
    }

    public void enterStreet2(String street2) {
        sendKeys(street2Field, street2);
    }

    public void enterCity(String city) {
        sendKeys(cityField, city);
    }

    public void enterStateProvince(String stateProvince) {
        sendKeys(stateProvinceField, stateProvince);
    }

    public void enterPostalCode(String postalCode) {
        sendKeys(postalCodeField, postalCode);
    }

    public void enterCountry(String country) {
        sendKeys(countryField, country);
    }

    public void clickcOnSubmitButton(){
        click(submitButton);
    }

}



