package day15.hometasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HotelRating {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void filterHotels() throws InterruptedException {
        Actions make = new Actions(driver);
        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Москва");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By.xpath("//*[@data-id='dropdown']")).click();
        make
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();
        driver.findElement(By.xpath("//*[@class='js-sr-hotel-link hotel_name_link url']")).click();

    }

    @Test
    public void checkRating() {
        String rating1 = driver.findElement(By.xpath("//*[@class='bui-review-score__badge']")).getText();
        double rating2 = Double.parseDouble(rating1.replaceAll(",", "."));
        Assert.assertTrue(9.0 < rating2);

    }

    @After
    public void completionTest() {
        driver.close();
    }

    public static void main(String[] args) {

    }
}
