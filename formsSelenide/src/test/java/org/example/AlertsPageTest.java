package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class AlertsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void keke(){
        String alertText = alertsPage.open().clickAlert().getAlertText();
        alertsPage.switchToAlertAccept();
        Assert.assertEquals(alertText, "You clicked a button");
    }
    @Test
    public void kekes(){
        String alertText = alertsPage.open().clickAlert5Seconds().getAlertText(7);
        alertsPage.switchToAlertAccept();
        Assert.assertEquals(alertText, "This alert appeared after 5 seconds");
    }
    @Test
    public void kekesik(){
        String alertText = alertsPage.open().clickConfirmButton().getAlertTextAccept();
        Assert.assertEquals(alertText, "Do you confirm action?");
        Assert.assertEquals(alertsPage.getConfirmResultText().getText(), "You selected Ok");
    }
    @Test
    public void kekesiki(){
        String promtText = "lolipop";
        String alertText = alertsPage.open().clickPromtButton().getAlertText();
        alertsPage.switchToAlertPrompt(promtText).switchToAlertAccept();
        Assert.assertEquals(alertText, "Please enter your name");
        Assert.assertEquals(alertsPage.getPromptResultText().getText(), "You entered "+promtText);
    }
}