package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddrdressproceedTocheckoutPage {

	WebDriver driver;

	public AddrdressproceedTocheckoutPage(WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(linkText="Proceed to checkout")
	WebElement proceedtocheckout;
	
	public void clickProceed3()
	{
		proceedtocheckout.click();
		
	}

	
	
}
