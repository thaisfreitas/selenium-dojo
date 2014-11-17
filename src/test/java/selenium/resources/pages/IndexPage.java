package selenium.resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.config.Driver;

import java.util.List;

import static selenium.config.UriGenerator.generateUri;

public class IndexPage extends WebPage {

    private static final String PATH = "/";

    private By bookLocator = By.className("product");

    @Override
    public String getUri() {
        return generateUri(PATH);
    }

    public Integer getAmountOfBooksOnShowcase() {
        List<WebElement> booksList = Driver.getInstance().findElements(bookLocator);
        return booksList.size();
    }
}
