package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class ImeiDetailsUpload extends BaseClass {

    public ImeiDetailsUpload(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    BasePage basePage = new BasePage(driver);

    @FindBy(xpath = "//input[@id='deviceImei']")
    @CacheLookup
    public WebElement imeiField;

    @FindBy(id= "msisdn")
    @CacheLookup
    public WebElement msisdnField;

    @FindBy(id="save")
    @CacheLookup
    public WebElement saveButton;

    @FindBy(xpath="//input[@name='uploadType' and @id='uploadType' and @type='radio' and @onclick='deviceActivationDetailsUpload.showUploadType(2);']")
    @CacheLookup
    public WebElement bulkUploadButton;

    @FindBy(xpath="//a[text()='Download Template file ']")
    @CacheLookup
    public WebElement downloadButton;

    @FindBy(id="filePath")
    @CacheLookup
    public WebElement fileUploadField;

    @FindBy(id="uploadBtn")
    @CacheLookup
    public WebElement uploadButton;

   // public String invalidExcelFilePath= "src/test/java/com/testData/CopyOfIATTestTrackerOfIMEIRequestApprovalIMEIUpload.xlsx";

    public String projectRootPath = System.getProperty("user.dir");
    public String invalidExcelFilePath = projectRootPath + "/src/test/java/com/testData/CopyOfIATTestTrackerOfIMEIRequestApprovalIMEIUpload.xlsx";
    public void clickSaveButton(){
        basePage.waitForElement(saveButton);
        saveButton.click();
    }
    public void enterImei(int num){
        basePage.waitForElement(imeiField);
        imeiField.sendKeys(basePage.randomNum(num));
    }
    public void enterValidMSISDN(){
        basePage.waitForElement(msisdnField);
        msisdnField.sendKeys("234"+basePage.randomNum(10));
    }
    public void enterInvalidMSISDN(){
        basePage.waitForElement(msisdnField);
        msisdnField.sendKeys(basePage.randomNum(11));
    }
    public void isBulkUploadClickable(String testCaseName) throws IOException {
        basePage.isClickable(bulkUploadButton,testCaseName);
    }
    public void isDownloadButtonClickable( String testCaseName) throws IOException {
        basePage.isClickable(downloadButton,testCaseName);
    }
    public void clickBulkUploadButton(){
        basePage.waitForElement(bulkUploadButton);
        bulkUploadButton.click();
        bulkUploadButton.click();
    }
    public void clickDownloadButton(){
        basePage.waitForElement(downloadButton);
        downloadButton.click();
    }

    public void fileUpload(String filePath){
        basePage.waitForElement(fileUploadField);
        fileUploadField.sendKeys(filePath);
    }



}
