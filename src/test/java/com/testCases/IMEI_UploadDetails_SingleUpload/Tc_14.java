package com.testCases.IMEI_UploadDetails_SingleUpload;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class Tc_14 extends BaseClass {
    @Test(priority = 1)
    public void Tc14() throws IOException {
        BasePage basepg=new BasePage(driver);
        loginPage loginpg=new loginPage(driver);
        //starting extent reporting in this test case
        ExtentTestManager.startTest("Validate that Corp Users are not mapped to carry out IMEI Upload","CORP user should not be able to see an IMEI upload");
        //validating the test
        SoftAssert softassert=new SoftAssert();

//        if(validation1&&validation2){
//            softassert.assertTrue(true);
//            ExtentTestManager.getTest().pass("Test passed:Corp Users are not mapped to carry out IMEI Upload");
//            logger.info("Test Passed");
//        }
//        else{
//            softassert.assertFalse(true);
//            logger.info("Test Failed ");
//            captureScreen(driver,"Tc_13");
//            ExtentTestManager.getTest().fail("Test Failed:Corp Users are  mapped to carry out IMEI Upload");
//        }
        softassert.assertAll();
        logger.info("Test Completed ");

    }
}
