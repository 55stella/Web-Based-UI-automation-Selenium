package com.testCases.paymentCollectionFromRetailer;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.BillEntryPage;
import com.pageObject.DashBoard;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.lang.reflect.Method;

public class BillEntry extends BaseClass {
    LoginPage loginPage;
    DashBoard dashboard;
    SoftAssert softAssert;
    BillEntryPage billEntryPage;

    public void initialize() {
        billEntryPage = new BillEntryPage(driver);
        loginPage = new LoginPage(driver);
        dashboard = new DashBoard(driver);
        softAssert = new SoftAssert();
    }

    @Test(priority = 1)
    public void TC_1_Validate_that_the_user_can_navigate_to_URL() throws IOException, InterruptedException {
        ExtentTestManager.startTest("Validate that User shall be abel to access Application with the correct URL", "BillEntryPage");
        Thread.sleep(10);
        initialize();
        if(loginPage.labelName.getText().equals("Trade Automation Solution")) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_1");
    }

    @Test(priority = 2)
    public void TC_2_Validate_that_the_user_can_login_as_a_partner() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to access Application home page with the " +
                "correct Entity code, Username, Password and click on login button ", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        if(dashboard.bellIcon.isDisplayed()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_2");
    }

    @Test(priority = 3)
    public void TC_3_Validate_that_the_user_can_Click_sales_and_billEntry() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to navigate to menu list and select " +
                "\"Sales\" click on \"Bill Entry\"", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billEntryPage.clickBillEntry();
        if(billEntryPage.isBillEntryPageDisplayed()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_3");
    }


    @Test(priority = 5)
    public void TC_5_Validate_that_the_user_can_select_Delivery_and_billDate() throws IOException {
        ExtentTestManager.startTest("validate that User shall be able to select the \"Delivery Date\" " +
                "and \"Bill Date\"", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billEntryPage.clickBillEntry();
        billEntryPage.selectCustomerType();
        billEntryPage.enterBillDate();
        billEntryPage.enterDeliveryDate();
        if(billEntryPage.isBillDateClickable()&& billEntryPage.isDeliveryDateClickable()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_5");
    }

    @Test(priority = 6)
    public void TC_6_Validate_that_the_user_can_select_pay_mode() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to click on \"Pay mode\" and select " +
                "MoMo as payment mode", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billEntryPage.clickBillEntry();
        billEntryPage.selectCustomerType();

        billEntryPage.enterBillDate();
        billEntryPage.enterDeliveryDate();
        billEntryPage.selectPayMode();
        if(billEntryPage.isPayModeClickable()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_6");
    }


    @Test(priority = 8)
    public void TC_8_Validate_that_the_user_can_click_calculate_button() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to click on the " +
                "\"Calculate button\" ", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billEntryPage.clickBillEntry();
        billEntryPage.clickCalculateBtn();
        if(billEntryPage.isCalculateBtnClickable()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_8");
    }

    @Test(priority = 9)
    public void TC_9_Validate_that_the_user_can_click_arrow_and_clear_button() throws IOException {
        ExtentTestManager.startTest("Validate that User shall be able to click on the triangle sign " +
                "beside the total amount (^) and clear the amount duplicated on \"Collection Amount\" " +
                "(this is because of the payment option)", "BillEntryPage");
        initialize();
        loginPage.validApproveLoginPartner();
        billEntryPage.clickSales();
        billEntryPage.clickBillEntry();
        billEntryPage.clickArrowButton();
        if(billEntryPage.isArrowButtonClickable() && billEntryPage.isClearBtnClickable()) {
            softAssert.assertTrue(true);
            logger.info("Test Passed!");}
        else {softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver, "FAILURE!");}
        softAssert.assertAll();
        logger.info("Completed TC_9");
    }




}
