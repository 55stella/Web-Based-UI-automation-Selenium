package com.utilities.extentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static final ExtentReports extentReports = new ExtentReports();


	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/project-report.html");
		reporter.config().setReportName("TAAS:TRADE AUTOMATION SOLUTION REGRESSION REPORT");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Test Name", "Trade Automation Solution");
		extentReports.setSystemInfo("Authors", "Olawale Tomiwa and Michael Shonde");
		return extentReports;
	}
}
