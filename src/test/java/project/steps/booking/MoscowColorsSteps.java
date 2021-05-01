package project.steps.booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import project.L4JLogging;
import project.driver.Driver;
import project.pages.booking.HomePage;
import project.pages.booking.ResultPage;

public class MoscowColorsSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    private final String redColor = "rgba(255, 0, 0, 1)";

    @Given("I see that this site is open")
    public void openSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I enter {string} as city name")
    public void typeCity(String theCity) {
        homePage.enterDesiredCity(theCity);

    }

    @And("I press the input in the city line")
    public void submitData() {
        homePage.inputSubmission();

    }

    @When("I see a certain hotel")
    public void certainHotel() {
        resultPage.choiceHotelAndChangeColor();

    }

    @Then("I see color comparison test passed")
    public void doAssertColors() {
        Assert.assertEquals("Colors are different", redColor, resultPage.comparisonColor());
    }

}
