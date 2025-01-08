package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    WebDriver driver;
	
	public SearchResultPage(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(id="search_query_top")
	WebElement SearchProduct;
	@FindBy(name="submit_search")
	WebElement clickonsearch;
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line hovered']//img[@title='Printed Summer Dress']")
     WebElement productname;
	@FindBy(xpath="//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//a[@class='button lnk_view btn btn-default']")
	WebElement More;
	public void entershirtname(String searchkey) {
		SearchProduct.sendKeys(searchkey);
	}
	public void Clicksearch() {
		clickonsearch.click();
	}
	
	public String getsearchproductname()
	{
		//productname.click();
		return(productname.getText());
	}
	public void ClickonMore() {
		More.click();
	}
	
}
