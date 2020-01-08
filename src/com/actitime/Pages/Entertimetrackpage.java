package com.actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.Generic.BasePage;

public class Entertimetrackpage extends BasePage {
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	
	
	

	public Entertimetrackpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickonlogout()
	{
		logoutbtn.click();
	}

	

}
