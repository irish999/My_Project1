package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement Btnlogin;

	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtnlogin() {
		return Btnlogin;
	}


	
	
	

}
