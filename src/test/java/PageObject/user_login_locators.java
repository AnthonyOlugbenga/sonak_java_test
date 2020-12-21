package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class user_login_locators {
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public static WebElement Sign_inLink;
    @FindBy (how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement username;
    @FindBy (how = How.XPATH, using = "//*[@id=\"passwd\"]")
    public static WebElement login_password;
    @FindBy (how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement SignInButton;
    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]")
    public static WebElement NameLink;

    public void clickSignInLink(){Sign_inLink.click();}
    public void enterUsername() {username.sendKeys("tony190uk@yahoo.com");}
    public void enterPassword(){login_password.sendKeys("testing");}
    public void checkSignInButton() {SignInButton.click();}
    public void CheckNameLink(){NameLink.getText();}
}
