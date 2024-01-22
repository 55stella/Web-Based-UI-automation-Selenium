package com.pageObject;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillBrowserPage extends BasePage {

    public BillBrowserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[@class='menuLink'][normalize-space()='Bill Browser']")
    WebElement billBrowser;
    public void clickBillBrowser() {click(billBrowser);}

    @FindBy(xpath = "//label[@class='pageTitleHeader1 p-1 m-1 pl-4']")
    WebElement pageTitleHeader;
    public boolean isBillBrowserDisplayed() {return pageTitleHeader.isDisplayed();}

    @FindBy(xpath = "//input[@id='viewButton']")
    WebElement view;
    public boolean isViewButtonClickable() {waitForElement(view);return view.isEnabled(); }
    public void clickViewButton() {click(view);}

}
