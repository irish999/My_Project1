package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener{

	ExtentReports extent= ExtentReportGenrator.getReports();	
	ThreadLocal<ExtentTest> extentest= new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extentest.set(Library.test);
		
	}

	public void onTestSuccess(ITestResult result) {
		extentest.get().log(Status.PASS, "Test case Pass");
		extentest.get().addScreenCaptureFromBase64String(getcapture());
	}

	public void onTestFailure(ITestResult result) {
		extentest.get().log(Status.FAIL, "Test case Fail");
		extentest.get().addScreenCaptureFromBase64String(getcapture());
	}

	public void onTestSkipped(ITestResult result) {
		extentest.get().log(Status.SKIP, "Test case Skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

	public String getcapture() {

	TakesScreenshot ts= (TakesScreenshot) driver;
	return ts.getScreenshotAs(OutputType.BASE64);
	
	
	}
	}
	
