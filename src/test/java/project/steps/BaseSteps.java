package project.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import project.L4JLogging;
import project.driver.Config;
import project.driver.Driver;

public class BaseSteps {
    public static WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Before
    public void doBefore(){
        Driver.setConfig(Config.CHROME);
        LOGGER.info("Test started");

    }

    @After
    public void doAfter(){
        Driver.destroy();
        LOGGER.info("Test finished");
    }
}
