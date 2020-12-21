package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class existing_user_Locators {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement Sign_inLink;
    @FindBy (how = How.ID, using = "email_create")
    public static WebElement username;
    @FindBy (how = How.NAME, using = "SubmitCreate")
    public static WebElement CreateButton;
    @FindBy (how = How.XPATH, using = "//*[@id=\"create-account_form\"]/div/p")
    public static WebElement seeErrorMessage;
//    @FindBy (how = How.ID, using = "create_account_error")
//    public static WebElement seeErrorMessage;

    public void clickSignInLink(){Sign_inLink.click();}
    public void enterUsername() {username.sendKeys("tony190uk@yahoo.com");}
    public void clickButton() {CreateButton.click();}
    public void anErrorMessage(){seeErrorMessage.getText();}
}
