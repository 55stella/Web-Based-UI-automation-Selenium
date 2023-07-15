package com.testCases.RequestForUniqueID;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.ProfileDetails;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_05_Validate_that_the_user_can_click_requestForUniqueID extends BaseClass {
    @Test(priority = 1)
    public void TC_05_Validate_that_the_user_can_click_requestForUniqueID() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ProfileDetails profileDetails = new ProfileDetails(driver);
        ExtentTestManager.startTest("TC_05_Validate_that_the_user_can_click_requestForUniqueID","Validate that the user can click on request for unique ID");
        loginPages.validLoginNewPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.clickDistributorName();
        dashBoard.clickOpenOption();
        profileDetails.isRequestForUniqueIdClickable("TC_05_Validate_that_the_user_can_click_requestForUniqueID");


    }

}
