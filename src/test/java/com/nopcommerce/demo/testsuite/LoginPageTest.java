package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;



    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }





    @Test(groups = {"sanity","smoke" ,"regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getWelcomeText(),"Welcome, Please Sign In!");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyErrorMessageWithInValidCredentials(){
homePage.clickOnLoginLink();
loginPage.sendDataToEmailField("dhr@gmail.com");
loginPage.sendDataToPasswordField("123456");
loginPage.clickOnLoginButton();

        Assert.assertEquals(loginPage.getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }
    @Test(groups = { "regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.sendDataToEmailField("manish@gmail.com");
        loginPage.sendDataToPasswordField("123456");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLogOutLink(),"Log out");

    }
    @Test(groups = { "regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.sendDataToEmailField("manish@gmail.com");
        loginPage.sendDataToPasswordField("123456");
        loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutButton();
        Assert.assertEquals(loginPage.getLogINText(),"Log in");
    }
}
