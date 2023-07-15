package com.testCases.HybridModule;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.*;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_11_and_TC_6_Approved_request extends BaseClass {

    //user should make  request for approval
    @Test(priority = 1)
    public void TC_11_Validate_that_user_clicks_RequestForUniqueId() throws IOException {
    //USER ACCOUNT FOR APPROVAL
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ProfileDetails profileDetails = new ProfileDetails(driver);
        ExtentTestManager.startTest("TC_11_Validate_that_user_clicks_RequestForUniqueId","Validate that the user can click on request for unique ID");
        loginPages.validApproveLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.clickDistributorName();
        dashBoard.clickOpenOption();
        profileDetails.clickRequestForUniqueId("TC_11_Validate_that_user_clicks_RequestForUniqueId");


    }//corp user should approve and get alert
    @Test(priority=1)
        public void TC_11_Validate_that_user_gets_successfulAlert() throws InterruptedException, IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard =new CorpDashboard(driver);
        BasePage basePage = new BasePage(driver);
        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
        ExtentTestManager.startTest("TC_11_Validate_that_user_gets_successfulRejectedAlert","Validate that the user gets successfully rejected alert");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.clickApproveRefNo();
        registrationRequestPage.enterRemark("rejected remark");
        registrationRequestPage.clickApproveButton();
        basePage.waitForTwentySeconds();
        registrationRequestPage.isSuccessfulAlertDisplayed("TC_11_Validate_that_user_gets_successfulRejectedAlert");



    }


    @Test(priority=1 )
    //same account is opened to validate the element is not present
    public void TC_06_Validate_that_user_can_request_onlyOnce() throws IOException, InterruptedException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ProfileDetails profileDetails = new ProfileDetails(driver);
        BasePage basePage = new BasePage(driver);
        ExtentTestManager.startTest("TC_06_Validate_that_user_can_request_onlyOnce","Validate that the user can click on request for unique ID once");
        loginPages.validApproveLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.clickDistributorName();
        dashBoard.clickOpenOption();

        profileDetails.checkForRequestUniqueId("TC_11_Validate_that_user_clicks_RequestForUniqueId");//this validate that request for unique id is not present




    }


}
