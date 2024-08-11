package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ModalDialogsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void kek(){
        System.out.println(modalDialogsPage.open().
                clickSmallDialog().
                getSmallText().
                getOwnText());
        System.out.println(modalDialogsPage.clickCloseSmall().
                clickLargeDialog().
                getLargeText().
                getOwnText());
    }
}
