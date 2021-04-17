package day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumTest3 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws IOException {

        new SeleniumTest3().withScreenShot();
    }

    public void withScreenShot() throws IOException {

        driver.get("http://google.com");
        driver.findElement(By.xpath("//*[@name='q']")).isDisplayed();
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("C:\\Users\\perko\\Desktop\\AT_G2\\screenshot.png"));
        driver.close();
    }
}
