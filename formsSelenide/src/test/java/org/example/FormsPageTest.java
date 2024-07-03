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
        Configuration.browserSize = "1920x1080";
    }
//    @Test
//    public void testingForm(){
//        homePage.open().clickFormsButton().clickPracticeFormButton().fillFirstName("Tommy").fillLastName("Rexis")
//        .fillMobileNumber("0000000000").clickGenderMaleButton().fillEmail("kek@kek.kek")
//        .click(formsPage.getSportsCheckBox(), formsPage.getMusicCheckBox()).toFormsPage().clickSubmitButton();
//        Assert.assertTrue(formsPage.getSubmitFormPopup().isDisplayed());
//        sleep(5000);
//    }
    @Test
    public void testingFormInvalid(){
        homePage.open().clickFormsButton().clickPracticeFormButton();
        String oldColor = formsPage.getMobileNumberInput().getCssValue("border-color");
        formsPage.fillFirstName("Tommy").fillLastName("Rexis")
                .fillMobileNumber("0").clickGenderMaleButton().fillEmail("kek@kek.kek")
                .click(formsPage.getSportsCheckBox(), formsPage.getMusicCheckBox()).toFormsPage().clickSubmitButton();
        Assert.assertNotEquals(formsPage.getMobileNumberInput().getCssValue("border-color"), oldColor);
        sleep(5000);
    }
}
