package Tests;

import Pages.*;
import Utilities.PropertyManger;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Locale;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    Actions actions;
    public AddcontactList addContactPage;
    public AddUser addUser;
    public LoginPage loginPage;
    public ContactDetailsPage contactDetailsPage;
    public ContactListPage contactListPage;
    public EditContactPage editContactPage;
    public SoftAssert softAssert;
    public Faker ukFaker;
    public Faker faker;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions = new Actions(driver);
        driver.get(PropertyManger.getInstance().getUrl());
        loginPage=new LoginPage(driver, wait, actions);
        addUser=new AddUser(driver,wait,actions);
        addContactPage=new AddcontactList(driver,wait,actions);
        contactListPage=new ContactListPage(driver,wait,actions);
        contactDetailsPage=new ContactDetailsPage(driver,wait,actions);
        editContactPage=new EditContactPage(driver,wait,actions);

        ukFaker=new Faker(new Locale("en-GB"));
        faker=new Faker();
        softAssert = new SoftAssert();


    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
