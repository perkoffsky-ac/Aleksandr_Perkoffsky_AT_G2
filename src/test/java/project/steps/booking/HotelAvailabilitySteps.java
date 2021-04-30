package project.steps.booking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.Driver;
import project.pages.booking.HomePage;
import project.pages.booking.ResultPage;

public class HotelAvailabilitySteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("I open a site")
    public void openSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I type {string} as name of the city")
    public void typeCity(String theCity) {
        homePage.enterDesiredCity(theCity);

    }

    @And("I enter date range")
    public void dateRange() {
        homePage.dateRangeSelection();
    }

    @When("I submit the entered data")
    public void submitData() {
        homePage.inputSubmission();

    }

    @And("I choice the hotel")
    public void choiceHotel() {
        resultPage.checkboxSelectionHotels();

    }

    @Then("I see test passed")
    public void quantityComparison() {
        Assert.assertTrue(0 < resultPage.quantityCheck());
    }
}

