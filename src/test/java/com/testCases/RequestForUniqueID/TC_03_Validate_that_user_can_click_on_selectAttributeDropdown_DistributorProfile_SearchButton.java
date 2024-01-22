package com.testCases.RequestForUniqueID;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton extends BaseClass {
    @Test(priority = 1)
    public void TC_03_Validate_that_user_can_click_on_selectAttributeDropdown() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        LoginPage loginPages = new LoginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_selectAttributeDropdown");
        loginPages.validLoginPartner();
        dashBoard.isSelectAttributeDropdownClickable("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton");


    }
    @Test(priority = 1)
     public void TC_03_Validate_that_user_can_click_on_distributorProfileOption() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        LoginPage loginPages = new LoginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_distributorProfileOption");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.isDistributorProfileClickable("TC_03_Validate_that_user_can_click_on_distributorProfileOption");
    }
    @Test(priority = 1)
    public void TC_03_Validate_that_user_can_click_on_searchButton() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        LoginPage loginPages = new LoginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_distributorProfileOption");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.isSearchButtonClickable("TC_03_Validate_that_user_can_click_on_searchButton");

    }

}
