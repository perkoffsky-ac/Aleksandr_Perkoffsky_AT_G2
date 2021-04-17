package day17;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseSteps {

    public static WebDriver driver;

    @BeforeClass
    public static void initDriver(){
        Driver.setConfig(Config.valueOf(System.getProperty("BROWSER")));
        driver = Driver.getWebdriver();

    }

    @AfterClass
    public static void closeDriver(){
        Driver.destroy();
    }
}

