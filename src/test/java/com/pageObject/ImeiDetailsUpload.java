package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy
    @CacheLookup
    public WebElement bulkUploadButton;

    @FindBy
    @CacheLookup
    public WebElement downloadButton;


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



}
