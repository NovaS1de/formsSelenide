package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.zoom;
public class AccordianPage extends MainPage{
    private final SelenideElement section2 = $(By.id("section2Heading"));
    private final SelenideElement section3 = $(By.id("section3Heading"));
    public AccordianPage open(){
        Selenide.open("https://demoqa.com/accordian");
        zoom(1.8);
        return this;

    }
    public AccordianPage clickSection2(){
        section2.click();
        return this;
    }
    public AccordianPage clickSection3(){
        section3.scrollTo();
        section3.click();
        return this;
    }
}
