package StepDefinition;

import Base.TestBase;
import PageObject.forgot_password_locators;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class forgot_password extends TestBase {

    @And("^I click on the Sign in link$")
    public void iClickOnTheSignInLink() {
        forgot_password_locators page = PageFactory.initElements(driver, forgot_password_locators.class);
        page.clickSignInLink();
//        driver.findElement(By.linkText("Sign in")).click();
    }
    @When("^I click on the Forgot your password link$")
    public void iClickOnTheForgotYourPasswordLink() {
        forgot_password_locators page = PageFactory.initElements(driver, forgot_password_locators.class);
        page.clickForgotLink();
//        driver.findElement(By.linkText("Forgot your password?")).click();
    }
    @And("^I enter my email address in text field$")
    public void iEnterMyEmailAddressInTextField() {
        forgot_password_locators page = PageFactory.initElements(driver, forgot_password_locators.class);
        page.enterEmail();
//        driver.findElement(By.id("email")).sendKeys("tony190uk@yahoo.com");
    }
    @When("^I click on the retrieve password button$")
    public void iClickOnTheRetrievePasswordButton() {
        forgot_password_locators page = PageFactory.initElements(driver, forgot_password_locators.class);
        page.clickRetrieve();
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();
    }
    @Then("^I should get a success message$")
    public void iShouldGetASuccessMessage() {
        forgot_password_locators page = PageFactory.initElements(driver, forgot_password_locators.class);
        page.checkError();
        String  ExpectedMessage = "A confirmation email has been sent to your address: tony190uk@yahoo.com";
        String  ActualMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p")).isDisplayed();


    }
    }

