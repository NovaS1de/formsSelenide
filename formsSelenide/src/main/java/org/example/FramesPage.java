package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
public class FramesPage extends MainPage{
    private final SelenideElement iframe1 = $(By.id("frame1"));
    private final SelenideElement iframe2 = $(By.id("frame2"));
    private final SelenideElement h1 = $("h1");
    private final SelenideElement parentFrame = $(By.id("frame1"));
    private final SelenideElement pText = $("p");
    private final SelenideElement body = $("body");
    public SelenideElement getBody() {
        return body;
    }
    public SelenideElement getPText() {
        return pText;
    }
    public SelenideElement getH1() {
        return h1;
    }
    public FramesPage open(){
        Selenide.open("https://demoqa.com/frames");
        return this;
    }
    public FramesPage openNestedFrames(){
        Selenide.open("https://demoqa.com/nestedframes");
        return this;
    }
    public FramesPage switchTo1Iframe(){
        switchTo().frame(iframe1);
        return this;
    }
    public String getPageH1(){
        return h1.getOwnText();
    }
    public FramesPage switchTo2Iframe(){
        switchTo().frame(iframe2);
        return this;
    }
    public FramesPage switchToMain(){
        switchTo().defaultContent();
        return this;
    }
    public FramesPage switchToParentFrame(){
        switchTo().frame(parentFrame);
        return this;
    }
    public FramesPage switchToChildFrameFromParent(){
        switchTo().frame(0);
        return this;
    }
    public FramesPage switchToParentFrameFromChild(){
        switchTo().parentFrame();
        return this;
    }
}