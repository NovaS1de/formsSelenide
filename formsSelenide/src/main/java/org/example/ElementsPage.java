package org.example;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
@Getter
public class ElementsPage extends MainPage {
    private final SelenideElement webTablesButton = $(By.xpath("//span[normalize-space()='Web Tables']"));
    private final SelenideElement addButton = $(By.id("addNewRecordButton"));
    private final SelenideElement modalWindow = $(By.xpath("//div[@class='modal-content']"));
    private final SelenideElement registrationFormHeader = $(By.id("registration-form-modal"));
    public ElementsPage clickWebTablesButton(){
        webTablesButton.click();
        return this;
    }
    public ElementsPage clickAddButton(){
        addButton.click();
        return this;
    }
    public ElementsPage waitForModalWindow(){
        modalWindow.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return this;
    }
    public ElementsPage open(){
        Selenide.open("https://demoqa.com/webtables");
        return this;
    }
}