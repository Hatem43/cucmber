package StepDefinitions;

import com.shaft.driver.SHAFT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class validwithoutloginbuttonLoginSteps {

    SHAFT.GUI.WebDriver driver;
    By username= By.xpath("//input[@id='id-Username']");
    By password=By.xpath("//input[@id='id-Password']");


    @Given("Iam entering the login page")
    public void i_am_entering_the_login_page() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {
       driver.element().type(username,"e.saady");
       driver.element().type(password,"qqE6)Cxp6>B8");

    }
    @Then("I remain in login page")
    public void i_remain_in_the_login_page() {
      String actual=driver.browser().getCurrentURL();
      String expected="http://192.168.1.70/auth/login";
      Assert.assertEquals(actual,expected);
    }

}