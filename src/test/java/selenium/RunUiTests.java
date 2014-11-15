package selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/selenium/resources/features",
        plugin = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt"}
)
public class RunUiTests {}
