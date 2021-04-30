package project.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import project.driver.Config;
import project.driver.Driver;

public class BaseSteps {
    public static WebDriver driver;

    @Before
    public void doBefore(){
        Driver.setConfig(Config.CHROME);

    }

    /*@After
    public void doAfter(){
        Driver.destroy();
    }*/
}
