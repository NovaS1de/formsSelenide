package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import static com.codeborne.selenide.Selenide.$;
public class MenuPage extends MainPage{
    private final SelenideElement mainMenu2 = $(new ByText("Main Item 2"));
    private final SelenideElement subSubList = $(new ByText("SUB SUB LIST »"));
    private final SelenideElement subSubItem1 = $(new ByText("Sub Sub Item 1"));
    public MenuPage open(){
        Selenide.open("https://demoqa.com/menu");
        return this;
    }
    public SelenideElement getSubSubItem1() {
        return subSubItem1;
    }
    public SelenideElement getMainMenu2() {
        return mainMenu2;
    }
    public SelenideElement getSubSubList() {
        return subSubList;
    }
}