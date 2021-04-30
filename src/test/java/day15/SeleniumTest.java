/*package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.Driver;
import project.pages.booking.HomePage;
import project.pages.booking.ResultPage;
import project.pages.mails.MailRuPage;
import project.pages.mails.TrashMailComPage;

import java.net.MalformedURLException;

public class SeleniumTest {

    static WebDriver driver = new ChromeDriver();
    WebElement webElement;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        *//*driver.get("http://google.com");
        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.close();*//*

        WebDriver driver = Driver.getDriver();
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        TrashMailComPage trashPage = new TrashMailComPage(driver);
        MailRuPage mailRuPage = new MailRuPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Actions actions = new Actions(driver);

        String email = trashPage.receivingFakeEmail();
        String url = "http://booking.com";
        homePage.openHomePage(url);
        System.out.println("Opening url " + url);
        homePage.registrationButton();
        resultPage.enterEmailAddress(email);
        Thread.sleep(3000);
        driver.findElement(By.id("new_password")).sendKeys("Ljhjuf15!?");
        driver.findElement(By.id("confirmed_password")).sendKeys("Ljhjuf15!?");
        driver.findElement(By.id("confirmed_password")).submit();
        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='px-captcha']/iframe")));
        WebElement iAmNotRobot2 = (WebElement) driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@style, 'block')]")));
        iAmNotRobot2.click();

        WebElement iAmNotRobot = driver.findElement(By.xpath("//p[text()=\"Нажать и удерживать\"]/../.."));
        iAmNotRobot.click();
        actions.moveToElement(iAmNotRobot);
        actions.clickAndHold().perform();
    }
}*/


