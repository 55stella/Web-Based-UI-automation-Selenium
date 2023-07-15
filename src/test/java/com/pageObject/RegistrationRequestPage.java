package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class RegistrationRequestPage extends BaseClass {

    public RegistrationRequestPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    BasePage basePage = new BasePage(driver);
    @FindBy(id="actionBtnAPPROVE")
    @CacheLookup
    public WebElement approveButton;

    @FindBy(id="actionBtnREJECT")
    @CacheLookup
    public WebElement rejectButton;

    @FindBy(id = "regRemarks")
    @CacheLookup
    public WebElement remarkTextBox;

    @FindBy(xpath="//div[text()='19456']")   // change if the account 19546 has been used
    @CacheLookup
    public WebElement agentNameAnswer;

    @FindBy(xpath="//div[text()='null']")   // change if the account 19546 has been used
    @CacheLookup
    public WebElement agentMsisdnAnswer;
    @FindBy(xpath="//div[text()='100000048798862,Dan Flani Plaza Adjacent Sitra Pharmacy Gawonama Area']")   // change if the account 19546 has been used
    @CacheLookup
    public WebElement agentLocationAnswer;

    public void enterRemark(String text){
        basePage.waitForElement(remarkTextBox);
        remarkTextBox.sendKeys(text);
    }


    public void clickApproveButton(){
        basePage.waitForElementClick(approveButton);
        approveButton.click();
    }
    public void isApproveButtonClickable(String testCaseName) throws IOException {
        basePage.isClickable(approveButton,testCaseName);
    }
    public void clickRejectButton(){
        basePage.waitForElementClick(rejectButton);
        rejectButton.click();
    }
    public void isRejectButtonClickable(String testCaseName) throws IOException {
        basePage.isClickable(rejectButton,testCaseName);
    }
    public void isAgentNameEditable(String testcaseName) throws IOException {
        basePage.isWebElementEditable(agentNameAnswer,testcaseName);
    }
    public void isAgentMSISDNEditable(String testcaseName) throws IOException {
        basePage.isWebElementEditable(agentMsisdnAnswer,testcaseName);
    }
    public void isAgentLocationEditable(String testcaseName) throws IOException {
        basePage.isWebElementEditable(agentLocationAnswer,testcaseName);
    }
    public void isSuccessfulAlertDisplayed(String testCaseName) throws IOException {
        basePage.checkTextInAlert("approved successfully",testCaseName);
    }
    public void isRejectedAlertDisplayed(String testCaseName) throws IOException {
        basePage.checkTextInAlert("rejected successfully",testCaseName);
    }


}
