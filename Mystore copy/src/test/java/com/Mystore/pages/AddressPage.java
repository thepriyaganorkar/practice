package com.Mystore.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

WebDriver driver;
	
	public AddressPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	/*@FindBy(xpath="//input[@id='address1']")
	WebElement Add1;
	@FindBy(xpath="//div/input[@id='address2']")
	WebElement Add2;
	@FindBy(css="#city")
	WebElement City;
	@FindBy(id="id_state")
	WebElement State;
	@FindBy(id="postcode")
	WebElement Zipcode;
	@FindBy(id="id_country")
	WebElement Country;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="phone_mobile")
	WebElement MobileNo;
	@FindBy(name="alias")
	WebElement addrsstitle;
	@FindBy(id="submitAddress")
	WebElement SaveAddress;
	@FindBy(xpath="//a[@title='Update'])[1]")
	WebElement updateAddress;
	@FindBy(className="ajax_cart_product_txt")
	WebElement Cart; */
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement Checkout;
	//Xpath to find first element from multiple 
	/////(//span[contains(text(),'Update')])[1]
	//(//a[@title='Update'])[1]/ajax_cart_product_txt
	/* public void EnterAdd1(String add1) {
		 Add1.sendKeys(add1);
	 } 
	 public void EnterAdd2(String add2) {
		 Add2.sendKeys(add2);
	 }
	 
	 public void EnterCity(String cityname) {
		 City.sendKeys(cityname);
	 }
	 public void EnterState(String statename) {
		 State.sendKeys(statename);
	 }
	 public void Enterzipcode(String zipcode) {
		 Zipcode.sendKeys(zipcode);
	 }
	 //
	 public Void Entercountry(String countryname)
	 {
		 Select countname=new Select(Country);
		 countname.selectByValue(countryname);
		 return null;
	 }
	 public void Enterphone(String hphone) {
		 phone.sendKeys(hphone);
	 }	 //
	 public void Entermobilephone(String mphone) {
		 MobileNo.sendKeys(mphone);
	 }
	 
	 public void Entervalue(String value) {
		 addrsstitle.sendKeys(value);
	 }
	 public void ClickonSave() {
		 SaveAddress.click();	 
	 } 
	 public void MoveToCart() {
	
		  Actions act=new Actions(driver);
		  act.moveToElement(Cart).build().perform();
	 } */
	 
	 public void Clickoncheckout() {
		 Checkout.click();
	 } 
	 
	 
	 //public void ClickonUpdateAddress() {
	//updateAddress.click();
		 
	// } //UpdateAddres
}
	 //
	 
	 

//Florida
//32003
//United State
//9970521510
//sssss
