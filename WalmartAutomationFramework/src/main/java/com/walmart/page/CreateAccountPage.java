package com.walmart.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;

public class CreateAccountPage extends defineDriver {
    public CreateAccountPage(WebDriver driver) {
		super(driver);
	}
    
	public String CreateAccountForm(String firstName, String lastName,String email,String passWord) throws InterruptedException{
		driver.findElement(walmartBy.getBy("css-CreatAccount-firstName")).clear();
		driver.findElement(walmartBy.getBy("css-CreatAccount-firstName")).sendKeys(firstName);
		driver.findElement(walmartBy.getBy("css-CreatAccount-lastName")).clear();
		driver.findElement(walmartBy.getBy("css-CreatAccount-lastName")).sendKeys(lastName);
		driver.findElement(walmartBy.getBy("css-CreatAccount-email")).clear();
		driver.findElement(walmartBy.getBy("css-CreatAccount-email")).sendKeys(email);
		List<WebElement> passwordFields= driver.findElements(walmartBy.getBy("css-CreatAccount-password"));
		passwordFields.get(0).clear();
		passwordFields.get(0).sendKeys(passWord);
		//passwordFields.get(1).sendKeys(passWord);
		driver.findElement(walmartBy.getBy("css-CreatAccount-submit")).click();
		Thread.sleep(3000);
		return driver.getTitle();
		}

}
