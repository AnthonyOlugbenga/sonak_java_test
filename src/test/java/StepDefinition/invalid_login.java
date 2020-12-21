package StepDefinition;

import Base.TestBase;
import PageObject.invalid_login_locators;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class invalid_login extends TestBase {

    @And("^I click the Sign in button$")
    public void iClickTheSignInButton() {
        invalid_login_locators page = PageFactory.initElements(driver, invalid_login_locators.class);
        page.clickSignInLink();

    }

    @And("^I enter Invalid credentials$")
    public void iEnterInvalidCredentials() {
        invalid_login_locators page = PageFactory.initElements(driver, invalid_login_locators.class);
        page.enterPassword();
        page.enterUsername();
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        invalid_login_locators page = PageFactory.initElements(driver, invalid_login_locators.class);
        page.clickSignIn();
    }

    @Then("^error message should be displayed$")
    public void errorMessageShouldBeDisplayed() {
        invalid_login_locators page = PageFactory.initElements(driver, invalid_login_locators.class);
        page.CheckErrorMessage();
        String  ExpectedErrorMessage = "There is 1 error\n" + "Authentication failed.";
        String  ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);
   }


}
