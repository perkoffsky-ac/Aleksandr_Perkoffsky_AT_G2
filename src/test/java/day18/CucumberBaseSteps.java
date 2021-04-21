package day18;

import day17.Config;
import day17.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CucumberBaseSteps {
    public static WebDriver driver;

    @Before
    public void doBefore(){
        Driver.setConfig(Config.CHROME);

    }

    @After
    public void scrollTest2(){
        Driver.destroy();
    }
}
