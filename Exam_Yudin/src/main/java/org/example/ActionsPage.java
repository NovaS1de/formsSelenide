package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
public class ActionsPage extends MainPage{
    private final SelenideElement doubleClickButton = $("#double-click");
    private final SelenideElement hoverOverMeFirst = $("div[class='dropdown hover'] button[class='dropbtn']");
    private final SelenideElement link1 = $(".list-alert");
    public ActionsPage open(){
        Selenide.open("https://www.webdriveruniversity.com/Actions/index.html#");
        return this;
    }
    public ActionsPage hoverOver(){
        hoverOverMeFirst.hover();
        return this;
    }
    public ActionsPage clickLink1(){
        link1.click();
        return this;
    }
    public String getLink1Text(){
        String link1Text = switchTo().alert().getText();
        switchTo().alert().accept();
        return link1Text;
    }
    public String backgroundColor(){
        return doubleClickButton.getCssValue("background-color");
    }
    public ActionsPage doubleCLick(){
        doubleClickButton.doubleClick();
        return this;
    }
}