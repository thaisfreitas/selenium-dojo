package selenium.resources.features.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import selenium.resources.pages.IndexPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

public class DummyStepsDefinitions {

    private IndexPage indexPage;

    public DummyStepsDefinitions() {
        this.indexPage = new IndexPage();
    }

    @When("^I access the app$")
    public void I_access_the_app() throws Throwable {
        indexPage.access();
    }

    @Then("^I can see a showcase with several books$")
    public void I_can_see_a_showcase_with_several_books() throws Throwable {
        assertThat(indexPage.getAmountOfBooksOnShowcase(), is(greaterThan(1)));
    }
}
