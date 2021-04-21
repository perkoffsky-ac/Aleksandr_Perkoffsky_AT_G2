package day15.hometasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChoiceLists {

    static WebDriver driver = new ChromeDriver();
    Actions make = new Actions(driver);

    @Before
    public void selectLists() {

        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.xpath("//*[@id='oldSelectMenu']")).click();
        make
                .sendKeys(Keys.ARROW_DOWN)
                .click()
                .build().perform();

        WebElement dropDown1 = driver.findElement(By
                .xpath("//*[@id=\"withOptGroup\"]/descendant::div[@class=\" css-tlfecz-indicatorContainer\"]"));
        dropDown1.click();
        WebElement dropValue1 = driver.findElement(By.xpath("//div[text()='Group 2, option 2']"));
        dropValue1.click();

        WebElement dropDown2 = driver.findElement(By
                .xpath("//*[@id=\"selectOne\"]/descendant::div[@class=\" css-tlfecz-indicatorContainer\"]"));
        dropDown2.click();
        WebElement dropValue2 = driver.findElement(By.xpath("//div[text()='Dr.']"));
        dropValue2.click();

        WebElement dropDown3 = driver.findElement(By
                .xpath("//*[@class=\" css-2b097c-container\"]/descendant::div[text()=\"Select...\"]"));
        dropDown3.click();
        WebElement dropValue3 = driver.findElement(By.xpath("//div[text()='Black']"));
        dropValue3.click();

    }

    @Test
    public void checkSomething() {

    }

    @After
    public void completionTest() {
        driver.close();
    }
}
