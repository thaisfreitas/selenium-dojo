package selenium.resources.pages;

import selenium.config.Driver;

public abstract class WebPage {

    public abstract String getUri();

    public void access() {
        Driver.getInstance().get(getUri());
    }

}
