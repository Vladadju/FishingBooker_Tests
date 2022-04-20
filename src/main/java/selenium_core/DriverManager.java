package selenium_core;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    WebDriver driver;

    public abstract void createWebDriver(String browserVersion);

    public void quitWebDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    public WebDriver getWebDriver(String browserVersion) {
        if (driver != null) {
            createWebDriver(browserVersion);
        }
        return driver;
    }
}
