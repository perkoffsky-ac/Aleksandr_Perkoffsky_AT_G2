/*package project.steps.booking;

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
        import project.pages.mails.MailRuPage;
        import project.pages.mails.TrashMailComPage;

public class UserRegistrationSteps {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    TrashMailComPage trashPage = new TrashMailComPage(driver);
    MailRuPage mailRuPage = new MailRuPage(driver);

    String email = trashPage.receivingFakeEmail();

    @Given("I open site for registration")
    public void openThisSite() {
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
    }

    @When("I register on the site")
    public void registrationOnSite() {
        homePage.registrationButton();
        resultPage.enterEmailAddress(email);
    }
}*/
