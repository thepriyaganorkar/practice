package com.Mystore.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Mystore.pages.Accountcreationdetails;
import com.Mystore.pages.Indexpage;
import com.Mystore.pages.MyAccountPage;
import com.Mystore.pages.SearchResultPage;
import com.Mystore.pages.VerifyAccount;
import com.Mystore.pages.VerifyLogOut;
import com.Mystore.utilities.ReadExcelFile;

public class TC_MyAccountPageTestDriven extends BaseClass{
	@Test(enabled=false)
	public void VerifyregistrationAndLogin(){
		
		
		//logger.info("url opened");
		
		Indexpage pg=new Indexpage(driver);
		pg.clickonSignIn();
		MyAccountPage pg1=new MyAccountPage(driver);
		pg1.CreateAccount("pihu6677@gmail.com");
		pg1.SubmitAccount();
		//logger.info("accounr created");
		Accountcreationdetails obj=new Accountcreationdetails(driver);
		obj.selectgender();
		obj.Firstname("Pihu");
		obj.Lastname("Ganort");
		obj.Password("fishhh@7654");
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
	
	@Test()
	
public void Verifylogin() throws IOException {
		Indexpage pg=new Indexpage(driver);
		pg.clickonSignIn();
		MyAccountPage pg1=new MyAccountPage(driver);
		//Entermail.clear();
		pg1.Entermail("kuchu123@gmail.com");
		//pg1.EnterPassword.clear();
		pg1.EnterPassword("kuch@1234");
		//pg1.Clickonvalidation();
		pg1.SubmitAccount();
		//captureScreenShot(driver, "Verifylogin");
		//Assert.assertTrue(false);
		VerifyLogOut vg=new VerifyLogOut(driver);
	    vg.clicksignout();
	    
	    
	    //SearchResultPage sc=new SearchResultPage(driver);
	    //sc.entershirtname(searchkey);
	    //sc.Clicksearch();
	    }
	
	@DataProvider(name = "LoginDataProvider")

	public String[][] LoginDataProvider()
	{
		//System.out.println(System.getProperty("user.dir"));
		String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";


		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
	

		String data[][]=new String[ttlRows][ttlColumns];

		for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"LoginTestData", i,j);
			}

		}
		return data;
}}
		

	


