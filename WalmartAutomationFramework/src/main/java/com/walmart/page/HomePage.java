package com.walmart.page;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.walmart.base.defineDriver;
import com.walmart.helper.walmartBy;
import com.walmart.page.DepartmentResultPage;
import com.walmart.page.SearchResultPage;

public class HomePage extends defineDriver {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void navigateToHomePage(){
		driver.get("https://www.walmart.com/");
	}

	public String clickSignin(){
		WebElement element= driver.findElement(walmartBy.getBy("css-Home-clickSignin"));
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();;
		WebDriverWait wait= new WebDriverWait(driver,20);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);                                                                
		wait.until(ExpectedConditions.visibilityOfElementLocated(walmartBy.getBy("css-Home-ClickSignin-list"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*[@id=\"header-GlobalAccountFlyout\"]/li[1]/div/div/a"))).click();
	return driver.getTitle();
	}
	public SearchResultPage clickSearchButton() throws InterruptedException
	{
		 driver.findElement(walmartBy.getBy("id-Home-Search")).sendKeys("laptop");
	     Thread.sleep(5000);
		 driver.findElement(walmartBy.getBy("css-Home-search-button")).click();
		 return new SearchResultPage(driver);
	}
	public int navLinks(){
		List<WebElement> link= driver.findElements(walmartBy.getBy("css-Home-Navlink"));
	    System.out.println("Navigation links on header :"+link.size()); 
		return link.size();
	}
	public String clickCreateAccount(){
		WebElement element= driver.findElement(walmartBy.getBy("css-Home-CreateAccount"));
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();;
		WebDriverWait wait= new WebDriverWait(driver,20);                                                                
		wait.until(ExpectedConditions.visibilityOfElementLocated(walmartBy.getBy("xpath-Home-createAccount-Button"))).click();
		return driver.getTitle();
	}
	public DepartmentResultPage mouseHoverDepartment() throws InterruptedException
	{
		WebElement department= driver.findElement(walmartBy.getBy("id-Home-mouseHoverDepartment"));
		Actions action= new Actions(driver);
		action.moveToElement(department).perform();
		Thread.sleep(5000);
		//mousrHover on Electronics & Office 
		department= driver.findElement(walmartBy.getBy("id-Home-mousrHoveronElectronics&Office"));
		action.moveToElement(department).perform();
		Thread.sleep(5000);
		//click of Accessories under iPad & Tablets
	    driver.findElement(walmartBy.getBy("css-Home-AccessoriesunderiPad&Tablets")).click();
		Thread.sleep(5000);
		return  new DepartmentResultPage(driver);

	}

}
