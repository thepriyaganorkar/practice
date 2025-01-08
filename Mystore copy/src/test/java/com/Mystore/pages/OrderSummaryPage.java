package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {

	
WebDriver driver;
	
	public OrderSummaryPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(css="a[class='button btn btn-default standard-checkout button-medium']")
	WebElement ProceedToCheckout2;

	 public void clickProceed2() {
		 ProceedToCheckout2.click();
	 }
}
