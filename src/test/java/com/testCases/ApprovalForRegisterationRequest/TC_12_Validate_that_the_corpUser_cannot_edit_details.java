package com.testCases.ApprovalForRegisterationRequest;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.RegistrationRequestPage;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_12_Validate_that_the_corpUser_cannot_edit_details extends BaseClass {
    @Test(priority = 1)
    public void TC_12_Validate_that_the_corpUser_cannot_edit_agentName () throws IOException {
        BasePage basePage = new BasePage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard= new CorpDashboard(driver);
        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
        ExtentTestManager.startTest("TC_12_Validate_that_the_corpUser_cannot_edit_agentName","Validate that the corp user account can not edit the agent name already provided");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.clickRefNo();
        basePage.shortWait();
        registrationRequestPage.isAgentNameEditable("TC_10_Validate_that_the_user_can_click_RefNo");
    }
    @Test(priority = 1)
    public void TC_12_Validate_that_the_corpUser_cannot_edit_agentMSISDN () throws IOException {
        BasePage basePage = new BasePage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard= new CorpDashboard(driver);
        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
        ExtentTestManager.startTest("TC_12_Validate_that_the_corpUser_cannot_edit_agentMSISDN","Validate that the corp user account can not edit the agent msisdn already provided");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.clickRefNo();
        basePage.shortWait();
        registrationRequestPage.isAgentMSISDNEditable("TC_12_Validate_that_the_corpUser_cannot_edit_agentMSISDN");
    }
    @Test(priority = 1)
    public void TC_12_Validate_that_the_corpUser_cannot_edit_agentLocation () throws IOException {
        BasePage basePage = new BasePage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard= new CorpDashboard(driver);
        RegistrationRequestPage registrationRequestPage = new RegistrationRequestPage(driver);
        ExtentTestManager.startTest("TC_12_Validate_that_the_corpUser_cannot_edit_agentLocation","Validate that the corp user account can not edit the agent location already provided");
        loginPages.validLoginCorp();
        dashBoard.clickBellICon();
        dashBoard.clickRegistrationRequestForApproval();
        corpDashboard.clickRefNo();
        basePage.shortWait();
        registrationRequestPage.isAgentMSISDNEditable("TC_12_Validate_that_the_corpUser_cannot_edit_agentLocation");
    }


}
