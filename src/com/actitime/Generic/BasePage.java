package com.actitime.Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	

	}
	
	public void verifyTitle(String etitle)
	{
		try
		{
			WebDriverWait wait=  new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(etitle));
		Reporter.log("tiitle is matching",true);
		
		
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching,Expeccted title is"+etitle,true);
			Reporter.log("Actual Title is"+driver.getTitle(),true);
			Assert.fail();
		}
	}
		public void VerifyElement(WebElement ele)
		{
			try
			{
				WebDriverWait wait=  new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("element is present",true);
			
			
			}
			catch(Exception e)
			{
				Reporter.log("element is not present",true);
				
				Assert.fail();
			
		}
		
		
		
		
	}

}
