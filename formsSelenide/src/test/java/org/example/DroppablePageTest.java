package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DroppablePageTest extends MainTest {

    @BeforeSuite
    public void config(){
        Configuration.pageLoadTimeout = 60000;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void kekeslav(){

        droppablePage.open().dragAndDrop();


    }

}
