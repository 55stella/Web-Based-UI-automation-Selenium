package com.utilities.listeners;

import static com.base.BaseClass.driver;
import static com.utilities.extentReports.ExtentTestManager.getTest;

import com.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;


public class Retry implements IRetryAnalyzer {

 private int count = 0;
private static int maxTry = 1; //Run the failed test 2 times

@Override
public boolean retry(ITestResult iTestResult) {
	if (!iTestResult.isSuccess()) {
		if (count < maxTry) {
			count++;
iTestResult.setStatus(ITestResult.FAILURE);
 extendReportsFailOperations(iTestResult);
return true;}

 } else {
	 iTestResult.setStatus(ITestResult.SUCCESS);
 }
	return false;

}

public void extendReportsFailOperations(ITestResult iTestResult) {
 Object testClass = iTestResult.getInstance();


 WebDriver webDriver = BaseClass.getDriver();
String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BASE64);
 getTest().log(Status.FAIL, "Test Failed",
getTest().addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));}



}
