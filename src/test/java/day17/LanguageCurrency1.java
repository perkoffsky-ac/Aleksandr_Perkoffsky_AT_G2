package day17;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LanguageCurrency1 extends BaseSteps {

    Actions actions = new Actions(driver);
    String toolTip1 = "Выберите валюту";
    String toolTip2 = "Выберите язык";

    @Test
    public void valueCheck1() {
        driver.get("http://booking.com");
        WebElement element1 = driver.findElement(By.xpath("//*[@class='bui-button__text']"));
        actions.moveToElement(element1);
        actions.perform();
        String toolTip3 = driver.findElement(By
                .xpath("//*[@class='bui-button bui-button--light bui-button--large']"))
                .getAttribute("data-modal-aria-label");
        Assert.assertEquals("Strings are not the same1", toolTip1, toolTip3);
    }

    @Test
    public void valueCheck2() {
        WebElement element2 = driver.findElement(By.xpath("//*[@class='bui-avatar__image']"));
        actions.moveToElement(element2);
        actions.perform();
        String toolTip4 = driver.findElement(By
                .xpath("//*[@data-modal-id='language-selection']"))
                .getAttribute("data-tooltip-text");
        Assert.assertEquals("Strings are not the same2", toolTip2, toolTip4);
    }
}
