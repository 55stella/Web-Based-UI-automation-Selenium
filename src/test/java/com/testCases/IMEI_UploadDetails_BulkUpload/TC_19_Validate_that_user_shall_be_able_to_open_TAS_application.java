package com.testCases.IMEI_UploadDetails_BulkUpload;

import com.base.BaseClass;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_19_Validate_that_user_shall_be_able_to_open_TAS_application extends BaseClass {
    @Test(priority = 1)
    public void TC_19_Validate_that_user_shall_be_able_to_open_TAS_application() throws IOException {
        LoginPage loginPages = new LoginPage(driver);
        ExtentTestManager.startTest("TC_19_Validate_that_user_shall_be_able_to_open_TAS_application","Validate that user shall be able to open the TAS application with the correct URL");
        loginPages.tasIsPresent();
    }
}
