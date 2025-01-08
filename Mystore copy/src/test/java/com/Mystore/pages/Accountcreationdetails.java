package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Accountcreationdetails {

	
	WebDriver driver;
	
	public Accountcreationdetails(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(id="id_gender2")
	WebElement gender;
	
	@FindBy(id="customer_firstname")
	WebElement Firstname;
	
	@FindBy(id="customer_lastname")
	WebElement Lastname;
	
//	@FindBy(id="email")
	//WebElement Email;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	/*@FindBy(id="days")
	WebElement Days;
	@FindBy(id="months")
	WebElement Month;
	@FindBy(id="years")
	WebElement Year;*/
	@FindBy(id="newsletter")
	WebElement Checkbox;
	
	@FindBy(id="submitAccount")
	WebElement Register;
	
	
	
	// Action 
	
	public void selectgender() {
		gender.click();
	}
	
	public void Firstname(String Fname) {
		Firstname.sendKeys(Fname);
	}
	public void Lastname(String Lname) {
		Lastname.sendKeys(Lname);
	}
	public void Password(String pass) {
		password.sendKeys(pass);
	}
	/*public void Enterdays(String days) {
		Select sc=new Select(Days);
		sc.selectByVisibleText(days);
	}
	public void EnterMonth(String month) {
		Select sc1=new Select(Month);
		sc1.selectByVisibleText(month);
	}
	public void Enteryear(String year) {
		Select sc2=new Select(Year);
		sc2.selectByVisibleText(year);}*/
	
	public void checkbox() {
		Checkbox.click();
	}
	public void Register() {
		Register.click();
	}
	
	
}
