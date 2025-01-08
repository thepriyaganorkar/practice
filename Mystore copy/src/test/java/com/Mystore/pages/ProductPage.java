package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
WebDriver driver;
	
	public ProductPage(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(id="color_11")
	WebElement Colour;

	@FindBy(css="#quantity_wanted")
	WebElement Quantity;
	
	@FindBy(xpath="//select[contains(@class,'form-control attribute_select no-print')]")
	WebElement Selectsize;
	
	@FindBy(css="button[name='Submit'] span")
	WebElement AddtoCart;
	
	@FindBy(xpath="//a[contains(@title,'Proceed to checkout')]")
	WebElement ProceedToCheckout;
	
	
	public void selectcolour() {
		Colour.click();
	}
	
	public void Enterquantity(String qnty) {
		Quantity.clear();
		Quantity.sendKeys(qnty);;
	}
	
	public void SelectSize1(String size) 
	{
		Select sc=new Select(Selectsize);
		sc.selectByVisibleText(size);
	}
	
	public void clickonAddToCart() {
		AddtoCart.click();
	}
	public void ClickonProceed() {
		ProceedToCheckout.click();
	}
}
