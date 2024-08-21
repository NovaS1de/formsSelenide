package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;
@Getter
public class TextBoxPage extends MainPage{
    private final SelenideElement fullNameInput = $("#userName");
    private final SelenideElement emailInput = $("#userEmail");
    private final SelenideElement currentAddressInput = $("#currentAddress");
    private final SelenideElement permanentAddressInput = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");
    private final SelenideElement nameText = $("#name");
    private final SelenideElement emailText = $("#email");
    private final SelenideElement currentAddressText = $("p[id='currentAddress']");
    private final SelenideElement permanentAddressText = $("#permanentAddress");
    public TextBoxPage open(){
        Selenide.open("https://demoqa.com/text-box");
        return this;
    }
    public String reduceStringToResult(SelenideElement el){
        return el.getOwnText().replaceAll("^.*\n", "").replaceAll("\n ", "");
    }
}