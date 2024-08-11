package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.sleep;
public class SliderPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 70000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void kek(){
        sliderPage.open().
                clickOnSlider(5);
        sleep(10000);
    }
}