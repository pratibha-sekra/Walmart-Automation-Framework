package com.walmart.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

public class walmartBy {
	static Properties locatorsProp= null;
	private static Log logger= null;
	public static void loadProperties(String fileName){
		locatorsProp= new Properties();
		try {
			locatorsProp.load(new FileInputStream(System.getProperty("user.dir")+"//resources//"+fileName));
		} catch (FileNotFoundException e) {
			logger.error("File not found- please give correct file details");
		
		} catch (IOException e) {
			logger.error("Issue reading the given config file");
			
		}	
	}
	public static By getBy(String key){
		By by=null;
		String value= locatorsProp.getProperty(key);
		if(key.startsWith("id")){
			by= By.id(value);
		}else if(key.startsWith("css")){
			by= By.cssSelector(value);
		}else if(key.startsWith("xpath")){
			by= By.xpath(value);
		}else if(key.startsWith("linktext")){
			by= By.linkText(value);
		}else if(key.startsWith("partiallink")){
			by= By.partialLinkText(value);
		}else if(key.startsWith("tagname")){
			by= By.tagName(value);
		}else if(key.startsWith("class")){
			by= By.className(value);
		}else if(key.startsWith("name")){
			by= By.name(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		return by;
		
	}

}
