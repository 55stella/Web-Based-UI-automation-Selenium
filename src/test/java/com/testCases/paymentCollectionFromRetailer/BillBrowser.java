package com.testCases.paymentCollectionFromRetailer;

import com.base.BaseClass;
import com.pageObject.BillBrowserPage;
import com.pageObject.BillEntryPage;
import com.pageObject.DashBoard;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class BillBrowser extends BaseClass {

    BillBrowserPage billBrowserPage;
    BillEntryPage billEntryPage;
    LoginPage loginPage;
    DashBoard dashboard;
    SoftAssert softAssert;

    public void initialize() {
        billBrowserPage = new BillBrowserPage(driver);
        billEntryPage = new BillEntryPage(driver);
        loginPage = new LoginPage(driver);
        dashboard = new DashBoard(driver);
        softAssert = new SoftAssert();

    }

    @Test(priority = 1)
    public void TC_13_Validate_that_the_user_can_navigate_to_BillBrowser() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to Navigate to menu " +
                "list and select \"Sales\" click on \"Bill Browser\"", "BillBrowserPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billBrowserPage.clickBillBrowser();
        if(billBrowserPage.isBillBrowserDisplayed()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_13");
    }

    @Test(priority = 2)
    public void TC_14_Validate_that_the_user_can_click_viewButton() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to click \"View button\"", "BillBrowserPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billBrowserPage.clickBillBrowser();
        billBrowserPage.clickViewButton();
        if(billBrowserPage.isViewButtonClickable()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_14");
    }

//    @Test(priority = 3)
//    public void TC_15_Validate_that_the_user_can_click_request_payment_button() throws IOException {
//        ExtentTestManager.startTest("Validate that User shall be able to click on \"Request Payment\" " +
//                "button and click on the view button.", "BillBrowserPage");
//
//        if() {
//            softAssert.assertTrue(true);
//            logger.info("Test Passed!");}
//        else {softAssert.assertTrue(false);
//            logger.info("Test Failed!");
//            captureScreen(driver, "FAILURE!");}
//        softAssert.assertAll();
//        logger.info("Completed TC_15");
//    }
//
//    @Test(priority = 4)
//    public void TC_16_Validate_that_request_payment_status_is_changed_after_payment() throws IOException {
//        ExtentTestManager.startTest("Validate that after payment is made that status and the request" +
//                " payment option is changed when User clicks on view button.", "BillBrowserPage");
//
//        if() {
//            softAssert.assertTrue(true);
//            logger.info("Test Passed!");}
//        else {softAssert.assertTrue(false);
//            logger.info("Test Failed!");
//            captureScreen(driver, "FAILURE!");}
//        softAssert.assertAll();
//        logger.info("Completed TC_16");
//    }


}
