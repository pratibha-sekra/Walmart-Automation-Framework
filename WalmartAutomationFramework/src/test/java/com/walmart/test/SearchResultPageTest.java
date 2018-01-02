package com.walmart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.page.HomePage;
import com.walmart.page.SearchResultPage;
import com.walmart.page.SearchedItemPage;

public class SearchResultPageTest extends BaseTest{
	
	@Test
	public void clickFirstSearchedIteamTest() throws InterruptedException
	{
		HomePage hm= new HomePage(driver);
		SearchResultPage srp= hm.clickSearchButton();
		SearchedItemPage sip= srp.clickFirstSearchedIteam();
        Assert.assertTrue(sip.getSearchedItemPageTitle().contains(srp.getSearchedItemText()));
		
	}

}
