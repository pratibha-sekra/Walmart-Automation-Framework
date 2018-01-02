package com.walmart.test;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import com.walmart.base.BaseTest;
import com.walmart.page.AddToCartPage;
import com.walmart.page.HomePage;
import com.walmart.page.SearchResultPage;
import com.walmart.page.SearchedItemPage;

public class SearchedItemPageTest extends BaseTest {
	@Test
	public void addToCartTest() throws InterruptedException
	{
		HomePage hm= new HomePage(driver);
		SearchResultPage srp= hm.clickSearchButton();
		SearchedItemPage sip= srp.clickFirstSearchedIteam();
		AddToCartPage acp= sip.clickAddToCart();
		assertEquals("HP Stream 14\" Laptop, Windows 10 Home, Office 365 Personal 1-year included, Intel Celeron N3060 Processor, 4GB RAM, 32GB eMMC Storage",acp.getAddToCartItemText());
	}

}
