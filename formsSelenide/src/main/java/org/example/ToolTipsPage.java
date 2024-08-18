package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
public class ToolTipsPage extends MainPage{
    private final SelenideElement toolTipText1 = $("div[class='col-12 mt-4 col-md-6'] a:nth-child(1)");
    private final SelenideElement toolTipText2 = $("div[class='col-12 mt-4 col-md-6'] a:nth-child(2)");
    private final SelenideElement toolTip = $(".tooltip-inner");
    public SelenideElement getToolTip() {
        return toolTip;
    }
    public ToolTipsPage open(){
        Selenide.open("https://demoqa.com/tool-tips");
        return this;
    }
    public ToolTipsPage hoverToolTipText1(){
        toolTipText1.hover();
        return this;
    }
    public ToolTipsPage hoverToolTipText2(){
        toolTipText2.hover();
        return this;
    }
}