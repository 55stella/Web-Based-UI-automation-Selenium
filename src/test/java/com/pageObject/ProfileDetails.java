package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import com.utilities.extentReports.ExtentTestManager;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class ProfileDetails extends BaseClass {
    public ProfileDetails(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    SoftAssert softAssert = new SoftAssert();
    @FindBy(xpath="//*[contains(text(),'Request for unique Id')]")
    @CacheLookup
    public WebElement requestForUniqueId;

    @FindBy(xpath = "//label[text()='Profile Information']")
    @CacheLookup
    public WebElement profileInformation;    //this is the header of the form section.

    BasePage basePage = new BasePage(driver);



        public void clickRequestForUniqueId(String testCaseName) throws IOException {
            try {
                basePage.waitForElement(requestForUniqueId);
                requestForUniqueId.click();
                softAssert.assertTrue(true);
                logger.info("Test Passed");
                ExtentTestManager.getTest().pass("Test passed");
            } catch (NoSuchElementException e) {
                softAssert.assertTrue(false);
                logger.info("Test Failed! Element not found.");
                captureScreen(driver, testCaseName);
                ExtentTestManager.getTest().fail("Test Failed. Element not found.");
            }
            softAssert.assertAll();
            logger.info("Test Completed");
        }


    public void isRequestForUniqueIdClickable(String testcaseName) throws IOException {
        basePage.waitForElement(profileInformation);
        basePage.isClickable(requestForUniqueId,testcaseName);
    }
    public void checkForRequestUniqueId(String testCaseName) throws IOException {
            Boolean check=basePage.isElementPresent(driver,requestForUniqueId);
            System.out.println(check);

            if (check){
                softAssert.assertTrue(false);
                logger.info("Test Failed");
                captureScreen(driver, testCaseName);
                ExtentTestManager.getTest().fail("Test Failed");
            }
            else {
                softAssert.assertTrue(true);
                logger.info("Test Passed");
                ExtentTestManager.getTest().pass("Test passed");
            }
            softAssert.assertAll();
            logger.info("Test completed");
    }


}
