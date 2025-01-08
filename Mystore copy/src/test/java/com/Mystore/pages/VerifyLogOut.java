package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLogOut {
	WebDriver driver;

	public VerifyLogOut (WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(xpath="//a[@title='Log me out']")
		WebElement SignOut;
	
	public void clicksignout()
	{
		SignOut.click();
		
	}






}

