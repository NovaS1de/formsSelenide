package org.example;

import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class DroppablePage extends MainPage {

    private final SelenideElement draggable = $(By.id("draggable"));
    private final SelenideElement droppable = $(By.id("droppable"));


    public DroppablePage open(){

        open("https://demoqa.com/droppable");

        return this;
    }

    public DroppablePage dragAndDrop(){

        actions().dragAndDrop(draggable, droppable);
        return this;
    }


}
