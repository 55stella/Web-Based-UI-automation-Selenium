package com.testCases.ApprovalForRegisterationRequest;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.apache.poi.ss.usermodel.PrintOrientation;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_09_Validate_that_user_can_click_BellIcon_and_RegistrationRequestApproval extends BaseClass {

    @Test(priority = 1)
    public void TC_09_Validate_that_user_can_click_BellIcon() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_09_Validate_that_user_can_click_BellIcon","Validate that the user can click on the BellIcon");
        loginPages.validLoginCorp();
        dashBoard.isBellIconClickable("TC_09_Validate_that_user_can_click_BellIcon");
    }
    @Test (priority = 1)
    public void TC_09_Validate_that_user_can_click_RegistrationRequestApproval() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_09_Validate_that_user_can_click_RegistrationRequestApproval","Validate that the user can click RegistrationRequestApproval");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.isRequestForRegistrationClickable("TC_09_Validate_that_user_can_click_RegistrationRequestApproval");



    }

}
