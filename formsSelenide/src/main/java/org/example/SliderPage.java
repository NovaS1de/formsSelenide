package org.example;
import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.*;
@Getter
public class SliderPage extends MainPage{
    private final SelenideElement slider = $(".range-slider.range-slider--primary");
    private final SelenideElement sliderValue = $("#sliderValue");
    private int expectedSliderValue;
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
    public SliderPage clickOnSliderNew(int percent){
        slider.click();
        if(percent<50 && percent>=0){
            for (int i = 50; i!=percent; i--){
                slider.sendKeys(Keys.ARROW_LEFT);
            }
        } else if (percent>50 && percent<=100){
            for(int i = 50; i!=percent; i++){
                slider.sendKeys(Keys.ARROW_RIGHT);
            }
        }else if(percent<0 || percent>100){
            System.out.println("ВВЕДЕНО НЕВЕРНОЕ ЗНАЧЕНИЕ!! ИДИ УЧИСЬ ЛОДЫРЬ!");
        }
        return this;
    }
}