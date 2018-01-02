package com.walmart.pageFlow;

import org.openqa.selenium.WebDriver;

import com.walmart.page.HomePage;

public class homeToSignIn  {
	 
	public  static void NavigateToSigninPage(WebDriver driver){
		HomePage hm= new HomePage(driver);
		//hm.navigateToHomePage();
		hm.clickSignin();	
	}

}
