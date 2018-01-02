package com.walmart.pageFlow;

import org.openqa.selenium.WebDriver;

import com.walmart.page.HomePage;

public class HomeToCreateAccount {
	public  static void NavigateToCreateAccountPage(WebDriver driver){
		HomePage hm= new HomePage(driver);
		//hm.navigateToHomePage();
		hm.clickCreateAccount();	
	}

}
