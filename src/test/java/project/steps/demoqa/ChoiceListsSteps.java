package project.steps.demoqa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.Driver;
import project.pages.demoqa.StartPage;

public class ChoiceListsSteps {

    WebDriver driver = Driver.getDriver();
    StartPage startPage = new StartPage(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

    Actions make = new Actions(driver);

    @Given("I opened a specific site")
    public void openSite() {
        String url = "https://demoqa.com/select-menu";
        startPage.openStartPage(url);
        System.out.println("Opening url " + url);
    }

    @Then("I see the a value old style select menu test passed")
    public void selectionOldMenu() {
        startPage.elementSelectionOldMenu();

    }

    @Then("I see the a value select menu test passed")
    public void selectionValueMenu() {
        startPage.elementSelectValue();

    }

    @Then("I see the a value one menu test passed")
    public void selectionOneMenu() {
        startPage.elementSelectOne();

    }

    @Then("I see the a value multiselect dropdown menu test passed")
    public void selectionMultiselectDropDown() {
        startPage.elementMultiselectDropDown();

    }

}
