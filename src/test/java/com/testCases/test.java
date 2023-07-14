package com.testCases;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.CorpDashboard;
import com.pageObject.DashBoard;
import com.pageObject.RegistrationRequestPage;
import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.testng.annotations.Test;

import java.io.IOException;

public class test extends BaseClass {
    @Test
    public void test() throws InterruptedException, IOException {
        loginPage loginPages= new loginPage(driver);
        loginPages.validLoginCorp();
        CorpDashboard corpDashboard =new CorpDashboard(driver);
        corpDashboard.masterDataUploadButton.click();

        Thread.sleep(10000);
        System.out.println(corpDashboard.masterDataUploadMenu.getText());
        String text= corpDashboard.masterDataUploadMenu.getText();
        Boolean check = text.contains("Commission Browser");
        System.out.println(check);















    }
}
