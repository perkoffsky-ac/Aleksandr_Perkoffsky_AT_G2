package day15.hometasks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest6 {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void colorChange() {

        driver.get("http://booking.com");
        driver.findElement(By.xpath("//*[@name='ss']")).sendKeys("Москва");
        driver.findElement(By.xpath("//*[@name='ss']")).submit();
        WebElement elementHotel = driver.findElement(By.xpath("//*[@id='hotellist_inner']/div[10]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.backgroundColor = 'green'", elementHotel);
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.color = 'red'", elementHotel);
    }

    @Test
    public void compareColors() {

        String color1 = "rgba(255, 0, 0, 1)";
        String color2 = driver.findElement(By.xpath("//*[@id='hotellist_inner']/div[10]")).getCssValue("color");
        Assert.assertEquals("Colors are different", color1, color2);
    }

    @After
    public void completionTest() {
        driver.close();
    }

    public static void main(String[] args) {

    }
}
