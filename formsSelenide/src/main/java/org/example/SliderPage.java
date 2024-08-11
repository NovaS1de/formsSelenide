package org.example;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class SliderPage extends MainPage{
    private final SelenideElement slider = $(".range-slider.range-slider--primary");
    public SliderPage open(){
        Selenide.open("https://demoqa.com/slider");
        return this;
    }
    private int getCoordinates(int percent){
        int width = 500;
        executeJavaScript("document.querySelector(\"input[type='range']\").style.width = '"+width+"px'");
        int coordinates;
        if(percent<50 && percent>=0){
            coordinates = (int) (-(50-percent)*(width/100));
        } else if (percent == 50) {
            coordinates = 0;
        }else if(percent>50 && percent<=100){
            coordinates = (int) ((percent-50)*(width/100));
        }else {
            coordinates = 0;
            System.out.println("Введены невалидные координаты.\n"+"Допустимые значения: 0 - 100.");
        }
        return coordinates;
    }
    public SliderPage clickOnSlider(int percent){
        slider.click(ClickOptions.withOffset(getCoordinates(percent), 0)).click();
        return this;
    }
}