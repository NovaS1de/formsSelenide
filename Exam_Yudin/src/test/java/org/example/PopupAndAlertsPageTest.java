package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class PopupAndAlertsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void test1(){
        System.out.println(popupAndAlertsPage.open()
                .clickJavaScriptAlertClickMeButton()
                .getAlertText());
    }
    @Test
    public void test2(){
        System.out.println(popupAndAlertsPage.open()
                .clickAjaxLoaderClickMeButton()
                .waitForButtonAndClick()
                .getPopupTitleText());
    }
    @Test
    public void test3(){
        popupAndAlertsPage.open()
                .clickAjaxLoaderClickMeButton()
                .waitForButtonAndClick();
        Assert.assertEquals(popupAndAlertsPage.getPopupTitleText(), "Well Done For Waiting....!!!");
    }
}