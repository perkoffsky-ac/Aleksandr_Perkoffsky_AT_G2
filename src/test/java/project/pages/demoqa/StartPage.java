package project.pages.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import project.driver.Driver;

public class StartPage {

    WebDriver driver = Driver.getDriver();
    Actions make = new Actions(driver);

    public StartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void referringMenuElement (String xpathString){
        String xpathValue = String.format("%s", xpathString);
        WebElement menuElement = driver.findElement(By.xpath(xpathString));
        menuElement.click();
    }

    public void openStartPage(String url) {
        driver.get(url);
    }

    public void elementSelectionOldMenu() {
        referringMenuElement("//*[@id='oldSelectMenu']");
        make.sendKeys(Keys.ARROW_DOWN).click().build().perform();
    }

    public void elementSelectValue() {
        referringMenuElement("//*[@id=\"withOptGroup\"]/descendant:" +
                ":div[@class=\" css-tlfecz-indicatorContainer\"]");
        referringMenuElement("//div[text()='Group 2, option 2']");
    }

    public void elementSelectOne() {
        referringMenuElement("//*[@id=\"selectOne\"]/descendant:" +
                ":div[@class=\" css-tlfecz-indicatorContainer\"]");
        referringMenuElement("//div[text()='Dr.']");
    }

    public void elementMultiselectDropDown() {
        referringMenuElement("//*[@class=\" css-2b097c-container\"]/descendant::div[text()=\"Select...\"]");
        referringMenuElement("//div[text()='Black']");
    }
}
