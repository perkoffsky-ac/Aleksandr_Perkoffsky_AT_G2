package day15;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestSearchingResults {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void filterHotels() {
        Actions make = new Actions(driver);
        WebElement nameField;
        driver.get("https://www.w3schools.com/java/");
        nameField = driver.findElement(By.xpath("//*[@id='main']/h1/span"));
        make.doubleClick(nameField)
                .keyDown(Keys.LEFT_CONTROL)
                .sendKeys("C")
                .keyUp(Keys.LEFT_CONTROL)
                .build().perform();

        driver.get("https://google.com");
        driver.findElement(By.xpath("//*[@name='q']")).isDisplayed();
        make.keyDown(Keys.LEFT_CONTROL)
                .sendKeys("V")
                .keyUp(Keys.LEFT_CONTROL)
                .sendKeys(Keys.ENTER)
                .build().perform();
    }

    @Test
    public void checkRating() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='g']"));
        list.forEach(webElement -> {
            System.out.println(webElement.findElement(By.xpath("//em")).getText());
        });
        boolean allTut = list.stream().allMatch(webElement -> {
            return webElement.findElement(By.xpath("//em"))
                    .getText().equalsIgnoreCase("tutorial");
        });
        Assert.assertTrue(allTut);
    }

    @After
    public void completionTest() {
        driver.close();
    }
}
