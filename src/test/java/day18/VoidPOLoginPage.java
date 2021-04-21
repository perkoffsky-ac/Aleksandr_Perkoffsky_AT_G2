package day18;

import day17.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VoidPOLoginPage {

    WebDriver driver = Driver.getWebdriver();

    public void enterLoginAndPass(String login, String password) {
        driver.findElement(By.id("login")).sendKeys(login);
        driver.findElement(By.id("password")).sendKeys(password);

    }

    public void clickEnterButton() {
        driver.findElement(By.xpath("//*[@id='mailbox:submit']/input")).click();

    }

    public boolean logoutLinkPresents() {
        return driver.findElement(By.xpath("//*[@id='PH_logoutLink']")).isDisplayed();

    }
}
