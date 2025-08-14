package StepDefinitions;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class validusernameandinvalidpasswordloginSteps {
    SHAFT.GUI.WebDriver driver;
    By username= By.xpath("//input[@id='id-Username']");
    By password=By.xpath("//input[@id='id-Password']");
    By login=By.xpath("//button[@type='submit']");

    @Given("I am in a login page")
    public void i_am_in_a_login_page() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }
    @When("I enter valid username and  invalid password")
    public void I_enter_valid_username_and_invalid_password() {
        driver.element().type(username,"e.saady");
        driver.element().type(password,"sss");
        driver.element().click(login);

    }
    @Then("I will be in login page")
    public void i_will_be_login_page() {
        String actual=driver.browser().getCurrentURL();
        String expected="http://192.168.1.70/auth/login";
        Assert.assertEquals(actual,expected);
    }
}
