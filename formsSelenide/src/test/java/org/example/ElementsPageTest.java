package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.sleep;
public class ElementsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void testingWebTable(){
        homePage.open()
                .clickElementsButton()
                .clickWebTablesButton()
                .clickAddButton()
                .waitForModalWindow();
        Assert.assertEquals(elementsPage.getRegistrationFormHeader().getOwnText(), "Registration Form");
    }
}