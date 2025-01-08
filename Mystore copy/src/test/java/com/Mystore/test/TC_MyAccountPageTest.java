package com.Mystore.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Mystore.pages.Accountcreationdetails;
import com.Mystore.pages.Indexpage;
import com.Mystore.pages.MyAccountPage;
import com.Mystore.pages.VerifyAccount;

public class TC_MyAccountPageTest extends BaseClass{
	@Test(enabled=false)
	public void VerifyregistrationAndLogin(){
		
		
		//logger.info("url opened");
		
		Indexpage pg=new Indexpage(driver);
		pg.clickonSignIn();
		MyAccountPage pg1=new MyAccountPage(driver);
		pg1.CreateAccount("priyaganorkar56@gmail.com");
		pg1.SubmitAccount();
		//logger.info("accounr created");
		Accountcreationdetails obj=new Accountcreationdetails(driver);
		obj.selectgender();
		obj.Firstname("Priya");
		obj.Lastname("G");
		obj.Password("pihu@123");
		/*obj.Enterdays("1");
		obj.EnterMonth("June");
		obj.Enteryear("1990");*/
		obj.checkbox();
		obj.Register();
		//logger.info("register created");
		
		VerifyAccount user=new VerifyAccount (driver);
		String verifymessg=user.getusername();
	    Assert.assertEquals("Your account has been created",verifymessg);
	}
	
	
	@Test
	
public void Verifylogin() throws IOException {
		Indexpage pg=new Indexpage(driver);
		pg.clickonSignIn();
		MyAccountPage pg1=new MyAccountPage(driver);
		
		pg1.Entermail("priyaganorkar56@gmail.com");
		pg1.EnterPassword("pihu@123");
		pg1.SubmitAccount();
		captureScreenShot(driver, "Verifylogin");
		//Assert.assertTrue(false);
	}
}
		
	


