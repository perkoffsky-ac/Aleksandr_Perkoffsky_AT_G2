package project.pages.mails;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.L4JLogging;
import project.driver.Driver;

public class TrashMailComPage {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    private static final Logger LOGGER = Logger.getLogger(L4JLogging.class.getName());

    public TrashMailComPage(WebDriver driver) {
        this.driver = driver;
    }

    public String receivingFakeEmail() {
        driver.get("https://trashmail.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("fe-forward")).sendKeys("jackchankachan@mail.ru");
        driver.findElement(By.xpath("//*[@id='tab-quick']/form/div[3]/div/button")).click();
        WebElement webElement = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//span[text()='10']/..")));
        webElement.click();
        driver.findElement(By.id("fe-submit")).click();

        return driver.findElement(By.id("fe-dea")).getAttribute("value");
    }
}

