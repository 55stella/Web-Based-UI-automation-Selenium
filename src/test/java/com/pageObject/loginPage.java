package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


import javax.xml.xpath.XPath;

public class loginPage extends BaseClass {

    BasePage basePage= new BasePage(driver);
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="userName")
    @CacheLookup
    public WebElement usernameField;

    @FindBy(id = "entityCode")
    @CacheLookup
    WebElement entityCodeField;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    public WebElement passwordField;

    @FindBy(xpath = "//button[@id='logInBtn']")
    @CacheLookup
    public WebElement logInButton;





    //actions

    //login for corp account
    public void enterEntityCodeCorp(){
        basePage.sendText(entityCodeField,entityCodeCorp);
    }
    public void enterPasswordCorp(){
        basePage.sendText(passwordField,passwordCorp);
    }
    public void enterUserNameCorp(){
        basePage.sendText(usernameField,usernameCorp);
    }
    public void enterEntityCodePartner(){
        basePage.waitForElementClick(entityCodeField);
        basePage.sendText(entityCodeField, entityCodePartner);
    }
    public void enterPasswordPartner(){
        basePage.waitForElementClick(passwordField);
        basePage.sendText(passwordField,passwordPartner);
    }
    public void enterUserNamePartner(){
        basePage.waitForElementClick(usernameField);
        basePage.sendText(usernameField,usernamePartner);
    }
    public void clickLoginButton(){
        basePage.waitForElementClick(logInButton);
        logInButton.click();
    }
    //partner account
    public void partnerAccountLogin(){
        enterEntityCodePartner();
        enterUserNamePartner();
        enterPasswordPartner();
    }
    //corp account
    public void corpAccountLogin(){
        enterEntityCodeCorp();
        enterUserNameCorp();
        enterPasswordCorp();
    }








}
