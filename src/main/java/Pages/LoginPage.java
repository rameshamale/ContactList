package Pages;

import Utilities.PropertyManger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends Methods {

    public LoginPage(WebDriver driver, WebDriverWait wait, Actions actions ) {
        super(driver, wait, actions);
    }
    By emailIdField = By.id(PropertyManger.userName);
    By passWordField = By.id(PropertyManger.passWord);
    By submitButton = By.id(PropertyManger.submitButton);
    By errorMessage=By.xpath(("(//span[@id='error'])[1]"));


    public void EnterEmail(String UserEmail) {
        sendKeys (emailIdField, UserEmail);}

    public void EnterPassword(String password) {
        sendKeys(passWordField,password);

    }
    public void ClickOnSubmitButton(){
        click(submitButton);
    }
    public String GetErrorrText(){
        return getText(errorMessage);
    }
}
