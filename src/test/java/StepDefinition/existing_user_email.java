package StepDefinition;

import Base.TestBase;
import PageObject.existing_user_Locators;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class existing_user_email extends TestBase {

    @And("^I click on Sign in link text$")
    public void iClickOnSignInLinkText() {
        existing_user_Locators page = PageFactory.initElements(driver, existing_user_Locators.class);
        page.clickSignInLink(); }

    @And("^I enter existing email address$")
    public void iEnterExistingEmailAddress() {
        existing_user_Locators page = PageFactory.initElements(driver, existing_user_Locators.class);
        page.enterUsername(); }

    @When("^I click the create an account button$")
    public void iClickTheCreateAnAccountButton() {
        existing_user_Locators page = PageFactory.initElements(driver, existing_user_Locators.class);
        page.clickButton(); }

    @Then("^I should get an error message$")
    public void iShouldGetAnErrorMessage() {
        existing_user_Locators page = PageFactory.initElements(driver, existing_user_Locators.class);
        page.anErrorMessage();
        String  ExpectedError = "Please enter your email address to create an account.";
        String  ActualError = driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/p")).getText();
        Assert.assertEquals(ExpectedError, ActualError);
        System.out.println(ActualError); }
}
