package com.testCases.ApprovalForRegisterationRequest;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_08_Validate_that_the_user_can_login_as_a_corp extends BaseClass {

    @Test
    public void TC_08_Validate_that_the_user_can_login_as_a_corp() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_08_Validate_that_the_user_can_login_as_a_corp","Validate that User shall be able to enter the correct Username and password  and click on Login button");
        loginPages.validLoginCorp();
        dashBoard.isDashboardPresent();
    }


}
