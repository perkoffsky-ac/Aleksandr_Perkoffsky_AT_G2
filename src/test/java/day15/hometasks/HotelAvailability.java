package day15.hometasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelAvailability {
    static WebDriver driver = new ChromeDriver();

    @Before
    public void hotelSelection() {
        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Москва");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@aria-label='14 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@aria-label='21 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By
                .xpath("//*[@id='filter_filter-suggestions']/div[2]/a[3]/label/div/span[1]"))
                .click();
    }

    @Test
    public void quantityСheck() {
        String count1 = driver.findElement(By.xpath("//*[@class='sr_header ']")).getText();
        String count2 = count1.replaceAll("[^0-9]", "");
        int count3 = Integer.parseInt(count2);
        Assert.assertTrue(0 < count3);
    }

    @After
    public void completionTest() {
        driver.close();
    }

    public static void main(String[] args) {

    }
}
