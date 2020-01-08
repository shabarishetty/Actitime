package com.actitime.Generic;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import net.bytebuddy.description.type.TypeDescription.Generic;

public class BaseTest implements Autoconstant {

	
		
		public WebDriver driver;
		static
		{   
			System.setProperty(geckokey, geckovalue);
			
			System.setProperty(chromekey, chromevalue);
			
		}
		@BeforeMethod
		public void precondition()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			
		}
		@AfterMethod
		public void postcondition(ITestResult res)
		{
			int status=res.getStatus();
			if(status==2)
			{
				String name=res.getMethod().getMethodName();
				
				GenericUtils.getscreenshot(driver,name);
				
			}
			driver.close();
		}
		

	}

