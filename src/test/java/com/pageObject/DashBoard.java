package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import com.utilities.extentReports.ExtentTestManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class DashBoard extends BaseClass {
    public DashBoard(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='searchAttribute']")
    @CacheLookup
    public WebElement selectAttribute;

    @FindBy(xpath="//select[@id='searchAttribute']/option[text()='Distributor profile']")
    @CacheLookup
    public WebElement distributorProfileOption;

    @FindBy(xpath="//td[@class='circle']")
    @CacheLookup
    public WebElement searchLogo;

    @FindBy(xpath = "//span[text()='Open ']")
    @CacheLookup
    public WebElement openOption;

    @FindBy(xpath = "//td[@data-label='Name']")
     @CacheLookup
    public  WebElement distributorName;

    @FindBy(id="desktopBody")
    @CacheLookup
    public WebElement dashBoardBody;

    @FindBy(id="pendingWorklistCount")
    @CacheLookup
    public WebElement bellIcon;

    @FindBy(xpath = "//span[text()='Registration Request for Approval']")
    @CacheLookup
    public WebElement registrationRequestForApproval;

    //for test purposes
    @FindBy(id="parentFeatureTR0")
    @CacheLookup
    public WebElement stock;

    @FindBy(xpath = "//span[text()='Reports']")
    @CacheLookup
    public WebElement reportsButton;

    public void clickReportsButton(){
        basePage.waitForElement(reportsButton);

        reportsButton.click();
        logger.info("Clicked on reports option");
    }

    @FindBy(xpath = "//span[text()=' Profile Reports']")
    @CacheLookup
    public WebElement publicReportsButton;

    public void clickPublicReportsButton(){
        basePage.waitForElement(publicReportsButton);
        publicReportsButton.click();
        logger.info("Clicked on public reports");
    }

    @FindBy (xpath = "//span[text()='Pjp Dashboard']")
    @CacheLookup
    public WebElement pjpDashBoardButton;

    public void clickPjpDashboardButton(){
        basePage.waitForElement(pjpDashBoardButton);
        pjpDashBoardButton.click();
        logger.info("Clicked on pjp dashboard");
    }







    SoftAssert softAssert = new SoftAssert();
    BasePage basePage = new BasePage(driver);




     // Actions
    public void clickSelectAttribute(){
        basePage.waitForElement(selectAttribute);
        selectAttribute.click();
        logger.info("Clicked on select attribute");

    }
    public void clickSearchLogo(){
        basePage.waitForElement(searchLogo);
        searchLogo.click();
        logger.info("Clicked on search logo");

    }

    public void clickDistributorProfile(){
        basePage.waitForElement(distributorProfileOption);
        distributorProfileOption.click();
        logger.info("Clicked on distributor profile ");

    }
    public void clickOpenOption(){
        basePage.waitForElement(openOption);
        openOption.click();
        logger.info("Clicked on open");

    }
    public void clickRegistrationRequestForApproval(){
        basePage.waitForElement(registrationRequestForApproval);
        registrationRequestForApproval.click();
        logger.info("Click on registration request for approval");
    }
    public void clickBellICon(){
        basePage.waitForElement(bellIcon);
        bellIcon.click();
        logger.info("Clicked on Bell icon");
    }
    public void clickDistributorName(){
        basePage.waitForElement(distributorName);
        distributorName.click();
        logger.info("Clicked on code details");
    }

    public void selectDistributorProfile(){
        clickSelectAttribute();
        clickDistributorProfile();
        clickSearchLogo();
        clickDistributorName();
        clickOpenOption();
    }
    public void isDashboardPresent() throws IOException {



        if(basePage.isElementPresent(driver, dashBoardBody)){
            basePage.waitForElementClick(dashBoardBody);
            softAssert.assertTrue(true);
            logger.info("Test Passed! TC_02_Validate_that_the_customer_can_login_as_a_partner");
            ExtentTestManager.getTest().pass("Test passed");


        }
        else{
            softAssert.assertTrue(false);
            logger.info("Test Failed!");
            captureScreen(driver,"TC_02_Validate_that_the_customer_can_login_as_a_partner");
            ExtentTestManager.getTest().fail("Test Failed");
        }
        softAssert.assertAll();
        logger.info("Completed LoginTest");

    }

    public void isBellIconClickable (String testCaseName) throws IOException {
        basePage.isClickable(bellIcon,testCaseName);
    }
    public void isRequestForRegistrationClickable(String testCaseName) throws IOException {
        basePage.isClickable(registrationRequestForApproval,testCaseName);

    }

    public void isSelectAttributeDropdownClickable(String testCaseName) throws IOException {
        basePage.isClickable(selectAttribute,testCaseName);
    }
    public void isDistributorProfileClickable(String testcaseName) throws IOException {
        basePage.isClickable(distributorProfileOption,testcaseName);
    }
    public void isSearchButtonClickable(String testCaseName) throws IOException {
        basePage.isClickable(searchLogo,testCaseName);
    }
    public void isCodeDetailClickable(String testCaseName) throws IOException {
        basePage.isClickable(distributorName,testCaseName);
    }
    public void isOpenOptionClickable(String testCaseName) throws IOException {
        basePage.isClickable(openOption,testCaseName);
    }






}
