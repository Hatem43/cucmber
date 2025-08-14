package StepDefinitions;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;


public class validLoginSteps {

    SHAFT.GUI.WebDriver driver;
    By username= By.xpath("//input[@id='id-Username']");
    By password=By.xpath("//input[@id='id-Password']");
    By login=By.xpath("//button[@type='submit']");

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
       driver.element().type(username,"e.saady");
       driver.element().type(password,"qqE6)Cxp6>B8");
       driver.element().click(login);

    }
    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
      String actual=driver.browser().getCurrentURL();
      String expected="http://192.168.1.70/auth/login";
      Assert.assertEquals(actual,expected);
    }

}