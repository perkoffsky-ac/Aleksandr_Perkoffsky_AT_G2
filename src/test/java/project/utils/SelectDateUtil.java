package project.utils;

import org.openqa.selenium.WebDriver;
import project.driver.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SelectDateUtil {

    WebDriver driver = Driver.getDriver();
    Date date = new Date();

    public static String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-dd")
                .format(new Date(new Date().getTime() + 7*24*3600*1000));
    }

    public static String checkOutDate() {
        return new SimpleDateFormat("yyyy-MM-dd")
                .format(new Date(new Date().getTime() + 14*24*3600*1000));
    }

}

