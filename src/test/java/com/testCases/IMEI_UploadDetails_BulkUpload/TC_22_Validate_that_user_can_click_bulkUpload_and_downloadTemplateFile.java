package com.testCases.IMEI_UploadDetails_BulkUpload;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.ImeiDetailsUpload;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_22_Validate_that_user_can_click_bulkUpload_and_downloadTemplateFile extends BaseClass {
    @Test(priority = 1)
    public void TC_22_Validate_that_user_can_click_bulkUpload() throws InterruptedException, IOException {
        LoginPage loginPages = new LoginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("TC_22_Validate_that_user_can_click_bulkUpload","Validate that user can click bulk upload");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.isBulkUploadClickable("TC_22_Validate_that_user_can_click_bulkUpload");
    }
    @Test(priority = 1)
    public void TC_22_Validate_that_user_can_click_downloadTemplateFile() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(driver);
        LoginPage loginPages = new LoginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("TC_22_Validate_that_user_can_click_downloadTemplateFile","Validate that user can click download template file");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.clickBulkUploadButton();

        imeiDetailsUpload.isDownloadButtonClickable("TC_22_Validate_that_user_can_click_bulkUpload");


    }
}
