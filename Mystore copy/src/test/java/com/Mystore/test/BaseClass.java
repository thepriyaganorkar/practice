package com.Mystore.test;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

//	public BaseClass() {
	ReadConfig configrad=new ReadConfig();
	String url=configrad.getBaseurl();
	String browser=configrad.getBrowser();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		  switch (browser.toLowerCase()) {
        case "chrome":
            // Set up ChromeDriver
            WebDriverManager.chromedriver().setup();  // Using WebDriverManager to set up ChromeDriver
            driver = new ChromeDriver();
            break;

        case "firefox":
            // Set up FirefoxDriver
            WebDriverManager.firefoxdriver().setup();  // Using WebDriverManager to set up FirefoxDriver
            driver = new FirefoxDriver();
            break;

        case "edge":
            // Set up EdgeDriver
            WebDriverManager.edgedriver().setup();  // Using WebDriverManager to set up EdgeDriver
            driver = new EdgeDriver();
            break;

        default:
            throw new WebDriverException("Browser not supported: " + browser);
    }
	

    // Implicit wait
		  driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
    //return driver;
    
    logger= LogManager.getLogger("Mystore");
    driver.get(url);
}
    
 //for logging
	
	
	/*@AfterClass
	public void Teardown() {
		
	driver.quit();
	}*/
	
	public void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("user.dir") + "//Screenshot//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
	}

