package selenium_core;

import org.openqa.selenium.chrome.ChromeDriver;

public class DiverManagerFactory {
    public static DriverManager getDiverManager(String browser) throws Exception {
        DriverManager driverManager;
        switch (browser){
            case "Chrome":{
                driverManager = new ChromeDriverManager();
            }break;
            case "Firefox":{
                driverManager = new FirefoxDriverManager();
            }break;
            default:
                throw new Exception("browser" + browser + " not supported");
        }
        return driverManager;
    }
}
