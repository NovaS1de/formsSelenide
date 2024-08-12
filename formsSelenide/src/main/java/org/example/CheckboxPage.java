package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckboxPage extends MainPage {

    ArrayList<String> listOfCheckBoxes = new ArrayList<String>();

    public CheckboxPage() {

        listOfCheckBoxes.add("You have selected :");

    }

    private final SelenideElement collapseAllButton = $("button[title='Collapse all']");
    private final SelenideElement expandAllButton = $("button[title='Expand all']");
    private final SelenideElement downloadArrowButton = $(By.xpath("//li[3]//span[1]//button[1]"));
    private final SelenideElement documentsArrowButton = $(By.xpath("//li[2]//span[1]//button[1]"));
    private final SelenideElement desktopArrowButton = $(By.xpath("//li[1]//span[1]//button[1]"));
    private final SelenideElement homeArrowButton = $(By.xpath("(//button[@title='Toggle'])[1]"));
    private final SelenideElement workspaceArrowButton = $(By.xpath("//li[2]//li[1]//span//button"));
    private final SelenideElement officeArrowButton = $(By.xpath("//li[2]//li[2]//span//button"));
    private final SelenideElement excelFileCheckBox = $("label[for='tree-node-excelFile'] span[class='rct-checkbox']");
    private final SelenideElement resultText = $(By.id("result"));
    private final SelenideElement wordFileCheckBox = $("label[for='tree-node-wordFile'] span[class='rct-checkbox']");
    private final SelenideElement downloadCheckBox = $("label[for='tree-node-downloads'] span[class='rct-checkbox']");
    private final SelenideElement generalCheckBox = $("label[for='tree-node-general'] span[class='rct-checkbox']");
    private final SelenideElement classifiedCheckBox = $("label[for='tree-node-classified'] span[class='rct-checkbox']");
    private final SelenideElement privateCheckBox = $("label[for='tree-node-private'] span[class='rct-checkbox']");
    private final SelenideElement publicCheckBox = $("label[for='tree-node-public'] span[class='rct-checkbox']");
    private final SelenideElement officeCheckBox = $("label[for='tree-node-office'] span[class='rct-checkbox']");
    private final SelenideElement veuCheckBox = $("label[for='tree-node-veu'] span[class='rct-checkbox']");
    private final SelenideElement angualarCheckBox = $("label[for='tree-node-angular'] span[class='rct-checkbox']");
    private final SelenideElement reactCheckBox = $("label[for='tree-node-react'] span[class='rct-checkbox']");
    private final SelenideElement workSpaceCheckBox = $("label[for='tree-node-workspace'] span[class='rct-checkbox']");
    private final SelenideElement documentsCheckBox = $("label[for='tree-node-documents'] span[class='rct-checkbox']");
    private final SelenideElement commandsCheckBox = $("label[for='tree-node-commands'] span[class='rct-checkbox']");
    private final SelenideElement notesCheckBox = $("label[for='tree-node-notes'] span[class='rct-checkbox']");
    private final SelenideElement desktopCheckBox = $("label[for='tree-node-desktop'] span[class='rct-checkbox']");
    private final SelenideElement homeCheckBox = $("label[for='tree-node-home'] span[class='rct-checkbox']");

    private boolean everythingIsChecked() {
        return (desktopCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check") &&
                documentsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check") &&
                downloadCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check"));
    }

    private void smartClick(SelenideElement child, SelenideElement parent, String parentName) {

        SelenideElement arrowButton;
        if (parentName.equalsIgnoreCase("downloadCheckBox")) {
            arrowButton = downloadArrowButton;
        } else if (parentName.equalsIgnoreCase("documentsCheckBox")) {
            arrowButton = documentsArrowButton;
        } else if (parentName.equalsIgnoreCase("desktopCheckBox")) {
            arrowButton = desktopArrowButton;
        } else {
            arrowButton = expandAllButton;
        }

        if (child.exists()) {
            child.click();
        } else {
            if (!parent.exists()) {
                homeArrowButton.click();
                if (child.exists()) {
                    child.click();
                } else {
                    arrowButton.click();
                    child.click();
                }
            }
        }
    }

    private void smartClick(SelenideElement child, SelenideElement parent) {

        SelenideElement arrowButton;
        if (parent.equals(downloadCheckBox)) {
            arrowButton = downloadArrowButton;
        } else if (parent.equals(documentsCheckBox)) {
            arrowButton = documentsArrowButton;
        } else if (parent.equals(desktopCheckBox)) {
            arrowButton = desktopArrowButton;
        } else {
            arrowButton = expandAllButton;
        }

        if (child.exists()) {
            child.click();
        } else {
            if (!parent.exists()) {
                homeArrowButton.click();
                if (child.exists()) {
                    child.click();
                } else {
                    arrowButton.click();
                    child.click();
                }
            }
        }
    }

    private boolean homeIsChecked() {
        return homeCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check");
    }

    private void homeManagement(boolean homeIsChecked) {
        if (homeIsChecked) {
            listOfCheckBoxes.remove("home");
        } else if (homeIsChecked()) {
            listOfCheckBoxes.add("home");
        }
    }
    private void checkBoxClicking(SelenideElement checkBox){
        String string = "";
        if(checkBox.equals(excelFileCheckBox)){
            string = "excelFile";
        }else if(checkBox.equals(wordFileCheckBox)){
            string = "wordFile";
        } else if(checkBox.equals(homeCheckBox)) {
            string = "home";
        } else if (checkBox.equals(desktopCheckBox)) {
            string = "desktop";
        } else if (checkBox.equals(notesCheckBox)) {
            string = "notes";
        } else if (checkBox.equals(commandsCheckBox)) {
            string = "commands";
        }else if(checkBox.equals(documentsCheckBox)) {
            string = "documents";
        } else if (checkBox.equals(workSpaceCheckBox)) {
            string = "workspace";
        } else if (checkBox.equals(reactCheckBox)) {
            string = "react";
        } else if (checkBox.equals(angualarCheckBox)) {
            string = "angular";
        }else if(checkBox.equals(veuCheckBox)) {
            string = "veu";
        } else if (checkBox.equals(officeCheckBox)) {
            string = "office";
        } else if (checkBox.equals(publicCheckBox)) {
            string = "public";
        } else if (checkBox.equals(privateCheckBox)) {
            string = "private";
        }else if(checkBox.equals(classifiedCheckBox)) {
            string = "classified";
        } else if (checkBox.equals(generalCheckBox)) {
            string = "general";
        } else if (checkBox.equals(downloadCheckBox)) {
            string = "downloads";
        }
        if (checkBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add(string);
        } else {
            listOfCheckBoxes.remove(string);
        }
    }

    public SelenideElement getHomeArrowButton(){return homeArrowButton;}

    public SelenideElement getWordFileCheckBox() {
        return wordFileCheckBox;
    }

    public SelenideElement getDownloadCheckBox() {
        return downloadCheckBox;
    }

    public SelenideElement getGeneralCheckBox() {
        return generalCheckBox;
    }

    public SelenideElement getClassifiedCheckBox() {
        return classifiedCheckBox;
    }

    public SelenideElement getPrivateCheckBox() {
        return privateCheckBox;
    }

    public SelenideElement getPublicCheckBox() {
        return publicCheckBox;
    }

    public SelenideElement getOfficeCheckBox() {
        return officeCheckBox;
    }

    public SelenideElement getVeuCheckBox() {
        return veuCheckBox;
    }

    public SelenideElement getAngualarCheckBox() {
        return angualarCheckBox;
    }

    public SelenideElement getReactCheckBox() {
        return reactCheckBox;
    }

    public SelenideElement getWorkSpaceCheckBox() {
        return workSpaceCheckBox;
    }

    public SelenideElement getDocumentsCheckBox() {
        return documentsCheckBox;
    }

    public SelenideElement getCommandsCheckBox() {
        return commandsCheckBox;
    }

    public SelenideElement getNotesCheckBox() {
        return notesCheckBox;
    }

    public SelenideElement getDesktopCheckBox() {
        return desktopCheckBox;
    }

    public SelenideElement getHomeCheckBox() {
        return homeCheckBox;
    }

    public SelenideElement getExcelFileCheckBox() {
        return excelFileCheckBox;
    }
    public SelenideElement getResultText() {
        return resultText;
    }
    public CheckboxPage clickHomeArrow() {
        homeArrowButton.click();
        return this;
    }
    public CheckboxPage clickDocumentsArrow() {
        documentsArrowButton.click();
        return this;
    }
    public CheckboxPage clickDownloadArrow() {
        downloadArrowButton.click();
        return this;
    }
    public CheckboxPage open() {
        Selenide.open("https://demoqa.com/checkbox");
        return this;
    }
    public CheckboxPage desktopArrowClick() {
        desktopArrowButton.click();
        return this;
    }
    public CheckboxPage workspaceArrowClick() {
        workspaceArrowButton.click();
        return this;
    }
    public CheckboxPage officeArrowClick() {
        officeArrowButton.click();
        return this;
    }
    public CheckboxPage clickExpandAllButton() {
        expandAllButton.click();
        return this;
    }
    public CheckboxPage clickExcelFileCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(excelFileCheckBox, downloadCheckBox);
        checkBoxClicking(excelFileCheckBox);
        if (downloadCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("downloads");
        } else if (!(downloadCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                wordFileCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("downloads");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public CheckboxPage clickWordFileCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(wordFileCheckBox, downloadCheckBox, "downloadCheckBox");
        checkBoxClicking(wordFileCheckBox);
        if (downloadCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("downloads");
        } else if (!(downloadCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                excelFileCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("downloads");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public CheckboxPage clickNotesCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(notesCheckBox, desktopCheckBox, "desktopCheckBox");
        checkBoxClicking(notesCheckBox);
        if (desktopCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("desktop");
        } else if (!(desktopCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                commandsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("desktop");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public CheckboxPage clickCommandsCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(commandsCheckBox, desktopCheckBox);
        checkBoxClicking(commandsCheckBox);
        if (desktopCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("desktop");
        } else if (!(desktopCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                commandsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("desktop");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public CheckboxPage clickWorkSpaceCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(workSpaceCheckBox, documentsCheckBox, "documentsCheckBox");
        if (workSpaceCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("workspace");
            listOfCheckBoxes.add("react");
            listOfCheckBoxes.add("angular");
            listOfCheckBoxes.add("veu");
        } else {
            listOfCheckBoxes.remove("workspace");
            listOfCheckBoxes.remove("react");
            listOfCheckBoxes.remove("angular");
            listOfCheckBoxes.remove("veu");
        }
        if (documentsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("documents");
        } else if (!(documentsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                officeCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("documents");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public CheckboxPage clickOfficeCheckBox() {
        boolean homeIsChecked = homeIsChecked();
        smartClick(officeCheckBox, documentsCheckBox, "documentsCheckBox");
        if (officeCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("office");
            listOfCheckBoxes.add("private");
            listOfCheckBoxes.add("public");
            listOfCheckBoxes.add("classified");
            listOfCheckBoxes.add("general");
        } else {
            listOfCheckBoxes.remove("office");
            listOfCheckBoxes.remove("private");
            listOfCheckBoxes.remove("public");
            listOfCheckBoxes.remove("classified");
            listOfCheckBoxes.remove("general");
        }

        if (documentsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.add("documents");
        } else if (!(documentsCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) &&
                workSpaceCheckBox.lastChild().getAttribute("class").equals("rct-icon rct-icon-check")) {
            listOfCheckBoxes.remove("documents");
        }
        homeManagement(homeIsChecked);
        return this;
    }
    public String[] getSortedTextArray(){
        String [] array = getResultText().getText().split("\n");
        Arrays.sort(array);
        return array;
    }
    public boolean checkAmountOfCheckBoxes(int size){
        return $$(".rct-text").size() == size;
    }
    public ArrayList<String> letsGO(){
        for(SelenideElement element : $$(".rct-text")){
            if(element.find(By.cssSelector(".rct-icon")).getAttribute("class").contains("check")){
                String title = element.find(By.cssSelector(".rct-title")).getOwnText();
                title = Character.toLowerCase(title.charAt(0))+title.substring(1);
                listOfCheckBoxes.add(title);
                System.out.println(title);
            }
        }
        return listOfCheckBoxes;
    }
}