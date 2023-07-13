package com.testCases.RequestForUniqueID;

import com.base.BaseClass;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton extends BaseClass {
    @Test(priority = 1)
    public void TC_03_Validate_that_user_can_click_on_selectAttributeDropdown() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_selectAttributeDropdown");
        loginPages.validLoginPartner();
        dashBoard.isSelectAttributeDropdownClickable("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton");


    }
    @Test(priority = 2)
     public void TC_03_Validate_that_user_can_click_on_distributorProfileOption() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_distributorProfileOption");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.isDistributorProfileClickable("TC_03_Validate_that_user_can_click_on_distributorProfileOption");
    }
    @Test(priority = 3)
    public void TC_03_Validate_that_user_can_click_on_searchButton() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        ExtentTestManager.startTest("TC_03_Validate_that_user_can_click_on_selectAttributeDropdown_DistributorProfile_SearchButton","TC_03_Validate_that_user_can_click_on_distributorProfileOption");
        loginPages.validLoginPartner();
        dashBoard.clickSelectAttribute();
        dashBoard.clickDistributorProfile();
        dashBoard.isSearchButtonClickable("TC_03_Validate_that_user_can_click_on_searchButton");

    }

}
