package day17;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExampleTest {

    WebDriver driver = DriverManager.getDriver(Config.CHROME);

    @Test
    public void openSite() {


        driver.get("http://google.com");
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("погода Минск");
        driver.findElement(By.xpath("//*[@name='q']")).submit();
        driver.close();

    }
}
