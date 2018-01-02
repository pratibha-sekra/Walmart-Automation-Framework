package com.walmart.test;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walmart.base.BaseTest;
import com.walmart.page.DepartmentResultPage;
import com.walmart.page.HomePage;
import com.walmart.page.SearchResultPage;

public class HomePageTest extends BaseTest{
	HomePage hm;
	@BeforeMethod
	public void loadHomePage(){
		 hm= new HomePage(driver);
		 hm.navigateToHomePage();
	}
  @Test
  public void navLinksTest(){
	 int actual= hm.navLinks();
	assertEquals(6,actual);
	 
  }
  @Test
  public void clickSigninTest(){
	 String actual= hm.clickSignin();
	assertEquals("Login", actual);
  }
  @Test
  public void clickSearchButtonTest() throws InterruptedException{
	  SearchResultPage srp= hm.clickSearchButton();
	assertEquals("laptop - Walmart.com", srp.getSearchResultPageTitle());
  }
  @Test(dependsOnMethods="navLinksTest")
  public void clickCreateAccountTest(){
	 String actual= hm.clickCreateAccount();
	 assertEquals("Login", actual);
  }
  @Test
  public void mouseHoverDepartmentTest() throws InterruptedException
	{
		DepartmentResultPage drp= hm.mouseHoverDepartment();
		assertEquals("Tablet Accessories - Walmart.com",drp.getDepartmentResultPageTitle());
	   
	}

  
}
