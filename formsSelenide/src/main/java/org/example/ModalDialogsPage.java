package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
public class ModalDialogsPage extends MainPage{
    private final SelenideElement smallDialog = $(By.id("showSmallModal"));
    private final SelenideElement largeDialog = $(By.id("showLargeModal"));
    private final SelenideElement smallText = $(By.className("modal-body"));
    private final SelenideElement largeText = $("p");
    private final SelenideElement closeSmallDialog = $(By.id("closeSmallModal"));
    private final SelenideElement closeLargeDialog = $(By.id("closeLargeModal"));
    public SelenideElement getLargeText() {
        return largeText;
    }
    public SelenideElement getSmallText() {
        return smallText;
    }
    public ModalDialogsPage open(){
        Selenide.open("https://demoqa.com/modal-dialogs");
        return this;
    }
    public ModalDialogsPage clickSmallDialog(){
        smallDialog.click();
        return this;
    }
    public ModalDialogsPage clickLargeDialog(){
        largeDialog.click();
        return this;
    }
    public ModalDialogsPage clickCloseSmall(){
        closeSmallDialog.click();
        return this;
    }
    public ModalDialogsPage clickCloseLarge(){
        closeLargeDialog.click();
        return this;
    }
}
