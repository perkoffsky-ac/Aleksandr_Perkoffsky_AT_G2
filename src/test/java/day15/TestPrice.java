package day15;

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

public class TestPrice {

    static WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement webElement;

    @Before
    public void filterPrice() {
        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@data-date='2021-05-06']")).click();
        driver.findElement(By.xpath("//*[@data-date='2021-05-15']")).click();
        driver.findElement(By.xpath("//*[@class='xp__guests__count']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Номера: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By.xpath("//a[@data-id = 'pri-5']")).click();
        driver.findElement(By.xpath("//*[text()='Цена (сначала самая низкая)']")).click();
        webElement = driver.findElement(By.xpath("//div[@class='bui-spinner bui-spinner--size-large']"));
        wait.until(ExpectedConditions.invisibilityOf(webElement));

    }

    @Test
    public void checkPrice() {
        String priceN1 = driver.findElement(By
                .xpath("//a[@data-id = 'pri-5']"))
                .getText();
        String priceN2 = priceN1.replaceAll("[^0-9]", "");
        int priceNight = Integer.parseInt(priceN2);

        String priceW1 = driver.findElement(By
                .xpath("//*[@class='bui-price-display__value prco-inline-block-maker-helper ']"))
                .getText();
        String priceW2 = priceW1.replaceAll("[^0-9]", "");
        int priceWeek = Integer.parseInt(priceW2);

        Assert.assertTrue(priceWeek / 7 > priceNight);
    }

    @After
    public void completionTest() {
        driver.close();
    }
}

