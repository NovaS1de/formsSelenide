package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class ToolTipsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
//    @Test
//    public void kek(){
//        Assert.assertEquals(toolTipsPage.open()
//                .hoverToolTipText1()
//                .getToolTip()
//                .getOwnText(), "You hovered over the Contrary");
//    }
    @Test
    public void keke(){
        Assert.assertEquals(toolTipsPage.open()
                .hoverToolTipText2()
                .getToolTip()
                .getOwnText(), "You hovered over the 1.10.32");
    }
}