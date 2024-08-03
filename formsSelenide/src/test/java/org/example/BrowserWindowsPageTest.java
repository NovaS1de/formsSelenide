package org.example;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
public class BrowserWindowsPageTest extends MainTest{
    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void kekes(){
        browserWindowsPage.open().
                clickNewTabButton().
                getH1().
                shouldHave(text("This is a sample page"));
        browserWindowsPage.closeTheCurrentWindow().
                switchToMainWindow().
                clickNewWindowButton().
                getH1().
                shouldHave(text("This is a sample page"));
        sleep(10000);
    }
}
