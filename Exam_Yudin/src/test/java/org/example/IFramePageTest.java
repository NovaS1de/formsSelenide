package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class IFramePageTest extends MainTest {
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void test1(){
        iFramePage.open()
                .switchToIFrame();
        System.out.println(iFramePage.clickFindOutMoreButton()
                .getFindOutMoreText()
                .getOwnText());
    }
    @Test
    public void test2(){
        String string = "Welcome to webdriveruniversity.com we sell a wide range of electrical goods such as laptops, game consoles, cameras...";
        iFramePage.open()
                .switchToIFrame();
        Assert.assertEquals(iFramePage.clickFindOutMoreButton().getFindOutMoreText().getOwnText(), string);
    }
    @Test
    public void test3(){
        iFramePage.open()
                .switchToIFrame()
                .clickOurProductsButton()
                .clickSpecialOffers()
                .clickCloseButton();
    }
}
