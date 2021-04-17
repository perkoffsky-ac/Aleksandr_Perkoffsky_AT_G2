package day15.hometasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ChoiceLists {

    static WebDriver driver = new ChromeDriver();

    @Before
    public void selectLists() {

        Actions make = new Actions(driver);
        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("//*[@id='oldSelectMenu']")).click();
        make
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();

        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//*[@id='react-select-4-input']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
        make
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();

        WebElement element2 = driver.findElement(By.xpath("//*[@id='react-select-3-input']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element2);
        make
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();

        WebElement element3 = driver.findElement(By.xpath("//*[@id='react-select-2-input']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element3);
        make
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();
    }

    @Test
    public void checkSomething() {

    }

    @After
    public void completionTest() {
        driver.close();
    }

    public static void main(String[] args) {

    }
}
