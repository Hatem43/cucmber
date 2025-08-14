package StepDefinitions;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;


public class invalidLoginSteps {

    SHAFT.GUI.WebDriver driver;
    By username= By.xpath("//input[@id='id-Username']");
    By password=By.xpath("//input[@id='id-Password']");
    By login=By.xpath("//button[@type='submit']");

    @Given("I am in the login page")
    public void i_am_in_the_login_page() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }
    @When("I enter invalid credentials")
    public void I_enter_invalid_credentials() {
        driver.element().type(username,"e.saady");
        driver.element().type(password,"sss");
        driver.element().click(login);

    }
    @Then("I still in login page")
    public void i_still_in_login_page() {
        String actual=driver.browser().getCurrentURL();
        String expected="http://192.168.1.70/auth/login";
        Assert.assertEquals(actual,expected);
    }

}