package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import com.utilities.extentReports.ExtentTestManager;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class PJPDashboard extends BaseClass {
    public PJPDashboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    BasePage basePage = new BasePage(driver);
    SoftAssert softAssert = new SoftAssert();

    @FindBy(id="toggleIcon15626")
    @CacheLookup
    public WebElement majorRegionEastButton;




    public void clickMajorRegionEastButton(){
        basePage.waitForElement(majorRegionEastButton);
        majorRegionEastButton.click();
    }

    @FindBy(id="MAJORREGN15626")
    @CacheLookup
    public WebElement RegionContainer;



    public void isRegionContainerPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver,RegionContainer)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");

    }

    @FindBy (id="toggleIcon15647")
    @CacheLookup
    public WebElement southRegionButton;

    public void clickSouthRegionButton(){
        basePage.waitForElement(southRegionButton);
        southRegionButton.click();
    }

    @FindBy(id="REGN15647")
    @CacheLookup
    public WebElement southSubRegionContainer;




    public void isSouthSubRegionContainerPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver,southSubRegionContainer)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");

    }

    @FindBy(id="toggleIcon15674")
    @CacheLookup
    public WebElement imoSubRegionButton;

    public void clickImoSubRegionButton(){

        basePage.waitForElement(imoSubRegionButton);
        basePage.scrollToElement(imoSubRegionButton);

        imoSubRegionButton.click();
    }

    @FindBy(id="SUBREGN15674")
    @CacheLookup
    public WebElement imoTerritoryContainer;

    public void isImoTerritoryContainerPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver,imoTerritoryContainer)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");

    }


    @FindBy (id ="toggleIcon15678")
    @CacheLookup
    public WebElement mbaitoliTerritoryButton;

    public void clickMbaitoliTerritoryButton() {

        basePage.waitForElement(mbaitoliTerritoryButton);
        basePage.scrollToElement(imoSubRegionButton);

        mbaitoliTerritoryButton.click();
    }

    @FindBy(id="TERR15678")
    @CacheLookup
    public WebElement mbaitoliClusterContainer;

    public void isMbaitoliClusterContainerPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver,mbaitoliClusterContainer)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");
    }

    @FindBy(xpath = "//label[text()='Pjp Dashboard']")
    @CacheLookup
    public WebElement pjpDashBoardHeader;

    //actions and assertion

    public void isPjpDashboardPresent(String testCaseName) throws IOException {
       if(basePage.isElementPresent(driver, pjpDashBoardHeader)){
           softAssert.assertTrue(true);
           logger.info("Test Passed");
           ExtentTestManager.getTest().pass("Test passed");
       }
       else {
           softAssert.assertTrue(false);
           logger.info("Test Failed");
           captureScreen(driver, testCaseName);
           ExtentTestManager.getTest().fail("Test Failed");
       }
        softAssert.assertAll();
        logger.info("Test completed");
    }

    @FindBy(id="toggleIcon15876")
    @CacheLookup
    public WebElement alagbadoTerritoryButton;

    public void clickAlagbadoTerritoryButton(){
        basePage.waitForElement(alagbadoTerritoryButton);
        alagbadoTerritoryButton.click();
    }
    @FindBy(id="TERR15876")
    @CacheLookup
    public WebElement alagbadoTerritoryContainer;

    public void isAlagbadoTerriotoryContainerPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver, alagbadoTerritoryContainer)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");
    }

    @FindBy(id="showGeography")
    @CacheLookup
    public WebElement clusterContainerTestLead;

    public void isClusterContainerTestLeadPresent(String testCaseName) throws IOException {
        if(basePage.isElementPresent(driver, clusterContainerTestLead)){
            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, testCaseName);
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");
    }


}















