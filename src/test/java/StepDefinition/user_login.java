package StepDefinition;

import Base.TestBase;
import PageObject.user_login_locators;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class user_login extends TestBase {

    public int random;

    @And("^I click sign in button$")
    public void iClickSignInButton() {
        user_login_locators page = PageFactory.initElements(driver, user_login_locators.class);
        page.clickSignInLink();
//        driver.findElement(By.linkText("Sign in")).click();
    }

    @And("^I input valid credentials to text boxes$")
    public void iInputValidCredentialsToTextBoxes() {
        user_login_locators page = PageFactory.initElements(driver, user_login_locators.class);
        page.enterUsername();
        page.enterPassword();

//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("tony190uk@yahoo.com");
//        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("testing");
    }
    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        user_login_locators page = PageFactory.initElements(driver, user_login_locators.class);
        page.checkSignInButton();
//        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        user_login_locators page = PageFactory.initElements(driver, user_login_locators.class);
        page.CheckNameLink();
        String ExpectedMessage = "Tony Dan";
        String ActualMessage = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        Assert.assertEquals(ExpectedMessage, ActualMessage);
        System.out.println(ActualMessage);
    }


}
