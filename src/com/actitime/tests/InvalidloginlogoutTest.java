package com.actitime.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.actitime.Generic.BasePage;
import com.actitime.Generic.BaseTest;
import com.actitime.Generic.EXcelData;
import com.actitime.Pages.Loginpage;

public class InvalidloginlogoutTest extends BaseTest {
	
	@Test
	public void testinvalidloginlogout() throws InterruptedException
	{
	String Ltitle=EXcelData.getdata(filepath,"TC01",1,2);
	String Errmsg=EXcelData.getdata(filepath,"TC02",1,2);
	Loginpage lp=new Loginpage(driver);
		 lp.verifyTitle(Ltitle); 
	int rc=EXcelData.getrowcount(filepath, "TC02");
	for(int i=1;i<=rc;i++)
	{
	 String username = EXcelData.getdata(filepath, "TC02", i, 0);
	 String password = EXcelData.getdata(filepath, "TC02", i, 1);
	 Reporter.log("username is"+username,true);
	 lp.enterusername(username);
	 Reporter.log("password is"+password,true);
	 lp.enterpassword(password);
	 lp.clickonLogin();
	Thread.sleep(2000);
	
	 
	
	}
	
		
		
		
	}

	
	}
	
	


