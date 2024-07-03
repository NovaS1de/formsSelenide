package org.example;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public MainPage open(String urlOrPath){
        Selenide.open(urlOrPath);
        return this;
    }
}
