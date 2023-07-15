package com.testCases.ApprovalForRegisterationRequest;

import com.base.BaseClass;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_10_Validate_that_the_user_can_click_RefNo extends BaseClass {
    @Test(priority = 1)
    public void TC_10_Validate_that_the_user_can_click_RefNo() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard= new CorpDashboard(driver);
        ExtentTestManager.startTest("TC_10_Validate_that_the_user_can_click_RefNo","Validate that the user can click on the refNo");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.isRefNoClickable("TC_10_Validate_that_the_user_can_click_RefNo");

    }
}

