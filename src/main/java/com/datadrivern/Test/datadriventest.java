package com.datadrivern.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Utility.Xls_Reader;

public class datadriventest {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	      Xls_Reader  reader = new Xls_Reader("C:\\Users\\tusha\\workspace\\Practical\\src\\main\\java\\com\\Testdata\\RegTestData.xlsx");
		
		   
		
		
		
		
		
		
	}


