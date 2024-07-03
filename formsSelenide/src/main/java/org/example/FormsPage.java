package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage extends MainPage {
    private final SelenideElement practiceFormButton = $(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
    private final SelenideElement firstNameInput = $(By.xpath("//input[@id='firstName']"));
    private final SelenideElement lastNameInput = $(By.xpath("//input[@id='lastName']"));
    private final SelenideElement submitButton = $(By.xpath("//button[@id='submit']"));
    private final SelenideElement genderMaleButton = $(By.xpath("//label[normalize-space()='Male']"));
    private final SelenideElement mobileNumberInput = $(By.xpath("//input[@id='userNumber']"));
    private final SelenideElement emailInput = $(By.xpath("//input[@id='userEmail']"));
    private final SelenideElement submitFormPopup = $(By.xpath("//div[@class='modal-content']"));
    private final SelenideElement sportsCheckBox = $(By.xpath("//label[normalize-space()='Sports']"));
    private final SelenideElement readingCheckBox = $(By.xpath("//label[normalize-space()='Reading']"));
    private final SelenideElement musicCheckBox = $(By.xpath("//label[normalize-space()='Music']"));
    public SelenideElement getMobileNumberInput() {
        return mobileNumberInput;
    }
    public SelenideElement getSportsCheckBox() {
        return sportsCheckBox;
    }
    public SelenideElement getReadingCheckBox() {
        return readingCheckBox;
    }
    public SelenideElement getMusicCheckBox() {
        return musicCheckBox;
    }
    public SelenideElement getSubmitFormPopup() {
        return submitFormPopup;
    }
    public FormsPage clickPracticeFormButton(){
        practiceFormButton.click();
        return this;
    }
    public FormsPage fillFirstName(String firstName){
        firstNameInput.type(firstName);
        return this;
    }
    public FormsPage fillLastName(String lastName){
        lastNameInput.type(lastName);
        return this;
    }
    public FormsPage clickSubmitButton(){
        submitButton.click();
        return this;
    }
    public FormsPage clickGenderMaleButton(){
        genderMaleButton.click();
        return this;
    }
    public FormsPage fillMobileNumber(String mobileNumber){
        mobileNumberInput.type(mobileNumber);
        return this;
    }
    public FormsPage fillEmail(String email){
        emailInput.type(email);
        return this;
    }
}
