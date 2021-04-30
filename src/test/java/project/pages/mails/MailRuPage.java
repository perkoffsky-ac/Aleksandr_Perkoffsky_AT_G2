package project.pages.mails;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.driver.Driver;

public class MailRuPage {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public MailRuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginMailAndSearchForEmail(String email) throws InterruptedException {
        driver.get("https://mail.ru/");
        driver.manage().window().maximize();

        WebElement buttonComeIn = driver.findElement(By.xpath("//*[@data-click-counter='75068996']"));
        buttonComeIn.click();
        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div/iframe")));
        dataInput("//input[@name='username']", "jackchankachan");
        Thread.sleep(3000);

        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div/iframe")));
        dataInput("//input[@name='password']", "Ljhjuf15");

        driver.findElement(By.xpath("//span[contains(@title, '" + email + "')]/..")).click();
        driver.findElement(By.xpath("//a[@class='button-link_mr_css_attr']")).click();
    }

    public void dataInput(String xpathString, String logPass) {
        String xpathValue = String.format("%s", xpathString);
        WebElement inputElement = driver.findElement(By.xpath(xpathString));
        inputElement.sendKeys(logPass);
        inputElement.submit();
    }
}
