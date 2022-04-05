package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		String filepath = "E:\\Eclipse\\My_Project1\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(filepath);
		reporter.config().setDocumentTitle("My_Project1");
		reporter.config().setReportName("Automation report");
		reporter.config().setTheme(Theme.DARK);
		
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("ProjectName", "RJ");
		extent.setSystemInfo("QA","Rishi");
		return extent;
		
		
		}


	
}
