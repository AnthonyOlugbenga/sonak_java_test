package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;

public class create_new_user_ocators {
    public int random;
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement SignInLink;
    @FindBy (how = How.ID, using = "email_create")
    public static WebElement userEmail;
    @FindBy (how = How.NAME, using = "SubmitCreate")
    public static WebElement createButton;
    @FindBy (how = How.ID, using = "id_gender2")
    public static WebElement clickGender;
    @FindBy(how = How.ID, using = "customer_firstname")
    public static WebElement enterFirstName;
    @FindBy (how = How.ID, using = "customer_lastname")
    public static WebElement enterLastName;
    @FindBy (how = How.ID, using = "email")
    public static WebElement enterEmail;
    @FindBy (how = How.ID, using = "passwd")
    public static WebElement textPassword;


    @FindBy (how = How.XPATH, using = "//*[@id=\"optin\"]")
    public static WebElement checkBox;
    @FindBy(how = How.ID, using = "firstname")
    public static WebElement ClearFirstName;
    @FindBy(how = How.ID, using = "firstname")
    public static WebElement addressFirstName;
    @FindBy(how = How.ID, using = "lastname")
    public static WebElement ClearLastName;
    @FindBy (how = How.ID, using = "lastname")
    public static WebElement addressLastName;
    @FindBy (how = How.ID, using = "company")
    public static WebElement enterCompany;
    @FindBy (how = How.ID, using = "address1")
    public static WebElement textAddress;
    @FindBy (how = How.ID, using = "city")
    public static WebElement enterCity;
    @FindBy(how = How.ID, using = "id_state")
    public static WebElement State;
    @FindBy (how = How.ID, using = "postcode")
    public static WebElement enterPostcode;
    @FindBy (how = How.ID, using = "phone_mobile")
    public static WebElement textPhone;
    @FindBy(how = How.ID, using = "alias")
    public static WebElement clearCustomerAlias;
    @FindBy (how = How.ID, using = "alias")
    public static WebElement enterAlias;
    @FindBy (how = How.XPATH, using = "//*[@id=\"submitAccount\"]/span")
    public static WebElement enterRegister;
    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/h1")
    public static WebElement ConfirmationMessage;

    public void clickSignInLink(){SignInLink.click();}
    public void enterUsername(){
        random = 100 + (int)(Math.random()*((1000 - 1) + 1));
        userEmail.sendKeys("emmaSona100" + random + "@gmail.com");}
    public void typeCreateButton() {createButton.click();}
    public void clickGenButton() {clickGender.click();}
    public void CheckFirstName(){enterFirstName.sendKeys("Johnson");}
    public void LastNameButton() {enterLastName.sendKeys("Elizabeth");}
    public void enterEmailAddress(){enterEmail.sendKeys();}
    public void passwordButton() {textPassword.sendKeys("testing");}



    public void clickCheckBox(){checkBox.click();}
    public void clearAddressButton() {ClearFirstName.clear();}
    public void clickAddressButton() {addressFirstName.sendKeys("Johnson");}
    public void clearLastNameAddress() {ClearLastName.clear();}
    public void LastNameAddress(){addressLastName.sendKeys("Elizabeth");}
    public void CheckEnterCompany() {enterCompany.sendKeys("Creative Marketing");}
    public void clickTextAddress(){ textAddress.sendKeys("Silitie 2A, Espoo");}
    public void cityButton() {enterCity.sendKeys("Chicago");}
    public void CustomerSelectState(){
        Select state = new Select(State); state.selectByVisibleText("Illinois"); }
    public void postalButton(){enterPostcode.sendKeys("12345");}
    public void textPhoneButton() {textPhone.sendKeys("0442365560");}
    public void clearCustomerAlias() {clearCustomerAlias.clear();}
    public void textEnterAlias(){enterAlias.sendKeys("Lion King");}
    public void textRegister(){enterRegister.click();}
    public void ConfirmMessage(){ConfirmationMessage.getText();}

}
