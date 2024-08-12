package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.sleep;
import static java.util.Arrays.sort;
public class CheckboxPageTest extends MainTest {
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
//    @Test
//    public void kekeslav(){
//        CheckboxPage checkboxPage = new CheckboxPage();
//        checkboxPage.open().
//                clickWordFileCheckBox().
//                clickExcelFileCheckBox();
//        System.out.println(Arrays.toString(checkboxPage.getSortedTextArray()));
//        System.out.println(Arrays.toString(checkboxPage.listOfCheckBoxes.stream().sorted().toArray()));
//        Assert.assertEquals(checkboxPage.getSortedTextArray(),
//                checkboxPage.listOfCheckBoxes.stream().sorted().toArray());
//        sleep(10000);
//    }
    @Test
    public void kek(){
        CheckboxPage checkboxPage = new CheckboxPage();
//        Assert.assertTrue(checkboxPage.open().
//                clickExpandAllButton().
//                checkAmountOfCheckBoxes(17));
        checkboxPage.open().
                clickExpandAllButton().
                getHomeCheckBox().click();
        checkboxPage.letsGO();
    }
}