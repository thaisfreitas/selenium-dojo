package selenium.resources.features.steps;

import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MainSteps {

    @Then("^it works")
    public void wat() throws Throwable {
        assertThat(true, is(true));
    }

}
