package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

public class FormsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1366x720";
    }
    @Test
    public void testingForm(){
        homePage.open().clickFormsButton().clickPracticeFormButton().fillFirstName("Tommy").fillLastName("Rexis").fillMobileNumber("0000000000").clickGenderMaleButton().clickSubmitButton().fillEmail("kek@kek.kek");
        Assert.assertTrue(formsPage.getSubmitFormPopup().isDisplayed());
        sleep(5000);
    }
}
