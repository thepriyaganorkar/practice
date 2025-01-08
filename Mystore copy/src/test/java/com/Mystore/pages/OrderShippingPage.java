package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {


	WebDriver driver;

	public OrderShippingPage(WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(id="cgv")
	WebElement checkboxshipping;
	@FindBy(name="processCarrier")
	WebElement proceedtocheckoutshipping;
	
	
	public void clickcheckboxhipping()
	{
		checkboxshipping.click();	
	}
	public void clickProceedshipping()
	{
		proceedtocheckoutshipping.click();	
	}
	
}
