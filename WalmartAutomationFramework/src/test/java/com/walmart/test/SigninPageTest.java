package com.walmart.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.walmart.base.BaseTest;
import com.walmart.helper.ExcelDataRead;
//import com.wbl.page.HomePage;
import com.walmart.page.SigninPage;
import com.walmart.pageFlow.homeToSignIn;

public class SigninPageTest extends BaseTest {
	
	SigninPage sp;
	@BeforeClass
	public void loadSigninPage(){
		sp=new SigninPage(driver);
		homeToSignIn.NavigateToSigninPage(driver);
	}
	@DataProvider(name="signIn-data")
	public Object[][] signInData(){
		return ExcelDataRead.getExcelData("signindata","signin_data.xlsx");
	}
	@Test(dataProvider="signIn-data")
	public void signInTest(String userName, String password,String result) throws InterruptedException{
		//Assert.assertNotNull(sp.signInForm(userName, password));
		Assert.assertEquals(result,sp.signInForm(userName, password) );
		
	}
}
