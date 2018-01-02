package com.walmart.page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;

public class SearchedItemPage extends defineDriver {
	//WebDriver driver;
	
	public SearchedItemPage(WebDriver driver) {
		super(driver);
	}
	public String getSearchedItemPageTitle()
	    {
		    return driver.getTitle();
	    }
	public AddToCartPage clickAddToCart() throws InterruptedException
	{
	 driver.findElement(walmartBy.getBy("css-SearchItem-AddToCart-Button")).click();
	 Thread.sleep(5000);
		return new AddToCartPage(driver);
	}
}
