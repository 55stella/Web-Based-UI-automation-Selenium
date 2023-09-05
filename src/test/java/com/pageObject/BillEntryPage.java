package com.pageObject;

import com.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BillEntryPage extends BasePage {

    public BillEntryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Sales']")
    WebElement sales;
    public void clickSales() {click(sales);}

    @FindBy(xpath = "//span[@class='menuLink'][normalize-space()='Bill Entry']")
    WebElement bill_entry;
    public void clickBillEntry() {
        click(bill_entry);
        sleep(4);}

    @FindBy(xpath = "//label[@class='pageTitleHeader1 p-1 m-1']")
    WebElement bill_entry_pageTitle;
    public boolean isBillEntryPageDisplayed() {return bill_entry_pageTitle.isDisplayed();}

    @FindBy(xpath = "//*[@id=\"entityType\"]/option[2]")
    WebElement option_2;
    @FindBy(xpath = "//select[@id='entityType']")
    WebElement customer_type;
    public void selectCustomerType() {
        customer_type.click(); option_2.click(); sleep(3);
    }
    public boolean isCustomerTypeClickable() {return customer_type.isEnabled();}

    @FindBy(xpath = "//select[@id='hidsalesman']")
    WebElement DSA;
    @FindBy(xpath = "//*[@id=\"hidsalesman\"]/option[2]")
    WebElement DSA_option_2;
    public void selectDSA() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(DSA)));
        click(DSA);
        click(DSA_option_2);
    }
    public boolean isDSAClickable() {return DSA.isEnabled();}


    @FindBy(xpath = "//select[@id='setBeat']")
    WebElement cluster;
    @FindBy(xpath = "//*[@id=\"setBeat\"]/option[2]")
    WebElement cluster_option_2;
    public void selectCluster() {click(cluster); click(cluster_option_2);}
    public boolean isClusterClickable() {return cluster.isEnabled();}


    @FindBy(xpath = "//input[@id='customer']")
    WebElement customer_name;
    @FindBy(className = "ui-menu-item-wrapper")
    WebElement customer_nameOption;
    public void enterCustomerName() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(customer_name)));
        customer_name.click();
        customer_name.sendKeys(Keys.SPACE);
        sleep(10);
        System.out.println(customer_nameOption.getText());
        customer_nameOption.click();
//        customer_name.sendKeys("Choice store MTN");
//        waitForElement(customer_nameOption);
//       customer_name.sendKeys(Keys.ENTER);sleep(2);
    }
    public boolean isCustomerNameClickable() {return customer_name.isEnabled();}

    @FindBy(xpath = "//img[@id='iDate']")
    WebElement bill_date;
    public void enterBillDate() {click(bill_date);}
    public boolean isBillDateClickable() {return bill_date.isEnabled();}

    @FindBy(xpath = "//input[@id='deliveryDate']")
    WebElement delivery_date;
    public void enterDeliveryDate() {delivery_date.clear(); sendText(delivery_date, "29/08/2023");}
    public boolean isDeliveryDateClickable() {return delivery_date.isEnabled();}

    @FindBy(xpath = "//*[@id=\"paymentMode\"]/option[6]")
    WebElement payMode_option_6;
    @FindBy(xpath = "//select[@id='paymentMode']")
    WebElement pay_mode;
    public void selectPayMode() {click(pay_mode); click(payMode_option_6);}
    public boolean isPayModeClickable() {return pay_mode.isEnabled();}


//    @FindBy(xpath = "//input[@id='nameCode']")
//    WebElement product_code;
//    public void enterProductCode() {sendText("DATAEI53G");}
//    public boolean isProductCodeClickable() {return product_code.isEnabled();}
//
//    @FindBy(xpath = "//input[@id='nameCode']")
//    WebElement serial_number;
//    public void enterSerialNumber() {sendText("");}
//    public boolean isSerialNumberClickable() {return serial_number.isEnabled();}

    @FindBy(xpath = "//img[@id='arrowDownImg1']")
    WebElement arrow_button;
    public void clickArrowButton() {scrollIntoViewWithJavascript(arrow_button);}
    public boolean isArrowButtonClickable() {return arrow_button.isEnabled();}


    @FindBy(xpath = "//input[@id='clear']")
    WebElement clear_btn;
    public void clickClearBtn() {click(clear_btn);}
    public boolean isClearBtnClickable() {return clear_btn.isEnabled();}

    @FindBy(xpath = "//input[@id='finalize']")
    WebElement calculate_btn;
    public void clickCalculateBtn() {scrollIntoViewWithJavascript(calculate_btn);}
    public boolean isCalculateBtnClickable() {return calculate_btn.isEnabled();}

    @FindBy(xpath = "//input[@id='confirm']")
    WebElement confirm_btn;
    public void clickConfirmBtn() {scrollIntoViewWithJavascript(confirm_btn);}
    public boolean isConfirmBtnClickable() {return confirm_btn.isEnabled();}
}
