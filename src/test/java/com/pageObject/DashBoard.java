package com.pageObject;

import com.base.BaseClass;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    BasePage basePage = new BasePage(driver);

     // Actions
    public void clickSelectAttribute(){
        basePage.waitForElement(selectAttribute);
        selectAttribute.click();

    }
    public void clickSearchLogo(){
        basePage.waitForElement(searchLogo);
        searchLogo.click();

    }

    public void clickDistributorProfile(){
        basePage.waitForElement(distributorProfileOption);
        distributorProfileOption.click();

    }
    public void clickOpenOption(){
        basePage.waitForElement(openOption);
        openOption.click();
    }
    public void clickDistributorName(){
        basePage.waitForElement(distributorName);
        distributorName.click();
    }

    public void selectDistributorProfile(){
        clickSelectAttribute();
        clickDistributorProfile();
        clickSearchLogo();
        clickDistributorName();
        clickOpenOption();
    }




}
