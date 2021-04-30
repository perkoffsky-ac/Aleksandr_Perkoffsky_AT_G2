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

public class HotelRatingSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @Given("I am opening this site")
    public void openSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I enter {string} as name of the city")
    public void typeCity(String theCity) {
        homePage.enterDesiredCity(theCity);

    }

    @And("I press the enter in the city line")
    public void submitData() {
        homePage.inputSubmission();

    }

    @When("I am sorting hotels by rating")
    public void sortingHotels() {
        resultPage.sortedRating();

    }

    @And("I switch focus to the new window")
    public void focusOnNewWindow() {
        resultPage.switchingToNewWindow();

    }

    @Then("I see the test passed")
    public void checkRating() {
        Assert.assertTrue(9.0 < resultPage.parseRatingSelection());
    }

}
