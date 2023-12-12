package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
@CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
@CacheLookup
@FindBy(xpath = "//input[@id='Email']")
WebElement emailField ;

@CacheLookup
@FindBy(id ="Password")
WebElement passwordField;
@CacheLookup
@FindBy(xpath = "//button[normalize-space()='Log in']")
WebElement loginButton;


@CacheLookup
@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement logInText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLinkButton;







    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        return message;
    }
    public void sendDataToEmailField (String emailId) {
        sendTextToElement(emailField, emailId);
    }
    public void sendDataToPasswordField (String password) {
        sendTextToElement(passwordField, password);
    }
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
    return getTextFromElement(errorMessage);

    }
    public String getLogOutLink(){
        return getTextFromElement(logOutLink);

    }
    public String getLogINText(){
        return getTextFromElement(logInText);
    }
    public void clickOnLogOutButton(){
        mouseHoverToElementAndClick(logOutLinkButton);
    }
}
