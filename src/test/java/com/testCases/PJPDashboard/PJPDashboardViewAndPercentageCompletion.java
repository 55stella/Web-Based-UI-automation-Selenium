package com.testCases.PJPDashboard;

import com.base.BaseClass;
import com.base.BasePage;
import com.pageObject.DashBoard;
import com.pageObject.PJPDashboard;
import com.pageObject.LoginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import java.util.List;

public class PJPDashboardViewAndPercentageCompletion extends BaseClass {
    @Test(priority=1)
    public void TC_01_ValidateThatUserWillAccessApplicationWithValidUrl() throws IOException {
        LoginPage loginPages = new LoginPage(driver);

        ExtentTestManager.startTest("TC_01_ValidateThatUserWillAccessApplicationWithValidUrl","Validate that user shall be able to open the TAS application with the correct URL");
        loginPages.tasIsPresent();
    }
    @Test(priority = 2)
    public void TC_02_ValidateThatUserWillBeAbleToLoginAsCorpMember() throws IOException {
        DashBoard dashBoard = new DashBoard(driver);
        LoginPage loginPages = new LoginPage(driver);
        ExtentTestManager.startTest("TC_02_ValidateThatUserWillBeAbleToLoginAsCorpMember","Validate that User shall be able to enter the correct Username and password  and click on Login button");
        loginPages.validLoginCorpPjp();
        dashBoard.isDashboardPresent();
    }
    @Test(priority = 3)
    public void TC_03_ValidateThatUserCanClickPJPDashboard() throws IOException {
        ExtentTestManager.startTest("TC_03_ValidateThatUserCanClickPJPDashboard","Validate that the user navigate to PJP Dashboard");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);

