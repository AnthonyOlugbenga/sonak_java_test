package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class forgot_password_locators {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement Sign_inLink;
    @FindBy (how = How.LINK_TEXT, using = "Forgot your password?")
    public static WebElement ForgotLink;
    @FindBy (how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement EnterEmail;
    @FindBy (how = How.XPATH, using = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")
    public static WebElement RetrieveButton;
    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/div/p")
    public static WebElement ErrorMessage;



    public void clickSignInLink(){Sign_inLink.click();}
    public void clickForgotLink(){ForgotLink.click();}
    public void enterEmail() {EnterEmail.sendKeys("tony190uk@yahoo.com");}
    public void clickRetrieve() {RetrieveButton.click();}
    public void checkError(){ErrorMessage.getText();}


}
