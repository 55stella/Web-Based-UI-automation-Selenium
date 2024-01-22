package com.testCases.IMEI_UploadDetails_SingleUpload;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC14_Validate_that_CORP_cannot_UploadIMEI extends BaseClass {
    @Test(priority = 1)
    public void TC14_Validate_that_CORP_cannot_UploadIMEI() throws IOException {
        //this assumes that going through the same flow for partner account
        BasePage basePage = new BasePage(driver);
        LoginPage loginPages = new LoginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ExtentTestManager.startTest("TC14_Validate_that_CORP_cannot_UploadIMEI","Validate that TAS Corp Users are not mapped to carry out IMEI Upload");
        loginPages.validLoginCorp();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.textIsNotPresent("IMEI Details Upload", "TC14_Validate_that_CORP_cannot_UploadIMEI");
    }
}