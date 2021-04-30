package project.pages.booking;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.Driver;
import project.utils.ParsingUtil;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class ResultPage {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void referringToSpecificElement(String xpathString) {
        String xpathValue = String.format("%s", xpathString);
        WebElement specificElement = driver.findElement(By.xpath(xpathString));
        specificElement.click();
    }

    public void highestPrice() {
        referringToSpecificElement("//a[@data-id = 'pri-5']");
    }

    public void sortingLowestPrice() {
        referringToSpecificElement("//*[text()='Цена (сначала самая низкая)']");
    }

    public void spinnerLoading() {
        WebElement spinner = driver.findElement(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));
        wait.until(ExpectedConditions.invisibilityOf(spinner));
    }

    public int parseStringPrice() {
        WebElement price = driver.findElement(By.xpath("//a[@data-id = 'pri-5']"));
        return ParsingUtil.parsingToInt(price.getText());
    }

    public int parseStringPriceForWeek() {
        WebElement priceForWeek = driver.findElement(By
                .xpath("//*[@class='bui-price-display__value prco-inline-block-maker-helper ']"));
        return ParsingUtil.parsingToInt(priceForWeek.getText());
    }

    public void checkboxSelectionHotels() {
        referringToSpecificElement("//a[@data-id='ht_id-204']");
        spinnerLoading();
    }

    public int quantityCheck() {
        WebElement quantity = driver.findElement(By.xpath("//*[@class='sr_header ']"));
        return ParsingUtil.parsingToInt(quantity.getText());
    }

    public void sortedRating() {
        referringToSpecificElement("//li[@data-id='class']");
        spinnerLoading();
    }

    public void switchingToNewWindow() {
        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        referringToSpecificElement("//*[@class='js-sr-hotel-link hotel_name_link url']");
        wait.until(numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public double parseRatingSelection() {
        WebElement ratingSelection = driver.findElement(By.xpath("//*[@class='bui-review-score__badge']"));
        return ParsingUtil.parsingString(ratingSelection.getText());
    }

    public void choiceHotelAndChangeColor() {
        WebElement elementHotel = driver.findElement(By.xpath("//*[@id='hotellist_inner']/div[10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", elementHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", elementHotel);
    }

    public String comparisonColor() {
        return driver.findElement(By
                .xpath("//*[@id='hotellist_inner']/div[10]"))
                .getCssValue("color");
    }

    public void addToFavourites() throws InterruptedException {
        referringToSpecificElement("//*[@aria-label='Добавить вариант в ваши списки ']");
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);
        referringToSpecificElement("//*[@aria-label='Добавить вариант в ваши списки '][last()]");
        Thread.sleep(3000);

    }

    public int сheckHotelsInFavorites() throws InterruptedException {
        referringToSpecificElement("//*[@data-bui-ref='dropdown-button']");
        actions
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .build().perform();
        Thread.sleep(3000);
        WebElement numberOfHotelsInFavorites = driver.findElement(By.xpath("//span[contains(text(), 'сохранены')]"));
        return ParsingUtil.parsingToInt(numberOfHotelsInFavorites.getText());

    }

       /*public void createPassword() {
        driver.findElement(By.id("new_password")).sendKeys("Ljhjuf15!");
        driver.findElement(By.id("confirmed_password")).sendKeys("Ljhjuf15!");
        driver.findElement(By.id("confirmed_password")).submit();
    }*/

}
