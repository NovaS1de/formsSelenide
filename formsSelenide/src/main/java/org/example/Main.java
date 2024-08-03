package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class Main {

    public static void main(String[] args) {

        CheckboxPage checkboxPage = new CheckboxPage();

        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 60000;

        Selenide.open("https://demoqa.com/checkbox");
        if (checkboxPage.getExcelFileCheckBox().exists()){
            checkboxPage.getExcelFileCheckBox().click();
        }else {
            checkboxPage.getHomeArrowButton().click();
        }
        Selenide.sleep(10000);

    }

}
