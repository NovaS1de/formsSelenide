package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BrowserWindowsPage extends MainPage{
    private final SelenideElement newTab = $(By.id("tabButton"));
    private final SelenideElement newWindow = $(By.id("windowButton"));
    private final SelenideElement newMessage = $(By.id("messageWindowButton"));
    private final SelenideElement h1 = $(By.id("sampleHeading"));
    public SelenideElement getH1() {
        return h1;
    }
    public BrowserWindowsPage open(){
        Selenide.open("https://demoqa.com/browser-windows");
        return this;
    }
    public BrowserWindowsPage clickNewTabButton(){
        newTab.click();
        switchTo().window(1);
        return this;
    }
    public BrowserWindowsPage clickNewWindowButton(){
        newWindow.click();
        switchTo().window(1);
        return this;
    }
    public BrowserWindowsPage clickNewMessageButton(){
        newMessage.click();
        return this;
    }
    public BrowserWindowsPage switchToMainWindow(){
        switchTo().window(0);
        return this;
    }
    public BrowserWindowsPage closeTheCurrentWindow(){
        closeWindow();
        return this;
    }
}
