package org.example;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
public class MainPage {
    public MainPage open(String urlOrPath){
        Selenide.open(urlOrPath);
        return this;
    }
    public MainPage click(SelenideElement... elements){
        for (SelenideElement element : elements){
            element.click();
        }
        return this;
    }
    public MainPage hoverOver(SelenideElement ... elements){
        for (SelenideElement element : elements){
            element.hover();
        }
        return this;
    }
    public MainPage sendKeysTo(SelenideElement el, String text){
        el.sendKeys(text);
        return this;
    }
    public MainPage dragAndDropTo(SelenideElement elFrom, SelenideElement elTo){
        elFrom.dragAndDrop(DragAndDropOptions.to(elTo));
        return this;
    }
}