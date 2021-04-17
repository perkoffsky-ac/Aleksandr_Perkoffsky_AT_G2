package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class SeleniumTest2 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws MalformedURLException {

        driver.get("http://google.com");
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("погода Минск");
        driver.findElement(By.xpath("//*[@name='q']")).submit();
        driver.findElement(By.xpath("//*[@aria-label='воскресенье']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@style='display:inline']")).getText());
        driver.close();
    }
}