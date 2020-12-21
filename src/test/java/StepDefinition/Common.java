package StepDefinition;

import Base.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Common extends TestBase {

    @Before
    public void setup() throws Throwable {
        initialize();
    }

    @Given("^I am on application page$")
    public void iAmOnApplicationPage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

}
