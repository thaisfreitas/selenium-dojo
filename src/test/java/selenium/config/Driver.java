package selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new FirefoxDriver();
            configureTimeout();
        }
        return driver;
    }

    public static void shutdown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static void configureTimeout() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
