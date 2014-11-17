package selenium.resources.features.steps;

import cucumber.api.java.After;
import selenium.config.Driver;

public class TestPreparation {

    @After
    public void tearDown() {
        Driver.shutdown();
    }
}
