package com.testCases.IMEI_UploadDetails_BulkUpload;

import com.base.BaseClass;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_21 extends BaseClass {


    @Test(priority=1)
    public void TC_21_Validate_that_the_MasterDataUploadButton_clickable() throws IOException {

        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ExtentTestManager.startTest("TC_21_Validate_that_the_MasterDataUploadButton_clickable","Validate that User shall be able to Navigate to the Menu and Select Master Data Upload ");
        loginPages.validLoginPartner();
        corpDashboard.isMasterDataUploadButtonClickable("TC_21_Validate_that_the_MasterDataUploadButton_clickable");
    }

    @Test(priority = 1)
    public void TC_21_Validate_that_the_IMeiDetailsUploadButton_clickable() throws IOException {
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ExtentTestManager.startTest("TC_21_Validate_that_the_IMeiDetailsUploadButton_clickable","Validate that User shall be able to Navigate to the Menu and Select Master Data Upload ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.isIMEIDetailsUploadButtonClickable("TC_21_Validate_that_the_IMeiDetailsUploadButton_clickable");
    }



}

