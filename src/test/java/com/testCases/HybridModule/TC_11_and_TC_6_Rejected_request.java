package com.testCases.HybridModule;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.*;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_11_and_TC_6_Rejected_request extends BaseClass {
    //user should make  request for approval
    @Test(priority = 1)
    public void TC_11_Validate_that_user_clicks_RequestForUniqueId() throws IOException {
        //USER ACCOUNT to be rejected
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ProfileDetails profileDetails = new ProfileDetails(driver);
        ExtentTestManager.startTest("TC_11_Validate_that_user_clicks_RequestForUniqueId","Validate that the user can click on request for unique ID");
        loginPages.validRejectLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.clickDistributorName();
        dashBoard.clickOpenOption();
        profileDetails.clickRequestForUniqueId("TC_11_Validate_that_user_clicks_RequestForUniqueId");


    }//corp user should approve and get alert
    @Test(priority=1)
    public void TC_11_Validate_that_user_gets_successfulRejectedAlert() throws IOException, InterruptedException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard =new CorpDashboard(driver);
        BasePage basePage = new BasePage(driver);
        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
        ExtentTestManager.startTest("TC_11_Validate_that_user_gets_successfulRejectedAlert","Validate that the user gets successfully rejected alert");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.clickRejectRefNo();
        registrationRequestPage.enterRemark("rejected remark");
        registrationRequestPage.clickRejectButton();
        basePage.waitForTwentySeconds();
        registrationRequestPage.isRejectedAlertDisplayed("TC_11_Validate_that_user_gets_successfulRejectedAlert");

    }



}
