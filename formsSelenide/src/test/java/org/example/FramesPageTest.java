package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class FramesPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
//    @Test
//    public void kek(){
//        Assert.assertEquals(framesPage.open().switchTo2Iframe().getPageH1(), "This is a sample page");
//        Assert.assertEquals(framesPage.switchToMain().getPageH1(), "Frames");
//    }
    @Test
    public void keke(){
        System.out.println(framesPage.openNestedFrames().
                switchToParentFrame().
                switchToChildFrameFromParent().
                switchToParentFrameFromChild().
                getBody().
                getOwnText());
    }
}