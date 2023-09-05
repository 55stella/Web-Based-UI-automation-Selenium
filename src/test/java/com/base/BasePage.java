package com.base;

import com.pageObject.loginPage;
import com.utilities.extentReports.ExtentTestManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import static com.base.BaseClass.driver;

public class BasePage extends BaseClass {
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	SoftAssert softAssert = new SoftAssert();

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void waitForElement(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			System.out.println("Element is not visible: " + element);
		}
	}
	public void clickElementWithJavaScript(WebElement element) {
		jsExecutor.executeScript("arguments[0].click();", element);
	}
	public void longWait () {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public void shortWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static String randomestring()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5); // generate random char string with the specified values passed
		return (generatedString1);
	}

	public static String randomeNum()
	{
		String generatedString2 = RandomStringUtils.randomNumeric(4);// generate random digits with the specified values passed
		return (generatedString2);
	}
	public void waitForTwentySeconds() throws InterruptedException {
		Thread.sleep(20000);
	}
	public String randomNum(int num){
		String generatedString2 = RandomStringUtils.randomNumeric(num);// generate random digits with the specified values passed
		return (generatedString2);
	}




	public void click(WebElement element) {
		waitForElement(element);
		element.click();
	}
	public void waitForElementClick(WebElement  element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public String getText(WebElement element){
		waitForElement(element);
		return element.getText();
	}


	public void sleep(int time) {
		try {
			Thread.sleep(time*1000);//content of sleep is in MS
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void sendText(WebElement element,String text){

     	waitForElement(element);
		element.sendKeys(text);

	}
	public boolean isElementPresent(WebDriver driver, WebElement element) {
		try {
			element.isDisplayed();
			return true; // Element found
		} catch (NoSuchElementException | NullPointerException e) {
			return false; // Element not found
		}


	}

	public boolean isElementClickable(WebDriver driver, WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150)); // Set a reasonable timeout
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true; // Element is clickable
		} catch (Exception e) {
			return false; // Element is not clickable
		}
	}
	public void isClickable(WebElement element, String testCaseName) throws IOException {
		if(isElementClickable(driver, element)){
			softAssert.assertTrue(true);
			logger.info("Test Passed");
			ExtentTestManager.getTest().pass("Test passed");

		}
		else {
			softAssert.assertTrue(false);
			logger.info("Test Failed!");
			captureScreen(driver,testCaseName);
			ExtentTestManager.getTest().fail("Test Failed");
		}
		softAssert.assertAll();
		logger.info("Test completed");




	}
	public void checkTextInAlert(String text, String testCaseName) throws IOException {
		Alert alert = driver.switchTo().alert();
		String alertText= alert.getText().toLowerCase();
        String cleanText=text.replaceAll("/s","").toLowerCase();
		System.out.println(alertText);
		boolean isTextPresent= alertText.contains(cleanText);
		alert.accept();
		if (isTextPresent){
			softAssert.assertTrue(true);
			logger.info("Test Passed");
			ExtentTestManager.getTest().pass("Test passed");
		}
		else {
			softAssert.assertTrue(false);
			logger.info("Test Failed!");
			captureScreen(driver,testCaseName);
			ExtentTestManager.getTest().fail("Test Failed");
		}
		softAssert.assertAll();
		logger.info("Test completed");

	}
	public void isWebElementEditable(WebElement element, String testCaseName) throws IOException {
		Boolean check = element.isEnabled() &&
				element.getAttribute("readonly") == null &&
				element.getAttribute("disabled") == null &&
				(element.getTagName().equals("input") ||
						element.getTagName().equals("textarea") ||
						element.getTagName().equals("select"));

		if (check) {
			softAssert.assertTrue(false);
			logger.info("Test Failed!");
			captureScreen(driver, testCaseName);
			ExtentTestManager.getTest().fail("Test Failed");


		} else {
			softAssert.assertTrue(true);
			logger.info("Test Passed");
			ExtentTestManager.getTest().pass("Test passed");
		}
		softAssert.assertAll();
		logger.info("Test completed");

	}

	public void scrollToElement(WebElement element){
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}


	public boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}


	}
}
