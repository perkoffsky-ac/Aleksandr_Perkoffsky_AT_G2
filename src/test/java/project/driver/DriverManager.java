package project.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static WebDriver webdriver;

    public static WebDriver getDriver(Config config) {

        switch (config != null ? config : Config.CHROME) {
            case FF -> {
                return getFFDriver();
            }
            case REMOTE -> {
                return getRemoteDriver();
            }
            default -> {
                return getChromeDriver();
            }
        }
    }

    public static WebDriver getFFDriver() {
        return null;
    }
    public static WebDriver getRemoteDriver() {
        ChromeOptions caps = new ChromeOptions();
        caps.addArguments("start-maximized");


        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), caps);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
    public static WebDriver getChromeDriver() {

        webdriver = new ChromeDriver();
        return webdriver;
    }
}
