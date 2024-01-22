package com.testCases.IMEI_UploadDetails_SingleUpload;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.ImeiDetailsUpload;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_17_Validate_valid_IMEI_AND_MSISDN extends BaseClass {

    @Test(priority = 1)
    public void TC_17_Validate__Invalid_IMEI_does_not_work() throws IOException {
        BasePage basePage = new BasePage(driver);
        LoginPage loginPages = new LoginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("TC_17_Validate__Invalid_IMEI_does_not_work","Validate that User imei must be 15 digits ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.enterImei(14);
        imeiDetailsUpload.enterValidMSISDN();
        imeiDetailsUpload.clickSaveButton();
        basePage.checkTextInAlert("imei number must have 15 digits","TC_17_Validate__Invalid_IMEI_does_not_work");
    }

    @Test(priority=1)
    public void TC_17_Validate__Invalid_msisdn_does_not_work() throws IOException {
        BasePage basePage = new BasePage(driver);
        LoginPage loginPages = new LoginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("TC_17_Validate__Invalid_IMEI_does_not_work","Validate that msisdn must start with 234 ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.enterImei(15);
        imeiDetailsUpload.enterInvalidMSISDN();
        imeiDetailsUpload.clickSaveButton();
        basePage.checkTextInAlert("msisdn must start with 234","TC_16_Validate_that_the_MasterDataUploadButton_clickable");
    }


}
