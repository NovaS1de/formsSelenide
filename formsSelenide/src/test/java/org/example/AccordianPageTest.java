package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AccordianPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x900";
    }
    @Test
    public void kek(){
        accordianPage.open().
                clickSection2().
                clickSection3();
    }
}
