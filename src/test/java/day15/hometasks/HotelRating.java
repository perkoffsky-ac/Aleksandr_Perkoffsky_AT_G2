package day15.hometasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class HotelRating {

    static WebDriver driver = new ChromeDriver();
    WebDriverWait wait=new WebDriverWait(driver,10);
    WebElement webElement;

    @Before
    public void filterHotels() throws InterruptedException {
        Actions make = new Actions(driver);
        driver.get("http://booking.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Москва");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By.xpath("//li[@data-id='class']")).click();
        webElement = driver.findElement(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));
        wait.until(ExpectedConditions.invisibilityOf(webElement));


        String originalWindow = driver.getWindowHandle();
        assert driver.getWindowHandles().size() == 1;
        driver.findElement(By.xpath("//*[@class='js-sr-hotel-link hotel_name_link url']")).click();
        wait.until(numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    @Test
    public void checkRating() {
        String rating1 = driver.findElement(By.xpath("//*[@class='bui-review-score__badge']")).getText();
        double rating2 = Double.parseDouble(rating1.replaceAll(",", "."));
        Assert.assertTrue(9.0 <= rating2);

    }

    @After
    public void completionTest() {
        driver.close();
    }
}
