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


public class PricesSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    @Given("I open this site")
    public void openThisSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I type {string} as name of this city")
    public void typeThisCity(String thisCity) {
        homePage.enterDesiredCity(thisCity);

    }

    @And("I enter date this range")
    public void dateThisRange() {
        homePage.dateRangeSelection();
    }

    @When("I choose the number of guests")
    public void chooseGuestsParameters() {
        homePage.numberGuests();

    }

    @And("I choose the number of rooms")
    public void chooseRoomsParameters() {
        homePage.numberRooms();

    }

    @Then("I select the hotels with the highest price")
    public void chooseHighestPrice() {
        resultPage.highestPrice();
    }

    @And("I am sorting hotels in ascending order")
    public void lowestPrice() {
        resultPage.sortingLowestPrice();
    }

    @And("I see the spinner loading")
    public void loadingSorting() {
        resultPage.spinnerLoading();
    }

    @Then("I see comparison of numbers test passed")
    public void priceComparison() {
        Assert.assertTrue(resultPage.parseStringPriceForWeek() / 7 > resultPage.parseStringPrice());
    }
}

