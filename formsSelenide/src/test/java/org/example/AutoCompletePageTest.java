package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AutoCompletePageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x900";
    }
    @Test
    public void kek(){
        autoCompletePage.open().
                clickSingleValueField().
                typeSingleValueInput("l");
        System.out.println(autoCompletePage.getOptions().size());
        Assert.assertTrue(autoCompletePage.assertOptionSize(5));
    }
}