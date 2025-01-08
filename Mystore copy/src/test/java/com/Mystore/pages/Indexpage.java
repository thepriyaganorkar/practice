package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Indexpage {

	WebDriver driver1;
	
	public Indexpage(WebDriver driver)
	{
		driver1=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Sign in")
	WebElement SignIn;
	
	public void clickonSignIn() {
		
		SignIn.click(); 
	}
}
