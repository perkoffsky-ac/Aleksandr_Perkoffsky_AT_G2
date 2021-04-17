package day15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void filterPrice() {
        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Париж");
        driver.findElement(By.xpath("//*[@data-calendar2-title='Приезжаю']")).click();
        driver.findElement(By.xpath("//*[@aria-label='14 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@aria-label='21 Апрель 2021']")).click();
        driver.findElement(By.xpath("//*[@class='xp__guests__count']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Взрослых: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@aria-label='Номера: увеличить количество']")).click();
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        driver.findElement(By.xpath("//*[@id='filter_price']/div[3]/a[5]/label/div/span[1]")).click();
        driver.findElement(By.xpath("//*[text()='Цена (сначала самая низкая)']")).click();

    }

    @Test
    public void checkPrice() {
        String priceS1 = driver.findElement(By
                .xpath("//*[@id='hotellist_inner']/div[1]/div[2]/div[3]/div/div/div/div[2]/div[1]/div[2]/div/span"))
                .getText();
        String number1 = priceS1.replaceAll("^[0-9]", " ");
        int priceInt = Integer.parseInt(number1);

        String priceS2 = driver.findElement(By
                .xpath("//*[@id='filter_price']/div[3]/a[5]/label/div/span[1]"))
                .getText();
        String number2 = priceS2.replaceAll("^[0-9]", " ");
        int priceMax = Integer.parseInt(number2);
        Assert.assertTrue(priceInt/7 < priceMax);

    }

    @After
    public void completionTest() {
        driver.close();
    }

    public static void main(String[] args)  {

    }
}

