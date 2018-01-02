package com.walmart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.helper.ExcelDataRead;
import com.walmart.page.CreateAccountPage;
import com.walmart.page.HomePage;
import com.walmart.pageFlow.HomeToCreateAccount;
//import com.walmart.pageFlow.homeToLogin;


public class CreateAccountPageTest extends BaseTest {
	HomePage hm;
	CreateAccountPage cap;
	@BeforeClass
	public void loadCreateAccountPage(){
		cap=new CreateAccountPage(driver);
		HomeToCreateAccount.NavigateToCreateAccountPage(driver);		
	}
	@DataProvider(name="createAccount-data")
	public Object[][] loginData(){
		return ExcelDataRead.getExcelData("Account_data","AccountCreate_data.xlsx");
	}
	@Test(dataProvider="createAccount-data")
	public void CreateAccountFormTest(String firstName,String lastName, String email, String password,String result) throws InterruptedException{
		Assert.assertEquals(result,cap.CreateAccountForm(firstName,lastName, email, password));
		
	}

}
