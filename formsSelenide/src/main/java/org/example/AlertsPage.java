package org.example;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
public class AlertsPage extends MainPage{
    private final SelenideElement alert = $(By.id("alertButton"));
    private final SelenideElement alert5Seconds = $(By.id("timerAlertButton"));
    private final SelenideElement confirmButton = $(By.id("confirmButton"));
    private final SelenideElement promtButton = $(By.id("promtButton"));
    private final SelenideElement promptResultText = $(By.id("promptResult"));
    private final SelenideElement confirmResultText = $(By.id("confirmResult"));
    public SelenideElement getPromptResultText() {
        return promptResultText;
    }
    public SelenideElement getConfirmResultText() {
        return confirmResultText;
    }
    public SelenideElement getAlert() {
        return alert;
    }
    public SelenideElement getAlert5Seconds() {
        return alert5Seconds;
    }
    public SelenideElement getConfirmButton() {
        return confirmButton;
    }
    public SelenideElement getPromtButton() {
        return promtButton;
    }
    public AlertsPage clickAlert(){
        alert.click();
        return this;
    }
    public AlertsPage switchToAlert(){
        switchTo().alert().accept();
        return this;
    }
    public AlertsPage switchToAlertAccept(){
        switchTo().alert(Duration.ofSeconds(10)).accept();
        return this;
    }
    public AlertsPage switchToAlertAccept(long timeout){
        switchTo().alert(Duration.ofSeconds(timeout)).accept();
        return this;
    }
    public AlertsPage switchToAlertDismiss(long timeout){
        switchTo().alert(Duration.ofSeconds(timeout)).dismiss();
        return this;
    }
    public AlertsPage switchToAlertDismiss(){
        switchTo().alert().dismiss();
        return this;
    }
    public AlertsPage switchToAlertPrompt(String text){
        switchTo().alert().sendKeys(text);
        return this;
    }
    public AlertsPage clickAlert5Seconds(){
        alert5Seconds.click();
        return this;
    }
    public AlertsPage clickConfirmButton(){
        confirmButton.click();
        return this;
    }
    public AlertsPage clickPromtButton(){
        promtButton.click();
        return this;
    }
    public AlertsPage open(){
        Selenide.open("https://demoqa.com/alerts");
        return this;
    }
    public String getAlertText(){
        return switchTo().alert().getText();
    }
    public String getAlertText(long timeout){
        return switchTo().alert(Duration.ofSeconds(timeout)).getText();
    }
    public String getAlertTextAccept(long timeout){
        String text = switchTo().alert(Duration.ofSeconds(timeout)).getText();
        switchTo().alert().accept();
        return text;
    }
    public String getAlertTextAccept(){
        String text = switchTo().alert().getText();
        switchTo().alert().accept();
        return text;
    }
}
