package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.Loginpom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test001 extends BaseClass {
	
	@Test
	public void verify_001() { 
		
//identify webelements
//email
//pass
//login button
		
//		Loginpom login=	PageFactory.initElements(driver, Loginpom.class);
	Loginpom login=	PageFactory.initElements(driver, Loginpom.class);
		
		Library.custom_sendkeys(login.getEmailid(),excel.getStringData("Sheet1", 0, 0),"Emailid");
		Library.custom_sendkeys(login.getPass(),excel.getStringData("Sheet1", 3, 0),"Password");
		Library.custom_click(login.getBtnlogin(),"Login button");
		
	}
}  


