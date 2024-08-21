package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TextBoxPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void kek(){
        String lol = "kekes";
        mainPage.open("https://demoqa.com/text-box");
        textBoxPage.sendKeysTo(textBoxPage.getCurrentAddressInput(), "kek");
        textBoxPage.getSubmitButton().click();
        System.out.println(textBoxPage.getCurrentAddressText().getOwnText());
        Assert.assertEquals(textBoxPage.reduceStringToResult(textBoxPage.getCurrentAddressText()), lol);
    }
}
