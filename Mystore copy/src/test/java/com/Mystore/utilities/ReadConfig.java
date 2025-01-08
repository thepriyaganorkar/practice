package com.Mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	
String path="C:\\Users\\Akhilesh Ganorkar\\eclipse-workspacem1\\Mystore\\Configuration\\config.properties";

public  ReadConfig() 
{
	properties=new Properties();
	try {
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
   public String getBaseurl()
   {
	   String value=properties.getProperty("url");
	   if(value!=null)
		   return value;
	   else
		   throw new RuntimeException("url not specified");
   }
   
   public String getBrowser()
   {
	   String value=properties.getProperty("Browser");
	   if(value!=null)
		   return value;
	   else
		   throw new RuntimeException("url not specified");
   }
   }

