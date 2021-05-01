package project.steps.booking;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import project.L4JLogging;
import project.driver.Driver;
import project.pages.booking.HomePage;

public class LanguageCurrencySteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    private final String currencySelection = "Выберите валюту";
    private final String languageSelection = "Выберите язык";

    @Given("I see the site open")
    public void openSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I hover over the currency selection")
    public void currencyNavigation() {
        homePage.cursorHoverCurrency();

    }

    @Then("I see the currency selection test passed")
    public void doAssertCurrency() {
        Assert.assertEquals("Strings are not the same", currencySelection,
                homePage.comparisonCurrencySelectionValues());

    }

    @When("I hover over the language selection")
    public void languageNavigation() {
        homePage.cursorHoverLanguage();

    }

    @Then("I see the language selection test passed")
    public void doAssertLanguage() {
        Assert.assertEquals("Strings are not the same",languageSelection,
                homePage.comparisonLanguageSelectionValues());

    }

}
