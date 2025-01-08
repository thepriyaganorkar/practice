package com.Mystore.test;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Mystore.pages.AddressPage;
import com.Mystore.pages.Indexpage;
import com.Mystore.pages.MyAccountPage;
import com.Mystore.pages.OrderConfirmationPage;
import com.Mystore.pages.OrderPaymentPage;
import com.Mystore.pages.OrderShippingPage;
import com.Mystore.pages.OrderSummaryPage;
import com.Mystore.pages.ProductPage;
import com.Mystore.pages.SearchResultPage;

public class TC_VerifySearchProduct extends BaseClass{

	@Test
	public void VerifySearchProduct()
	{ 
		
		String searchkey="Dresses";
		//1  click on sign In
		Indexpage pg=new Indexpage(driver);
		pg.clickonSignIn();
		
		//2 Login
		MyAccountPage pg1=new MyAccountPage(driver);
		//Entermail.clear();
		pg1.Entermail("kuchu123@gmail.com");
		//pg1.EnterPassword.clear();
		pg1.EnterPassword("kuch@1234");
		//pg1.Clickonvalidation();
		pg1.SubmitAccount();
		
		//3 Search product
	    SearchResultPage sc=new SearchResultPage(driver);
	    sc.entershirtname(searchkey);
	    sc.Clicksearch();
	    //sc.getsearchproductname();
	    sc.ClickonMore();
	    
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //String productname= sc.getsearchproductname();
	     //System.out.println(productname);
         /*if(productname.contains(searchkey)) {
        	 Assert.assertTrue(true);
        	 System.out.println("Success");
         }	 
         else {
        	 try {
				captureScreenShot(driver,"VerifySearchProduct");
				//Assert.assertTrue(false);
				System.out.println("fail");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
         }*/
	    
	    //4 fill all product details
	    ProductPage prodpg=new ProductPage(driver);
	    prodpg.selectcolour();
	    prodpg.Enterquantity("2");
	    prodpg.SelectSize1("M");
	    prodpg.clickonAddToCart();
	    prodpg.ClickonProceed();
	    
	    
	    //5 Click on proceed to check on Order Summary Page
	    OrderSummaryPage orderpage=new OrderSummaryPage(driver);
	    orderpage.clickProceed2();
	    
	    //6 Click on proceed to check on Order Summary Page Addreess Page
	    AddressPage add=new AddressPage(driver);
	    add.Clickoncheckout();
	    
	    //7 Shipping page
	    
	    OrderShippingPage sg=new OrderShippingPage(driver);
	    sg.clickcheckboxhipping();
	    sg.clickProceedshipping();
	    
	    //8 Payment option 
	    OrderPaymentPage pay=new OrderPaymentPage(driver);
	    pay.clickpaycheck();
	    
	    //Order Confirmation
	    OrderConfirmationPage ordercon=new OrderConfirmationPage(driver);
	    ordercon.clickonConfirmOrder();
	    
	     String Successmessage=ordercon.getConfirmationMessage();
	     System.out.println(Successmessage);
	     
	    if(Successmessage.equals("Your order on My Shop is complete.")){
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    	
	}
}
