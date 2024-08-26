package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
@Getter
public class IFramePage extends MainPage {
    private final SelenideElement iFrame = $("#frame");
    private final SelenideElement findOutMoreButton = $("#button-find-out-more");
    private final SelenideElement findOutMoreText = $("div[class='modal-body'] p");
    private final SelenideElement ourProducts = $("nav[id='div-main-nav'] li:nth-child(2)");
    private final SelenideElement specialOffers = $("#special-offers");
    private final SelenideElement closeButton = $("button:nth-child(2)");
    public IFramePage open(){
        Selenide.open("https://www.webdriveruniversity.com/IFrame/index.html");
        return this;
    }
    public IFramePage switchToIFrame(){
        switchTo().frame(iFrame);
        return this;
    }
    public IFramePage clickFindOutMoreButton(){
        findOutMoreButton.click();
        return this;
    }
    public IFramePage clickOurProductsButton(){
        ourProducts.click();
        return this;
    }
    public IFramePage clickSpecialOffers(){
        specialOffers.click();
        return this;
    }
    public IFramePage clickCloseButton(){
        closeButton.click();
        return this;
    }
}