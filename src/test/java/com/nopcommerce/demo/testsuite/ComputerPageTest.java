package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
DesktopsPage desktopsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){

        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage =new DesktopsPage();
    }












    @Test(groups = {"sanity","smoke" ,"regression"})
  public void  verifyUserShouldNavigateToComputerPageSuccessfully(){
homePage.clickOnComputersMenu();
        Assert.assertEquals(computerPage.getComputersText(),"Computers");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnComputerMenu();
       homePage.clickOnDesktop();
        Assert.assertEquals(desktopsPage.getDesktopsText(),"Desktops");
    }
    @Test(groups = {"regression"},dataProvider = "computerConfigs",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor,String ram,String hdd,String os,String software){
        homePage.mouseHoverOnComputerMenu();
        homePage.clickOnDesktop();
        desktopsPage.clickOnBuildYourOwnComputer();
       desktopsPage.selectFeaturesOfComputer(processor,ram,hdd,os,software);
    }
}
