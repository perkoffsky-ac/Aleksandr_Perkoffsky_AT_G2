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

public class MadridSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    private final int numberOfHotelsInFavorites = 2;

    @Given("I open this new site")
    public void openThisSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I press the enter button")
    public void clickLogButton() {
        homePage.logIntoAccount();
    }

    @When("I enter email address and password")
    public void emailInput() throws InterruptedException {
        homePage.enterEmailAddress();
        homePage.enterEmailPass();
    }

    @And("I type {string} as name of the new city")
    public void typeCity(String theCity) throws InterruptedException {
        homePage.enterDesiredCity(theCity);
        Thread.sleep(3000);

    }

    @When("I enter date range a month")
    public void dateRangeSelection() {
        homePage.dateRangeSelection();
    }

    @And("I submit selected data")
    public void submitData() {
        homePage.inputSubmission();

    }

    @When("I choose hotels from the list")
    public void chooseHotelsFromList() throws InterruptedException {
        resultPage.addToFavourites();
    }

    @Then("I see two selected hotels in my favorites")
    public void selectedHotels() throws InterruptedException {
        Assert.assertEquals(numberOfHotelsInFavorites, resultPage.сheckHotelsInFavorites());
    }
}
