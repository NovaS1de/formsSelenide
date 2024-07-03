package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static constants.Constants.URL_OF_SITE;

public class HomePage extends MainPage{
    private final SelenideElement formsButton = $(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[2]/div[1]"));
    public HomePage open() {
        Selenide.open(URL_OF_SITE);
        return this;
    }
    public FormsPage clickFormsButton(){
        formsButton.click();
        return new FormsPage();
    }
}
