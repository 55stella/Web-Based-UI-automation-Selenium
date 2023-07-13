package com.testCases.RequestForUniqueID;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_04_Validate_that_user_can_click_codeDetails_and_open extends BaseClass {
    @Test(priority = 1)
    public void TC_04_Validate_that_user_can_click_codeDetails() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_customer_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_customer_can_click_on_distributorProfileOption");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.isCodeDetailClickable("TC_04_Validate_that_user_can_click_codeDetails_and_open");

    }
    @Test(priority=2 )
    public void TC_04_Validate_that_user_can_click_openOption() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_04_Validate_that_user_can_click_openOption","TC_03_Validate_that_customer_can_click_on_the_optionButton");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.clickSearchLogo();
        dashBoard.clickDistributorName();
        dashBoard.isOpenOptionClickable("TC_04_Validate_that_user_can_click_openOption");
    }

}
