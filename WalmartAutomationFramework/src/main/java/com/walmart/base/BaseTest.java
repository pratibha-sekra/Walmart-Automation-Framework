package com.walmart.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.walmart.helper.WebUIDriver;
import com.walmart.helper.walmartBy;

public class BaseTest {
	protected WebDriver driver;
	@BeforeSuite
	public void beforeSuite(){
		walmartBy.loadProperties("locators.properties");
		try {
			WebUIDriver.loadPropertiesFile("config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver= WebUIDriver.getDriver();
		driver.get("https://www.walmart.com/");
	}
	
	  @AfterSuite
		public void afterSuite(){
			
			driver.close();
		}
}
