package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
@CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement welcomeText;

@CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleRadioButton;

@CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

@CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

@CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement day;

@CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;

@CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

@CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

@CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

@CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;

@CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

@CacheLookup
@FindBy(xpath = "//div[@class='result']")
WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailFieldError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordFieldError;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordError;








    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        return message;
    }
    public void clickOnRadioButton(){
        mouseHoverToElementAndClick(maleRadioButton);
    }
    public void enterFirstName(String firstname){
        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname){
        sendTextToElement(lastName,lastname);
    }
    public void selectDayByValue(String value){
        selectByValueFromDropDown(day,value);
    }
    public void selectMonthByValue(String value){
        selectByValueFromDropDown(month,value);
    }
    public void selectYearByValue(String value){
        selectByValueFromDropDown(year,value);
    }
    public void enterEmailField(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPasswordField(String password){
        sendTextToElement(confirmPassword,password);
    }
    public void clickOnRegisterButton(){
        mouseHoverToElementAndClick(registerButton);
    }
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    public String getFirstNameError(){
        return getTextFromElement(firstNameError);
    }
    public String getLastNameError(){
        return getTextFromElement(lastNameError);
    }
    public String getEmailFieldError(){
        return getTextFromElement(emailFieldError);
    }
    public String getPasswordFieldError(){
        return getTextFromElement(passwordFieldError);
    }
    public String getConfirmPasswordFieldError(){
        return getTextFromElement(confirmPasswordError);
    }








}
