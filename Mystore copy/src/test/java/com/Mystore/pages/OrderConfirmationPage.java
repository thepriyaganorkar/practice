package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	WebDriver driver;

	public OrderConfirmationPage(WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(xpath="//p/button[@type='submit']")
	WebElement Confirmation;
	@FindBy(xpath="//div/p[@class='alert alert-success']")
	WebElement OrderConfirmationmsg;
	

	public void clickonConfirmOrder()
	{
		Confirmation.click();	
	}
	public String getConfirmationMessage()
	{
		return OrderConfirmationmsg.getText();	
	}
	
	
}
