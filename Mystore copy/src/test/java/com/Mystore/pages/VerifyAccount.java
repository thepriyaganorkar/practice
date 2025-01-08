package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyAccount {

	WebDriver driver;

	public VerifyAccount (WebDriver rdriver) {

		driver=rdriver;
		PageFactory.initElements(rdriver, this);	
	}

	@FindBy(xpath="//p[@class='alert alert-success']")//p[@class='alert alert-success']
	WebElement verifymsg;

	public String getusername() {
		String text=verifymsg.getText();
		return text;

	}

}
