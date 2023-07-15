package com.testCases.IMEI_UploadDetails_SingleUpload;

import com.base.BaseClass;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.apache.log4j.Priority;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_15_and_TC_16 extends BaseClass {
    @Test(priority = 1)
    public void TC_15_Validate_that_the_user_can_login_as_a_partner() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_15_Validate_that_the_user_can_login_as_a_partner","Validate that User shall be able to enter the correct Username and password  and click on Login button");
        loginPages.validLoginPartner();
        dashBoard.isDashboardPresent();
    }
    @Test(priority=1)
    public void TC_16_Validate_that_the_MasterDataUploadButton_clickable() throws IOException {

        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ExtentTestManager.startTest("TC_16_Validate_that_the_MasterDataUploadButton_clickable","Validate that User shall be able to Navigate to the Menu and Select Master Data Upload ");
        loginPages.validLoginPartner();
        corpDashboard.isMasterDataUploadButtonClickable("TC_16_Validate_that_the_MasterDataUploadButton_clickable");
    }

    @Test(priority = 1)
    public void TC_16_Validate_that_the_IMeiDetailsUploadButton_clickable() throws IOException {
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ExtentTestManager.startTest("TC_16_Validate_that_the_MasterDataUploadButton_clickable","Validate that User shall be able to Navigate to the Menu and Select Master Data Upload ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.isIMEIDetailsUploadButtonClickable("TC_16_Validate_that_the_MasterDataUploadButton_clickable");
    }



}
