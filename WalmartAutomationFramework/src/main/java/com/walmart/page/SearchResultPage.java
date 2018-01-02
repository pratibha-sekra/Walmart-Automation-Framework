package com.walmart.page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;

//import com.wbl.base.BaseTest;

public class SearchResultPage extends defineDriver{
	//WebDriver driver;
	String SearchedIteamText;
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	public String getSearchResultPageTitle()
	{
		return driver.getTitle();
	}
	public String getSearchedItemText()
	{
		return SearchedIteamText;
	}
	public SearchedItemPage clickFirstSearchedIteam(){
		WebElement searchedIteam= driver.findElement(walmartBy.getBy("css-SearchResult-FirstSearchedItem"));
		System.out.println(searchedIteam.getText());
		SearchedIteamText= searchedIteam.getText();
		searchedIteam.click();
		return new SearchedItemPage(driver);
	}
	
}
