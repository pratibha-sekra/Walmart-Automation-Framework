package com.walmart.page;

import org.openqa.selenium.WebDriver;

import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;

public class SigninPage extends defineDriver{
	public SigninPage(WebDriver driver) {
		super(driver);
	}
	public String signInForm(String userName, String passWord) throws InterruptedException{
		driver.findElement(walmartBy.getBy("css-Login-email")).clear();
		driver.findElement(walmartBy.getBy("css-Login-email")).sendKeys(userName);
		driver.findElement(walmartBy.getBy("css-Login-password")).clear();
		driver.findElement(walmartBy.getBy("css-Login-password")).sendKeys(passWord);
		driver.findElement(walmartBy.getBy("css-Login-submit")).click();
		Thread.sleep(5000);
		return driver.getTitle();
		}
		
	}


