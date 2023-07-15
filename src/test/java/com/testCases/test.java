package com.testCases;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.*;
import com.utilities.extentReports.ExtentTestManager;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import java.io.IOException;

public class test extends BaseClass {

    @Test
    public void testTwo() throws IOException, InterruptedException {
        BasePage basePage = new BasePage(driver);
        loginPage loginPages = new loginPage(driver);
        CorpDashboard corpDashboard = new CorpDashboard(driver);
        ImeiDetailsUpload imeiDetailsUpload= new ImeiDetailsUpload(driver);
        ExtentTestManager.startTest("test","Validate that msisdn must start with 234 ");
        loginPages.validLoginPartner();
        corpDashboard.clickMasterDataUploadButton();
        corpDashboard.clickImeiDetailsUploadButton();
        imeiDetailsUpload.clickBulkUploadButton();
        imeiDetailsUpload.fileUpload(imeiDetailsUpload.invalidExcelFilePath);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        imeiDetailsUpload.uploadButton.click();
        Thread.sleep(5000);


    }
}
