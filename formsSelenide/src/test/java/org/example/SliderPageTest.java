package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.sleep;
public class SliderPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
//    @Parameters({"percent"})
    public void kek(){
        int percent = 40;
        sliderPage.open().
                clickOnSliderNew(percent);
        Assert.assertEquals(Integer.parseInt(sliderPage.getSliderValue().getValue()), percent);
        sleep(10000);
    }
}