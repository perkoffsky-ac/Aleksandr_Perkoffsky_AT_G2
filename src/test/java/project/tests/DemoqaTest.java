package project.tests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import project.L4JLogging;
import project.driver.Driver;
import project.pages.demoqa.StartPage;

public class DemoqaTest {

    WebDriver driver = Driver.getDriver();
    StartPage startPage = new StartPage(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Before
    public void doBefore() {
        String url = "https://demoqa.com/select-menu";
        startPage.openStartPage(url);
    }

    @Test
    public void choiceLists() {
        startPage.elementSelectionOldMenu();
        startPage.elementSelectValue();
        startPage.elementSelectOne();
        startPage.elementMultiselectDropDown();
    }

    @After
    public void completionTest() {
        driver.close();
    }
}

