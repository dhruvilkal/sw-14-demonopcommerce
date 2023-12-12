package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li")
    WebElement getAllTopManu;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktops;





    public List<WebElement> getAllTopManuName () {
        List<WebElement> getListOfElements = driver.findElements((By) getAllTopManu);
        return getListOfElements;
    }

        public void clickOnLoginLink(){
            mouseHoverToElementAndClick(loginLink);
        }
    public void clickOnRegisterLink(){
        mouseHoverToElementAndClick(registerLink);
    }

    public void clickOnComputersMenu(){
        mouseHoverToElementAndClick(computersMenu);
    }
    public void mouseHoverOnComputerMenu(){
        mouseHoverToElement(computersMenu);
    }
    public void clickOnDesktop(){
        mouseHoverToElementAndClick(desktops);
    }
    }

