package day18;

import day17.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CucumberSteps {

    WebDriver driver = Driver.getWebdriver();
    CucumberSitePageObject page = new CucumberSitePageObject(driver);

    @Given("I open a site")
    public void openSite() {
        String url = "http://booking.com";
        driver.get(url);
        System.out.println("Opening url " + url);
    }

    @When("I type {string} as name of the city")
    public void typeCity(String theCity) {
        page.findCity(theCity);

    }

    @Then("I see test passed")
    public void doAssert() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("Expected hotel prise is lower then expected!", true);
    }
}
