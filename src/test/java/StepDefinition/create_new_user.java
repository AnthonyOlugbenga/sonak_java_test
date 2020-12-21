package StepDefinition;

import Base.TestBase;
import PageObject.create_new_user_ocators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class create_new_user extends TestBase {


    @And("^I click on Sign in button$")
    public void iClickOnSignInButton() {
        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.clickSignInLink();
    }

    @And("^I enter valid email address$")
    public void iEnterValidEmailAddress() throws InterruptedException {

        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.enterUsername(); }

    @And("^I click on create account button$")
    public void iClickOnCreateAccountButton() {
        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.typeCreateButton(); }

    @When("^I entered all mandatory details$")
    public void iEnteredAllMandatoryDetails() throws InterruptedException {
        Thread.sleep(2000);
        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.clickGenButton();
        page.CheckFirstName();
        page.LastNameButton();
        page.enterEmailAddress();
        page.passwordButton();

        page.clickCheckBox();
        page.clearAddressButton();
        page.clickAddressButton();
        page.clearLastNameAddress();
        page.LastNameAddress();
        page.CheckEnterCompany();
        page.clickTextAddress();
        page.cityButton();
        page.CustomerSelectState();
        page.postalButton();
        page.textPhoneButton();
        page.clearCustomerAlias();
        page.textEnterAlias();
    }

    @And("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.textRegister();
    }

    @Then("^My account should be registered successfully$")
    public void myAccountShouldBeRegisteredSuccessfully() {
        create_new_user_ocators page = PageFactory.initElements(driver, create_new_user_ocators.class);
        page.ConfirmMessage();
        String ExpectedMessage = "MY ACCOUNT";
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        System.out.println(ActualMessage);
    }
}
