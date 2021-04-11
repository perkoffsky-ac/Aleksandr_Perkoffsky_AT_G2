package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTest {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws MalformedURLException {

        /*RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:9515"), new ChromeOptions());*/

        /*System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver\\chromedriver.exe");*/

        driver.get("http://google.com");
        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
