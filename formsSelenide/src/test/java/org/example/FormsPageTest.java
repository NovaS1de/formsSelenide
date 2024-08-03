package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static com.codeborne.selenide.Selenide.*;

public class FormsPageTest extends MainTest {

    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }

//    @Test
//    public void testingForm(){
//        homePage.open()
//                .clickFormsButton()
//                .clickPracticeFormButton()
//                .fillFirstName("kek")
//                .fillLastName("kekov")
//                .fillMobileInput("9999999999")
//                .chooseGender("male")
//                .fillEmailInput("keke@kek.keks")
//                .click(formsPage.getSportsCheckBox(), formsPage.getReadingCheckBox(), formsPage.getMusicCheckBox())
//                .toFormsPage()
//                .clickSubmitButton();
//
//        Assert.assertTrue(formsPage.getSubmitFormPopup().isDisplayed());
//    }

//    @Test
//    public void testingFormInvalid(){
//        homePage.open()
//                .clickFormsButton()
//                .clickPracticeFormButton();
//
//        String oldColor = formsPage.getMobileInput().getCssValue("border-color");
//
//        formsPage.fillFirstName("kek")
//                .fillLastName("kekov")
//                .fillMobileInput("9")
//                .chooseGender("male")
//                .fillEmailInput("keke@kek.keks")
//                .click(formsPage.getSportsCheckBox(), formsPage.getReadingCheckBox(), formsPage.getMusicCheckBox())
//                .toFormsPage()
//                .clickSubmitButton();
//
//        Assert.assertNotEquals(formsPage.getMobileInput().getCssValue("border-color"), oldColor);
//        sleep(5000);
//    }

//    @Test
//    public void chooseDate(){
//        String day = "15";
//        String month = "January";
//        String year = "1980";
//        homePage.open()
//                .clickFormsButton()
//                .clickPracticeFormButton()
//                .chooseDateOfBirth(day, month, year);
//
//        Assert.assertEquals(formsPage.getDateOfBirthInput().getValue(),
//                formsPage.stringForValueOfCalendar(day, month, year));
//        System.out.println(formsPage.stringForValueOfCalendar(day, month, year));
//        System.out.println(formsPage.getDateOfBirthInput().getValue());
//        sleep(5000);
//    }

    @Test
    public void chooseState() {
        String state = "NCR";
        String city = "Delhi";

        homePage.open()
                .clickFormsButton()
                .clickPracticeFormButton()
                .chooseState(state)
                .chooseCity(city);

        Assert.assertEquals(formsPage.getStateName().getOwnText(), state);
        Assert.assertEquals(formsPage.getCityName().getOwnText(), city);

        sleep(5000);
    }

}
