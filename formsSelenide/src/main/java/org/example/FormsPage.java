package org.example;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage extends MainPage {

    private final SelenideElement practiceFormButton = $(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
    private final SelenideElement firstNameInput = $(By.xpath("//input[@id='firstName']"));
    private final SelenideElement lastNameInput = $(By.xpath("//input[@id='lastName']"));
    private final SelenideElement submitButton = $(By.xpath("//button[@id='submit']"));
    private final SelenideElement mobileInput  = $(By.xpath("//input[@id='userNumber']"));
    private final SelenideElement maleGenderButton = $(By.xpath("//label[normalize-space()='Male']"));
    private final SelenideElement femaleGenderButton = $(By.xpath("//label[normalize-space()='Female']"));
    private final SelenideElement otherGenderButton = $(By.xpath("//label[normalize-space()='Other']"));
    private final SelenideElement emailInput = $(By.xpath("//input[@id='userEmail']"));
    private final SelenideElement submitFormPopup = $(By.xpath("//div[@class='modal-content']"));
    private final SelenideElement sportsCheckBox = $(By.xpath("//label[normalize-space()='Sports']"));
    private final SelenideElement readingCheckBox = $(By.xpath("//label[normalize-space()='Reading']"));
    private final SelenideElement musicCheckBox = $(By.xpath("//label[normalize-space()='Reading']"));
    private final SelenideElement yearSelect = $(By.xpath("//select[@class='react-datepicker__year-select']"));
    private final SelenideElement monthSelect = $(By.xpath("//select[@class='react-datepicker__month-select']"));
    private final SelenideElement dateOfBirthInput = $(By.id("dateOfBirthInput"));
    private final SelenideElement stateName = $(By.cssSelector(".css-1uccc91-singleValue"));
    private final SelenideElement stateList = $(By.cssSelector(".css-11unzgr"));
    private final SelenideElement stateListArrow = $(By.xpath("(//*[name()='svg'][@class='css-19bqh2r'])[1]"));
    private final SelenideElement cityListArrow = $(By.xpath("(//*[name()='svg'][@class='css-19bqh2r'])[2]"));
    private final SelenideElement cityName = $(By.cssSelector("div[id='city'] div[class=' css-1uccc91-singleValue']"));
    public SelenideElement getCityName() {
        return cityName;
    }
    public SelenideElement getStateName() {
        return stateName;
    }

    public SelenideElement getDateOfBirthInput() {
        return dateOfBirthInput;
    }

    public FormsPage chooseState(String state){
        stateListArrow.click();
        stateList.$(new ByText(state)).click();
        return this;
    }
    public FormsPage chooseCity(String city){
        cityListArrow.click();
        stateList.$(new ByText(city)).click();
        return this;
    }

    public FormsPage chooseDateOfBirth(String day, String month, String year){
        dateOfBirthInput.click();
        yearSelect.click();
        yearSelect.selectOptionContainingText(year);
        monthSelect.click();
        monthSelect.selectOptionContainingText(month);
        $(By.cssSelector("div[aria-label*='"+month+" "+day+"']")).click();
        return this;
    }

    public String stringForValueOfCalendar(String day, String month, String year){
        return day+" "+month.substring(0, 3)+" "+year;
    }

    public SelenideElement getSportsCheckBox() {
        return sportsCheckBox;
    }
    public SelenideElement getMobileInput() {
        return mobileInput;
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
    public FormsPage fillMobileInput(String number){
        mobileInput.type(number);
        return this;
    }
    public FormsPage chooseGender(String gender){
        if(gender.equalsIgnoreCase("female")){
            femaleGenderButton.click();
        } else if (gender.equalsIgnoreCase("male")){
            maleGenderButton.click();
        } else {
           otherGenderButton.click();
        }
        return this;
    }
    public FormsPage fillEmailInput(String email){
        emailInput.type(email);
        return this;
    }

}
