package project.pages.booking;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.L4JLogging;
import project.driver.Driver;

import static project.utils.SelectDateUtil.*;

public class HomePage {

    WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void enterDesiredCity(String cityName) {
        WebElement city = driver.findElement(By.xpath("//*[@name='ss']"));
        city.sendKeys(cityName);
    }

    private void clickElement(String xpathKey, String xpathLine) {
        String xpathValue = String.format("//*[@%s='%s']", xpathKey, xpathLine);
        WebElement webElement = driver.findElement(By.xpath(xpathValue));
        webElement.click();
    }

    public void dateRangeSelection() {
        clickElement("data-calendar2-title", "Приезжаю");
        clickElement("data-date", getCurrentDate());
        clickElement("data-date", checkOutDate());

    }

    public void numberGuests() {
        clickElement("class", "xp__guests__count");
        clickElement("aria-label", "Взрослых: увеличить количество");
        clickElement("aria-label", "Взрослых: увеличить количество");
    }

    public void inputSubmission() {
        WebElement cityInput = driver.findElement(By.xpath("//*[@name='ss']"));
        cityInput.submit();
    }

    public void numberRooms() {
        clickElement("aria-label", "Номера: увеличить количество");
        inputSubmission();
    }

    private void hoverElement(String xpathString) {
        String xpathValue = String.format("%s", xpathString);
        WebElement hoverWebElement = driver.findElement(By.xpath(xpathString));
        actions.moveToElement(hoverWebElement);
        actions.perform();
    }

    public void cursorHoverCurrency() {
        hoverElement("//*[@class='bui-button__text']");

    }

    public String comparisonCurrencySelectionValues() {
        return driver.findElement(By
                .xpath("//*[@class='bui-button bui-button--light bui-button--large']"))
                .getAttribute("data-modal-aria-label");
    }

    public void cursorHoverLanguage() {
        hoverElement("//*[@class='bui-avatar__image']");

    }

    public String comparisonLanguageSelectionValues() {
        return driver.findElement(By
                .xpath("//*[@data-modal-id='language-selection']"))
                .getAttribute("data-tooltip-text");
    }

    /*public void registrationButton() {
        clickElement("data-google-track", "Click/Action: index/header_logged_out_link_box");

    }*/

    public void logIntoAccount() {
        WebElement logButton = driver.findElement(By.xpath("//*[@class='bui-button bui-button--secondary " +
                "js-header-login-link']//span[contains(text(),'Войти')]"));
        logButton.click();

    }

    public void enterAddressPass(String addressPass, String xPathLine) {
        String xpathValue = String.format("%s", xPathLine);
        WebElement emailAddressPass = driver.findElement(By.xpath(xPathLine));
        emailAddressPass.sendKeys(addressPass);
        emailAddressPass.submit();

    }

    public void enterEmailAddress() throws InterruptedException {
        enterAddressPass("jackchankachan@mail.ru", "//input[@type='email']");
        Thread.sleep(3000);
    }

    public void enterEmailPass() throws InterruptedException {
        enterAddressPass("Ljhjuf15!?", "//input[@type='password']");
        Thread.sleep(5000);

    }

}
