package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.interfaces.XECPrivateKey;

public class FilterPage {
    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="majorRegion")
    @CacheLookup
    public WebElement majorRegionField;

    @FindBy(xpath = "//option[contains(text(),'EAST')]")
    @CacheLookup
    public WebElement EastMajorRegionOption;

    public void selectEastMajorRegion(){
        majorRegionField.click();
        EastMajorRegionOption.click();
    }

    @FindBy(id="region")
    @CacheLookup
    public WebElement regionField;

    @FindBy(xpath = "//option[contains(text(), 'SOUTH')]")
    @CacheLookup
    public WebElement southRegionOption;

    public void selectSouthRegionOption(){
        regionField.click();
        southRegionOption.click();
    }

    @FindBy(id="subRegion")
    @CacheLookup
    public WebElement subRegionField;

    @FindBy(xpath = "//option[contains(text(), 'IMO')]")
    @CacheLookup
    public WebElement imoSubRegionOption;

    public void selectImoSubRegionOptionn(){
        subRegionField.click();
        imoSubRegionOption.click();
    }

    @FindBy(id="territory")
    @CacheLookup
    public WebElement territoryField;

    @FindBy(xpath = "//option[contains(text(), 'MBAITOLI')]")
    @CacheLookup
    public WebElement MbaitoliTerritoryOption;

    public void selectMbaitoliTerritoryOption(){
        territoryField.click();
        MbaitoliTerritoryOption.click();
    }

    @FindBy(id="cluster")
    @CacheLookup
    public WebElement clusterField;

    @FindBy(xpath = "//option[contains(text(), 'UZOAGBA')]")
    @CacheLookup
    public WebElement uzoagbaClusterOption;

    public void selectUzoagbaClusterOption(){
        clusterField.click();
        uzoagbaClusterOption.click();
    }



    @FindBy(xpath = "//button[contains(text(), 'View')]")
    @CacheLookup
    public WebElement viewButton;


    @FindBy(xpath="//div[@id='cardColors']")
    @CacheLookup
    public WebElement containerFromResult;














}
