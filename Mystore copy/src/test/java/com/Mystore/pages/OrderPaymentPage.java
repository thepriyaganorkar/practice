package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {

	WebDriver driver;

	public OrderPaymentPage(WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(xpath="//a[@title='Pay by check.']")
	WebElement paybycheck;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement paybywire;
	
	
	public void clickpaycheck()
	{
		paybycheck.click();	
	}
	public void clickpaybywire()
	{
		paybywire.click();
		
	}	
	
}
