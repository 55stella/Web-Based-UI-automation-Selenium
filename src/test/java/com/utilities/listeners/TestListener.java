package com.utilities.listeners;

import static com.utilities.extentReports.ExtentTestManager.getTest;

import com.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.utilities.extentReports.ExtentManager;
import com.utilities.logs.Log;
public class TestListener extends BaseClass implements ITestListener {


	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Override
	public void onStart(ITestContext iTestContext) {
		Log.info("Process is onStart method" + iTestContext.getName());
		iTestContext.setAttribute("Webdriver", BaseClass.driver);
	}

	@Override
	public void onFinish(ITestContext iTestContext) {
		Log.info("Process is onfinish method" + iTestContext.getName());
		ExtentManager.extentReports.flush();
	}
	@Override
	public void onTestStart(ITestResult iTestResult) {
		Log.info(getTestMethodName(iTestResult) + "test is starting");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		Log.info(getTestMethodName(iTestResult) + "Test has succeded");
	}
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		Log.info(getTestMethodName(iTestResult) + " Test has failed");
		if (driver != null) {
			String failedScreenShot = "data:image/png;base64," + ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			getTest().log(Status.FAIL, "Test has Failed", getTest().addScreenCaptureFromBase64String(failedScreenShot).getModel().getMedia().get(0));
			} else {
				Log.error("Driver is null. Unable to capture screenshot.");}
		}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		Log.info(getTestMethodName(iTestResult) + "Test is skipped");
		getTest().log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

}

