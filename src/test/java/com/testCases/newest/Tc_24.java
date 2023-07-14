package com.testCases.newest;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class Tc_24 extends BaseClass {
    @Test(priority = 1)
    public void Tc13() throws IOException {
        BasePage basepg=new BasePage(driver);
        loginPage loginpg=new loginPage(driver);
        //starting extent reporting in this test case
        ExtentTestManager.startTest("Validate that user shall be able to open the TAS application with the correct URL","user should be able to open application and be navigated to the appropropriate web page");
        //validating the test
        SoftAssert softassert=new SoftAssert();
        boolean validation1= driver.getTitle().equalsIgnoreCase("Login Page");
        String getLabelTitle=basepg.getText(loginpg.labelName);
        String exact_LabelTitle="Trade Automation Solution";
        boolean validation2 = getLabelTitle.equals(exact_LabelTitle);
        if(validation1&&validation2){
            softassert.assertTrue(true);
            ExtentTestManager.getTest().pass("Test passed:User can open TAS application with the correct URL");
            logger.info("Test Passed");
        }
        else{
            softassert.assertFalse(true);
            logger.info("Test Failed ");
            captureScreen(driver,"Tc_13");
            ExtentTestManager.getTest().fail("Test Failed:User can not open TAS application and does'nt see the appropriate webpoage with the correct URL");
        }
        softassert.assertAll();
        logger.info("Test Completed ");

    }
}
