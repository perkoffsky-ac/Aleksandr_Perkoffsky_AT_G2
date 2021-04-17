package day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class SeleniumTest {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws MalformedURLException {


        driver.get("http://google.com");
        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