        loginPages.validLoginCorpPjp();
        handleAlert();

        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
        pjpDashboard.isPjpDashboardPresent("TC_03_ValidateThatUserCanClickPJPDashboard");
    }
    @Test(priority = 4)
    public void Tc_04_ValidateThatUserCanViewRegionAfterClickMajorRegion() throws IOException {
        ExtentTestManager.startTest("Tc_04_ValidateThatUserCanViewRegionAfterClickMajorRegion", "Validate that the user can view Region after clicking on the major region");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);
        BasePage basePage = new BasePage(driver);

        loginPages.validLoginCorpPjp();
        handleAlert();

        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();

        handleAlert();
            pjpDashboard.clickMajorRegionEastButton();
        handleAlert();
            pjpDashboard.isRegionContainerPresent("Tc_04_ValidateThatUserCanViewRegionAfterClickMajorRegion");



    }
    @Test(priority = 5)
    public void Tc_05_ValidateThatUserCanViewSubRegionAfterClickRegion() throws IOException {
        ExtentTestManager.startTest("Tc_05_ValidateThatUserCanViewSubRegionAfterClickRegion", "Validate that the user can view subRegion after clicking on the region");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        BasePage basePage = new BasePage(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);

        loginPages.validLoginCorpPjp();
        handleAlert();

        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
            pjpDashboard.clickMajorRegionEastButton();
        handleAlert();
            pjpDashboard.clickSouthRegionButton();
        handleAlert();
            pjpDashboard.isSouthSubRegionContainerPresent("Tc_05_ValidateThatUserCanViewSubRegionAfterClickRegion");





    }
    @Test(priority = 6)
    public void Tc_06_ValidateThatUserCanViewTerritoriesAfterClickSubregion() throws IOException {
        ExtentTestManager.startTest("Tc_06_ValidateThatUserCanViewTerritoriesAfterClickSubregion", "Validate that the user can view territory after clicking on sub region");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        BasePage basePage = new BasePage(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);

        loginPages.validLoginCorpPjp();
        handleAlert();

        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
            pjpDashboard.clickMajorRegionEastButton();
            handleAlert();
            pjpDashboard.clickSouthRegionButton();
            handleAlert();
            pjpDashboard.clickImoSubRegionButton();
            handleAlert();
            pjpDashboard.isImoTerritoryContainerPresent("Tc_06_ValidateThatUserCanViewTerritoriesAfterClickSubregion");
        }
    @Test(priority = 7)
    public void Tc_07_ValidateThatUserCanViewClustersAfterClickTerritories() throws IOException {
        ExtentTestManager.startTest("Tc_07_ValidateThatUserCanViewClustersAfterClickTerritories", "Validate that the user can view clusters after clicking on territory");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        BasePage basePage = new BasePage(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);
        handleAlert();
        loginPages.validLoginCorpPjp();
        handleAlert();
        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
        pjpDashboard.clickMajorRegionEastButton();
        handleAlert();
        pjpDashboard.clickSouthRegionButton();
        handleAlert();
        pjpDashboard.clickImoSubRegionButton();
        handleAlert();
        pjpDashboard.clickMbaitoliTerritoryButton();
        handleAlert();
        pjpDashboard.isMbaitoliClusterContainerPresent("Tc_07_ValidateThatUserCanViewClustersAfterClickTerritories");
    }
    @Test(priority = 8)
    public void Tc_09_ValidateThatUserIsAbleToObserveThePercentageCoverage() throws IOException {
        ExtentTestManager.startTest("Tc_09_ValidateThatUserIsAbleToObserveThePercentageCoverage", "Validate that the user is able to observe the percentage coverage at each level ");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);

        PJPDashboard pjpDashboard = new PJPDashboard(driver);
        SoftAssert softAssert = new SoftAssert();

        loginPages.validLoginCorpPjp();
        handleAlert();

        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
        pjpDashboard.clickMajorRegionEastButton();
        handleAlert();
        pjpDashboard.clickSouthRegionButton();
        handleAlert();
        pjpDashboard.clickImoSubRegionButton();
        handleAlert();
        pjpDashboard.clickMbaitoliTerritoryButton();
        handleAlert();
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='cardColors']"));
        int count =0;
        for(WebElement element : elements){
            if(element.getText().contains("%")){
                count++;
            }
            else{
                count--;
            }
        }
        if(count==54){   //There should be 54 percentage signs on the site

            softAssert.assertTrue(true);
            logger.info("Test Passed");
            ExtentTestManager.getTest().pass("Test passed");
        }
        else {
            softAssert.assertTrue(false);
            logger.info("Test Failed");
            captureScreen(driver, "Tc_09_ValidateThatUserIsAbleToObserveThePercentageCoverage");
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Test completed");
    }
    @Test(priority = 9)
    public void Tc_10_ValidateManagerShallBeAbleToViewTerritoryToCluster() throws IOException {
        ExtentTestManager.startTest("Tc_10_ValidateManagerShallBeAbleToViewTerritoryToCluster", "Validate that the user can view clusters after clicking on territory");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        BasePage basePage = new BasePage(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);
        loginPages.validLoginCorpManager();
        handleAlert();
        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
        pjpDashboard.clickAlagbadoTerritoryButton();
        handleAlert();
        pjpDashboard.isAlagbadoTerriotoryContainerPresent("Tc_10_ValidateManagerShallBeAbleToViewTerritoryToCluster");





    }
    @Test(priority = 10)
    public void Tc_11_ValidateTestLeadCanViewCluster() throws IOException {
        ExtentTestManager.startTest("Tc_10_ValidateManagerShallBeAbleToViewTerritoryToCluster", "Validate that the user can view clusters after clicking on territory");
        LoginPage loginPages = new LoginPage(driver);
        DashBoard dashBoard = new DashBoard(driver);
        BasePage basePage = new BasePage(driver);
        PJPDashboard pjpDashboard = new PJPDashboard(driver);
        loginPages.validLoginCorpTestLead();
        handleAlert();
        dashBoard.clickReportsButton();
        handleAlert();
        dashBoard.clickPublicReportsButton();
        handleAlert();
        dashBoard.clickPjpDashboardButton();
        handleAlert();
        pjpDashboard.isClusterContainerTestLeadPresent("Tc_11_ValidateTestLeadCanViewCluster");

    }













}
