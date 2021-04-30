package project.driver;

import org.openqa.selenium.WebDriver;

public class Driver {

    private static WebDriver driver;
    private static Config config;

    private Driver(){
    }

    public static void setConfig(Config config) {
        Driver.config = config;
    }
    public static WebDriver getDriver() {
        if (null == driver) {
            driver = DriverManager.getDriver(config);
        }
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        Driver.driver = driver;
    }

    public static void destroy() {
        driver.quit();
        Driver.driver = null;
    }

}
