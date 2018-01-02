package com.walmart.page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;

public class AddToCartPage extends defineDriver {
	//WebDriver driver;
	String itemText;
	
	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

	public String getAddToCartItemText()
	{
		WebElement searchedIteam= driver.findElement(walmartBy.getBy("css-AddToCart-AddToCartItemText"));
		itemText=searchedIteam.getText();
		return itemText; 
	}
}
