package StepDefinitions;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class invalidusernameandvalidpasswordloginSteps {
    SHAFT.GUI.WebDriver driver;
    By username= By.xpath("//input[@id='id-Username']");
    By password=By.xpath("//input[@id='id-Password']");
    By login=By.xpath("//button[@type='submit']");

    @Given("I enter the login page")
    public void i_am_in_a_login_page() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }
    @When("I enter invalid username and valid password")
    public void I_enter_invalid_username_and_valid_password() {
        driver.element().type(username,"sss");
        driver.element().type(password,"qqE6)Cxp6>B8");
        driver.element().click(login);

    }
    @Then("I am still in login page")
    public void i_am_still_in_login_page() {
        String actual=driver.browser().getCurrentURL();
        String expected="http://192.168.1.70/auth/login";
        Assert.assertEquals(actual,expected);
    }
}
