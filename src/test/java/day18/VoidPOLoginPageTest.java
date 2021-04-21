package day18;

import org.junit.Assert;
import org.junit.Test;

public class VoidPOLoginPageTest {

    private VoidPOLoginPage loginPage = new VoidPOLoginPage();

    @Test
    public void loginTest(){
        loginPage.enterLoginAndPass("aaa", "1234");
        loginPage.clickEnterButton();
        Assert.assertTrue(loginPage.logoutLinkPresents());
    }
}
