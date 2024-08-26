package org.example;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
public class PopupAndAlertsPage extends MainPage{
    private final SelenideElement javaScriptAlertClickMeButton = $("#button1");
    private final SelenideElement ajaxLoaderClickMeButton = $("#button3");
    private final SelenideElement clickMeButton = $("#button1");
    private final SelenideElement h4 = $(".modal-title");
    private final SelenideElement closeButton = $("button[class='btn btn-default']");
    public PopupAndAlertsPage open(){
        Selenide.open("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
        return this;
    }
    public PopupAndAlertsPage clickJavaScriptAlertClickMeButton(){
        javaScriptAlertClickMeButton.click();
        return this;
    }
    public String getAlertText(){
        String alertText = switchTo().alert().getText();
        switchTo().alert().accept();
        return alertText;
    }
    public PopupAndAlertsPage clickAjaxLoaderClickMeButton(){
        ajaxLoaderClickMeButton.click();
        return this;
    }
    public PopupAndAlertsPage waitForButtonAndClick(){
        clickMeButton.shouldHave(Condition.visible, Duration.ofSeconds(10)).click();
        return this;
    }
    public String getPopupTitleText(){
        return h4.getOwnText();
    }
    public PopupAndAlertsPage clickCloseButton(){
        closeButton.click();
        return this;
    }
}