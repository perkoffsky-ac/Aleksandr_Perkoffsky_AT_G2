package day17;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public static void initDriver(){
       driver = Driver.getWebdriver();
    }

    @AfterClass
    public static void closeDriver(){
        Driver.destroy();
    }
}
