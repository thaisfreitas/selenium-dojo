package selenium.resources.pages;

import static selenium.config.UriGenerator.generateUri;

public class AdminPage extends WebPage {

    private static final String PATH = "/admin";

    @Override
    public String getUri() {
        return generateUri(PATH);
    }
}
