package com.base;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import static com.base.BaseClass.driver;

public class BasePage {
	private JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

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
	public void captureScreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
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




	public void click(WebElement element) {
		waitForElement(element);
		element.click();
	}
	public void waitForElementClick(WebElement  element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(150));
		wait.until(ExpectedConditions.elementToBeClickable(element));

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


}
