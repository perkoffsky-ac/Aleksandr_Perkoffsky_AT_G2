package day15.hometasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelAvailability {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement webElement;

    @Before
    public void hotelSelection() {
        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Москва");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@aria-label='21 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@aria-label='28 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By.xpath("//a[@data-id='ht_id-204']")).click();
        webElement = driver.findElement(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    @Test
    public void quantityCheck() {
        String count1 = driver.findElement(By.xpath("//*[@class='sr_header ']")).getText();
        String count2 = count1.replaceAll("[^0-9]", "");
        int count3 = Integer.parseInt(count2);
        Assert.assertTrue(0 < count3);
    }

    @After
    public void completionTest() {
        driver.close();
    }
}
