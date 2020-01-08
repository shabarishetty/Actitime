package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;

import com.actitime.Generic.BaseTest;
import com.actitime.Generic.EXcelData;
import com.actitime.Pages.Entertimetrackpage;
import com.actitime.Pages.Loginpage;

public class validloginlogout extends BaseTest {

	@Test(priority = 1)
	public void itestvalidloginlogout() throws InterruptedException {
		String ITitle = EXcelData.getdata(filepath, "TC01", 1, 2);
		String username = EXcelData.getdata(filepath, "TC01", 1, 0);
		String password = EXcelData.getdata(filepath, "TC01", 1, 1);
		String eTitle = EXcelData.getdata(filepath, "TC01", 1, 3);

		Loginpage lp = new Loginpage(driver);

		Entertimetrackpage ep = new Entertimetrackpage(driver);

		lp.verifyTitle(ITitle);
		Reporter.log("username is" + username, true);

		lp.enterusername(username);
		Reporter.log("password  is" + password, true);
		lp.enterpassword(password);
		;
		lp.clickonLogin();
		Thread.sleep(2000);
		 lp.verifyTitle(eTitle); 
		ep.clickonlogout();
		Thread.sleep(2000);
		
		  
		  ep.clickonlogout(); lp.verifyTitle(ITitle); Thread.sleep(2000);
		  
		 
	}

}
