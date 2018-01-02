package com.walmart.page;

import org.openqa.selenium.WebDriver;

import com.walmart.base.defineDriver;

public class DepartmentResultPage extends defineDriver{
   //WebDriver driver;
	
   public DepartmentResultPage(WebDriver driver) {
		super(driver);
	}
	public String getDepartmentResultPageTitle()
	{
		return driver.getTitle();
	}
}
