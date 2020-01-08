package com.actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Generic.BasePage;

public class Loginpage extends BasePage
{
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement untb;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errmessage;
	
	@FindBy(xpath="//nobr[text()='actTIME 2020.1 pro']")
	
	private WebElement version;
	
	
	
	
	
	

	
	
	public Loginpage(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
	}

	

	public void verifyTitle(String etitle)
	{

	
	verifyTitle(etitle);
	
	
	
	
	
	}
	
	public void enterusername(String un)
	{
		untb.sendKeys(un);
		
	}
	
	public void enterpassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	
	public void clickonLogin()
	{
		lgbtn.click();
		
	}
	
}
	

