package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;

import com.utilities.extentReports.ExtentTestManager;
import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class CorpDashboard extends BaseClass {
    public CorpDashboard(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    BasePage basePage = new BasePage(driver);
    @FindBy(xpath ="//td[contains(text(),'19456')]")//this needs to be updated repeatedly
    @CacheLookup
    public WebElement refNo;

    @FindBy(xpath="//td[contains(text(),'19459')]")//this needs to be updated repeatedly
    @CacheLookup
    public WebElement rejectRefNo;

    @FindBy(xpath = "//td[contains(text(),'19458')]")//this needs to be updated repeatedly
    @CacheLookup
    public WebElement approveRefNo;


    @FindBy(id="dropdownMenu2")
    @CacheLookup
    public WebElement welcomeMenu;

    @FindBy(id="signOutTag")
    @CacheLookup
    public WebElement signOutButton;

    @FindBy(id="navAccordionSubMenu")
    @CacheLookup
    public WebElement masterDataUploadMenu;

    @FindBy(xpath = "//span[text()='Master Data Upload']")
    @CacheLookup
    public WebElement masterDataUploadButton;

    @FindBy(xpath = "//span[@class='menuLink' and text()='IMEI Details Upload']")
    @CacheLookup
    public WebElement imeiDetailsUploadButton;


    SoftAssert softAssert = new SoftAssert();

    public void clickImeiDetailsUploadButton(){
        basePage.waitForElement(imeiDetailsUploadButton);
        imeiDetailsUploadButton.click();
    }

    public void isIMEIDetailsUploadButtonClickable(String testCaseName) throws IOException {
        basePage.isClickable(imeiDetailsUploadButton,testCaseName);
    }

    public void clickRefNo(){
        basePage.waitForElementClick(refNo);
        refNo.click();
    }
    public void clickRejectRefNo(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", rejectRefNo);
        basePage.waitForElementClick(rejectRefNo);
        rejectRefNo.click();
    }
    public void clickApproveRefNo(){
        basePage.waitForElementClick(approveRefNo);
        approveRefNo.click();
    }
    public void isRefNoClickable (String testCaseName) throws IOException {
        basePage.isClickable(refNo,testCaseName);
    }

    public void clickWelcomeMenu(){
        basePage.waitForElementClick(welcomeMenu);
        welcomeMenu.click();
    }
    public void clickSignOut(){
        basePage.waitForElementClick(signOutButton);
        signOutButton.click();
    }
    public void logOut(){
        clickWelcomeMenu();
        clickSignOut();
    }
    public void clickMasterDataUploadButton(){
        basePage.waitForElement(masterDataUploadButton);
        masterDataUploadButton.click();
    }
    public void isMasterDataUploadButtonClickable(String testCaseName) throws IOException {
        basePage.isClickable(masterDataUploadButton,testCaseName);

    }
    public void isIMEIDataUploadButtonClickable(){



    }


    //IMEI Details Upload
    public void textIsNotPresent(String text, String testCaseName) throws IOException {
        String modText= text.replaceAll("%s","").toLowerCase();
        String textFromMenu=masterDataUploadMenu.getText().replaceAll("%s","").toLowerCase();
        Boolean check=  textFromMenu.contains(modText);
        if(check){
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            ExtentTestManager.getTest().pass("Test Failed");
            captureScreen(driver,testCaseName);

        }else{
            softAssert.assertTrue(true);
            logger.info("Test passed");
            ExtentTestManager.getTest().fail("Test Passed");
        }
        softAssert.assertAll();
        logger.info("Test Completed");


    }




}
