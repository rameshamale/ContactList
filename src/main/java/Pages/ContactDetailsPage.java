package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetailsPage extends Methods {
    By editContactButton=By.id("edit-contact");
    By deleteContacButton=By.cssSelector("#delete");

    public ContactDetailsPage(WebDriver driver, WebDriverWait wait, Actions actions){
        super(driver,wait,actions);}

    public void clickOnEditButton(){
        click(editContactButton);}

    public void clickOnDeleteContactButton(){
        click(deleteContacButton);
    }
    public void acceptDeleteContactAlert(){
        alertIsPresent();
        switchToAlert().accept();
    }

}
