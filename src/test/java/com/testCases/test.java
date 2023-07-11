package com.testCases;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.DashBoard;
import com.pageObject.loginPage;
import org.testng.annotations.Test;

public class test extends BaseClass {
    @Test
    public void test() throws InterruptedException {
        DashBoard dashBoard =new DashBoard(driver);
        loginPage loginPages = new loginPage(driver);


        loginPages.enterEntityCodePartner();

        loginPages.enterUserNamePartner();
        loginPages.enterPasswordPartner();
        loginPages.clickLoginButton();
        dashBoard.clickSelectAttribute();
        logger.info("one");
        dashBoard.clickDistributorProfile();
        logger.info("one");
        dashBoard.clickSearchLogo();
        logger.info("one");
        dashBoard.clickDistributorName();
        logger.info("one");
        dashBoard.clickOpenOption();
        logger.info("one");

    }
}
