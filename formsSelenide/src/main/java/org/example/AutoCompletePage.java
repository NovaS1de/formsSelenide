package org.example;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
public class AutoCompletePage extends MainPage{
    private final SelenideElement singleValueField = $("#autoCompleteSingleContainer");
    private final SelenideElement singleValueInput = $("#autoCompleteSingleInput");
    private final ElementsCollection options = $$(".auto-complete__menu-list.css-11unzgr div[id*=react-select-3-option]");
    public ElementsCollection getOptions() {
        return options;
    }
    public boolean assertOptionSize(int sizeExpected){
        return options.size() == sizeExpected;
    }
    public AutoCompletePage open(){
        Selenide.open("https://demoqa.com/auto-complete");
        return this;
    }
    public AutoCompletePage clickSingleValueField(){
        singleValueField.click();
        return this;
    }
    public AutoCompletePage typeSingleValueInput(String value){
        singleValueInput.sendKeys(value);
        return this;
    }
}