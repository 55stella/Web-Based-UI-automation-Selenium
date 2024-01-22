package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import com.utilities.extentReports.ExtentTestManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;


import java.io.IOException;

public class LoginPage extends BaseClass {

    BasePage basePage= new BasePage(driver);
    public LoginPage(WebDriver driver) {
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
//    public void enterEntityCodeCorpManager(){
//        basePage.sendText(entityCodeField,en);
//    }
//    public void enterPasswordCorpManager(){
//
//    }
    public void enterUserNameCorpManager(){
        basePage.sendText(usernameField,userNameCorpManager);
    }
    public void enterUserNameCorpTestLead(){
        basePage.sendText(usernameField, userNameCorpTestLead);

    }
//    public void enterPasswordCorpTestLead(){
//
//    }
//    public void enterUserNameCorpTestLead(){
//
//    }

    public void enterEntityCodeCorpPjp(){
        basePage.sendText(entityCodeField,entityCodeCorpPjp);
    }

    public void enterPasswordCorpPjp(){
        basePage.sendText(passwordField,passwordCorpPjp);
    }
    public void enterUserNameCorpPjp(){
        basePage.sendText(usernameField,usernameCorpPjp);
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
    public void enterNewEntityCodePartner(){
        basePage.waitForElementClick(entityCodeField);
        basePage.sendText(entityCodeField, newEntityCodePartner);
    }
    public void enterNewPasswordPartner(){
        basePage.waitForElementClick(passwordField);
        basePage.sendText(passwordField,newPasswordPartner);
    }
    public void enterApproveUserNamePartner(){
        basePage.waitForElementClick(usernameField);
        basePage.sendText(usernameField,approveUsernamePartner);
    }
    public void enterApproveEntityCodePartner(){
        basePage.waitForElementClick(entityCodeField);
        basePage.sendText(entityCodeField, approveEntityCodePartner);
    }
    public void enterApprovePasswordPartner(){
        basePage.waitForElementClick(passwordField);
        basePage.sendText(passwordField,approvePasswordPartner);
    }

    public void enterRejectUserNamePartner(){
        basePage.waitForElementClick(usernameField);
        basePage.sendText(usernameField,rejectUsernamePartner);
    }
    public void enterRejectEntityCodePartner(){
        basePage.waitForElementClick(entityCodeField);
        basePage.sendText(entityCodeField, rejectEntityCodePartner);
    }
    public void enterRejectPasswordPartner(){
        basePage.waitForElementClick(passwordField);
        basePage.sendText(passwordField,rejectPasswordPartner);
    }

    public void enterNewUserNamePartner(){
        basePage.waitForElementClick(usernameField);
        basePage.sendText(usernameField,newUsernamePartner);
    }
    public void clickLoginButton(){
        basePage.waitForElementClick(logInButton);
        logInButton.click();
    }

    //partner account
    public void validLoginPartner(){

        enterEntityCodePartner();
        logger.info("Entity code- entered");
        enterUserNamePartner();
        logger.info("Username Partner-entered");
        enterPasswordPartner();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");

    }

    public void validLoginCorp(){

        enterEntityCodeCorp();
        logger.info("Entity code- entered");
        enterUserNameCorp();
        logger.info("Username Partner-entered");
        enterPasswordCorp();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validLoginCorpManager(){
        enterEntityCodeCorp();
        logger.info("Entity code- entered");
        enterUserNameCorpManager();
        logger.info("Username Partner-entered");
        enterPasswordCorp();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validLoginCorpTestLead(){
        enterEntityCodeCorp();
        logger.info("Entity code- entered");
        enterUserNameCorpTestLead();
        logger.info("Username Partner-entered");
        enterPasswordCorp();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validLoginCorpPjp(){

        enterEntityCodeCorpPjp();
        logger.info("Entity code- entered");
        enterUserNameCorpPjp();
        logger.info("Username Partner-entered");
        enterPasswordCorpPjp();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validLoginNewPartner(){
        enterNewEntityCodePartner();
        logger.info("Entity code- entered");
        enterNewUserNamePartner();
        logger.info("Username Partner-entered");
        enterNewPasswordPartner();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validApproveLoginPartner(){
        enterApproveEntityCodePartner();
        logger.info("Entity code- entered");
        enterApproveUserNamePartner();
        logger.info("Username Partner-entered");
        enterApprovePasswordPartner();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
    }
    public void validRejectLoginPartner(){
        enterRejectEntityCodePartner();
        logger.info("Entity code- entered");
        enterRejectUserNamePartner();
        logger.info("Username Partner-entered");
        enterRejectPasswordPartner();
        logger.info("Password partner- entered");
        clickLoginButton();
        logger.info("Clicked on logIn button");
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
            try {basePage.waitForElement(form);}catch (TimeoutException t){
                ExtentTestManager.getTest().fail("Test Failed");
            }
            softAssert.assertTrue(true);
            logger.info("Test Passed!");
            ExtentTestManager.getTest().pass("Test passed");


        }
        else{
            softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver,"TCL_MTN01 FAILURE");
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Completed LoginTest");

    }








}
