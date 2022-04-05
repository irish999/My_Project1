package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void bs() throws Exception {
		 config = new ConfigDataProvider();
		 excel = new ExcelDataProvider();
	}
	
	@Parameters({"BrowserName"})
	
	@BeforeMethod
	public void OpenBrowser(String BrowserName) {
//		Browser open
		if(BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		 driver.get(config.getBaseUrl_stage());
		 driver.manage().window().maximize();
		 
		 
	}
	
	@AfterMethod
	public void teardown() {
//		close 
		driver.quit();
	}

}
