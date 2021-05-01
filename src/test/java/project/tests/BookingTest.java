package project.tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import project.L4JLogging;
import project.driver.Driver;
import project.pages.booking.HomePage;
import project.pages.booking.ResultPage;

public class BookingTest {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage(driver);
    ResultPage resultPage = new ResultPage(driver);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    private final String currencySelection = "Выберите валюту";
    private final String languageSelection = "Выберите язык";
    private final int numberOfHotelsInFavorites = 2;
    private final String redColor = "rgba(255, 0, 0, 1)";
    private final String url = "http://booking.com";

    @Test
    public void hotelAvailability() {
        homePage.openHomePage(url);
        homePage.enterDesiredCity("Москва");
        homePage.dateRangeSelection();
        homePage.inputSubmission();
        resultPage.checkboxSelectionHotels();
        Assert.assertTrue(0 < resultPage.quantityCheck());
    }

    @Test
    public void hotelRating() {
        homePage.openHomePage(url);
        homePage.enterDesiredCity("Москва");
        homePage.inputSubmission();
        resultPage.sortedRating();
        resultPage.switchingToNewWindow();
        Assert.assertTrue(9.0 < resultPage.parseRatingSelection());
    }

    @Test
    public void currencySelection() {
        homePage.openHomePage(url);
        homePage.cursorHoverCurrency();
        Assert.assertEquals("Strings are not the same", currencySelection,
                homePage.comparisonCurrencySelectionValues());
    }

    @Test
    public void languageSelection() {
        homePage.openHomePage(url);
        homePage.cursorHoverLanguage();
        Assert.assertEquals("Strings are not the same", languageSelection,
                homePage.comparisonLanguageSelectionValues());
    }

    @Test
    public void madrid() throws InterruptedException {
        homePage.openHomePage(url);
        homePage.logIntoAccount();
        homePage.enterEmailAddress();
        homePage.enterEmailPass();
        homePage.enterDesiredCity("Мадрид");
        Thread.sleep(3000);
        homePage.dateRangeSelection();
        homePage.inputSubmission();
        resultPage.addToFavourites();
        Assert.assertEquals(numberOfHotelsInFavorites, resultPage.сheckHotelsInFavorites());
    }

    @Test
    public void moscowColors() {
        homePage.openHomePage(url);
        homePage.enterDesiredCity("Москва");
        homePage.inputSubmission();
        resultPage.choiceHotelAndChangeColor();
        Assert.assertEquals("Colors are different", redColor, resultPage.comparisonColor());
    }

    @Test
    public void pricesSteps() {
        homePage.openHomePage(url);
        homePage.enterDesiredCity("Париж");
        homePage.dateRangeSelection();
        homePage.numberGuests();
        homePage.numberRooms();
        resultPage.highestPrice();
        resultPage.sortingLowestPrice();
        resultPage.spinnerLoading();
        Assert.assertTrue(resultPage.parseStringPriceForWeek() / 7 > resultPage.parseStringPrice());
    }

}




