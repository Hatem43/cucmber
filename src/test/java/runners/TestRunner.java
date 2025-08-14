package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="E:\\cucumber\\src\\test\\resources\\features\\login.feature",
        glue = {"StepDefinitions"},
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        monochrome = true
)

public class TestRunner {

}
