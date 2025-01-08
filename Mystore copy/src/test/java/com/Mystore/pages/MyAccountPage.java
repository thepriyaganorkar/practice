package com.Mystore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver1;
	public MyAccountPage(WebDriver driver)
	
		{
			driver1=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(id="email_create")
		WebElement createAccount;
		
		@FindBy(id="SubmitCreate")
		WebElement submitAccount;
		
		@FindBy(xpath="//input[@id='email']")
		WebElement enteremail;
		
		@FindBy(xpath="//input[@id='passwd']")
		WebElement enterpassword;
		@FindBy(id="newsletter")
		WebElement clickcheckbox;
		
		@FindBy(id="SubmitLogin")
		WebElement ClickOnSubmit;
		
		
		public void ClickonSignIn(){
  			
  			submitAccount.click();
  		}
		public void CreateAccount(String emailid){
			
			createAccount.sendKeys(emailid);
			
		}
         public void Entermail(String Email){
        	 enteremail.clear();
			enteremail.sendKeys(Email);
		}

        public void EnterPassword(String Password){
          enterpassword.clear();
      	  enterpassword.sendKeys(Password);
		}
        public void Clickonvalidation(){
			
        	clickcheckbox.click();
  		}
          
          public void SubmitAccount(){
  			
        	  ClickOnSubmit.click();
  		}
	
	
	}

