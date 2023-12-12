package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }




@Test(groups = {"sanity","smoke" ,"regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
    Assert.assertEquals(registerPage.getWelcomeText(),"Register");
    }
    @Test(groups = {"smoke", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.getFirstNameError(),"First name is required.");
        Assert.assertEquals(registerPage.getLastNameError(),"Last name is required.");
        Assert.assertEquals(registerPage.getEmailFieldError(),"Email is required.");
        Assert.assertEquals(registerPage.getPasswordFieldError(),"Password is required.");
        Assert.assertEquals(registerPage.getConfirmPasswordFieldError(),"Password is required.");





    }
@Test(groups = { "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("manish");
        registerPage.enterLastName("patel");
        registerPage.selectDayByValue("2");
        registerPage.selectMonthByValue("5");
        registerPage.selectYearByValue("2000");
        registerPage.enterEmailField("manish@gmail.com");
        registerPage.enterPasswordField("123456");
        registerPage.enterConfirmPasswordField("123456");
        registerPage.clickOnRegisterButton();
        Assert.assertEquals(registerPage.getRegisterText(),"Your registration completed");
}


}
