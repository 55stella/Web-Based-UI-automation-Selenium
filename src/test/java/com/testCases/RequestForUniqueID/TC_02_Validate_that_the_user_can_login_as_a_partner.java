package com.testCases.RequestForUniqueID;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_02_Validate_that_the_user_can_login_as_a_partner extends BaseClass {
    @Test
    public void TC_02_Validate_that_the_user_can_login_as_a_partner() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_02_Validate_that_the_user_can_login_as_a_partner","Validate that User shall be able to enter the correct Username and password  and click on Login button");
        loginPages.validLoginPartner();
        dashBoard.isDashboardPresent();


    }
}
