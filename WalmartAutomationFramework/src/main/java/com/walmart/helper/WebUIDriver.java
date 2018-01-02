package com.walmart.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebUIDriver {
	static String browserName;
	
	public static String loadPropertiesFile(String fileName) throws FileNotFoundException, IOException{
		Properties prop= new Properties();
		prop.load(new FileInputStream(System.getProperty("user.dir")+"//resources//"+fileName));
		browserName= prop.getProperty("browser");
		//System.out.println(browserName);
		return browserName;	
	}
	public static WebDriver getDriver(){
		 WebDriver driver=null;
		switch(browserName){
		case("chrome"):
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//resources//chromedriver.exe");
		driver= new ChromeDriver();
		break;
		case("firefox"):
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//resources//geckodriver.exe");
			driver= new FirefoxDriver();
			break;
//		case("safari"):
//			System.setProperty("webdriver.safari.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
//			driver= new safariDriver();
//			break;
//		case("ie"):
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
//			driver= new ChromeDriver();
//			break;
//		case("htmlunit"):
//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Resources//chromedriver.exe");
//			driver= new ChromeDriver();
//			break;
		}
		return driver;
	}

}
