package com.testCases;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.RegistrationRequestPage;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class test extends BaseClass {
    @Test
    public void test() throws InterruptedException, IOException {
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
        basePage.shortWait();
        registrationRequestPage.isRejectedAlertDisplayed("TC_11_Validate_that_user_gets_successfulRejectedAlert");














        // test reject
//        BasePage basePage = new BasePage(driver);
//        DashBoard dashBoard = new DashBoard(driver);
//        loginPage loginPages = new loginPage(driver);
//        CorpDashboard corpDashboard= new CorpDashboard(driver);
//        loginPages.validRejectLoginPartner();

//        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
//        ExtentTestManager.startTest("TC_10_Validate_that_the_user_can_click_RefNo","Validate that the user can click on the refNo");
//        loginPages.validLoginCorp();
//        dashBoard.clickBellICon();
//        dashBoard.clickRegistrationRequestForApproval();
      // corpDashboard.clickRefNo();
//
//        registrationRequestPage.clickApproveButton();
//        basePage.shortWait();
//        basePage.checkTextInAlert("please enter remarks", "TC_10_Validate_that_the_user_can_click_RefNo");


    }
}
