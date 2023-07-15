package com.testCases.IMEI_UploadDetails_SingleUpload;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.ImeiDetailsUpload;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_18_Validate_successful_singleIMEIUpload extends BaseClass {

    @Test(priority = 1)
    public void TC_18_Validate_successful_singleIMEIUpload() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("TC_17_Validate__Invalid_IMEI_does_not_work","Validate that msisdn must start with 234 ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.enterImei(15);
        imeiDetailsUpload.enterValidMSISDN();
        imeiDetailsUpload.clickSaveButton();
        basePage.waitForTwentySeconds();
        basePage.checkTextInAlert("Submission received successfully.","TC_17_Validate__Invalid_IMEI_does_not_work");
    }

    }



