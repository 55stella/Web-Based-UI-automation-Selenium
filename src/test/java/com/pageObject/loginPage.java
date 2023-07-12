package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import com.utilities.extentReports.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


import javax.xml.xpath.XPath;
import java.io.IOException;

public class loginPage extends BaseClass {

    BasePage basePage= new BasePage(driver);
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="userName")
    @CacheLookup
    public WebElement usernameField;

    @FindBy(id = "entityCode")
    @CacheLookup
    WebElement entityCodeField;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    public WebElement passwordField;

    @FindBy(xpath = "//button[@id='logInBtn']")
    @CacheLookup
    public WebElement logInButton;

    @FindBy(id="login_form")
    @CacheLookup
    public WebElement form;

    @FindBy(xpath="//label[@id='loginHeader']")
    @CacheLookup
    public  WebElement labelName;





    //actions

    //login for corp account
    public void enterEntityCodeCorp(){
        basePage.sendText(entityCodeField,entityCodeCorp);
    }
    public void enterPasswordCorp(){
        basePage.sendText(passwordField,passwordCorp);
    }
    public void enterUserNameCorp(){
        basePage.sendText(usernameField,usernameCorp);
    }
    public void enterEntityCodePartner(){
        basePage.waitForElementClick(entityCodeField);
        basePage.sendText(entityCodeField, entityCodePartner);
    }
    public void enterPasswordPartner(){
        basePage.waitForElementClick(passwordField);
        basePage.sendText(passwordField,passwordPartner);
    }
    public void enterUserNamePartner(){
        basePage.waitForElementClick(usernameField);
        basePage.sendText(usernameField,usernamePartner);
    }
    public void clickLoginButton(){
        basePage.waitForElementClick(logInButton);
        logInButton.click();
    }
    //partner account
    public void partnerAccountLogin(){
        enterEntityCodePartner();
        enterUserNamePartner();
        enterPasswordPartner();
    }
    //corp account
    public void corpAccountLogin(){
        enterEntityCodeCorp();
        enterUserNameCorp();
        enterPasswordCorp();
    }
    public void tasIsPresent() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        BasePage basePage = new BasePage(driver);

        if(basePage.isElementPresent(driver, form)){
            softAssert.assertTrue(true);
            logger.info("Test Passed! TCL_MTN-1 SUCCESSFUL!");
            ExtentTestManager.getTest().pass("Test passed");


        }
        else{
            softAssert.assertTrue(false);
            logger.info("Test Failed! Login failed!");
            captureScreen(driver,"TCL_MTN01 FAILURE");
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Completed LoginTest");

    }








}
