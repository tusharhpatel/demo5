package com.datadriven.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HalfebayTest {
     WebDriver driver;
	
	@BeforeMethod
	public void SetUp(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	
	@DataProvider
	
		
	
	
	@Test
	public void halfebaypagetest(CharSequence FirstName, CharSequence LastName, CharSequence UserName, CharSequence Password, CharSequence Confirm ){
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys(FirstName);
		
		driver.findElement(By.id("lastName")).sendKeys(LastName);
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		
		driver.findElement(By.name("Passwd")).sendKeys(Password);
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys(Confirm);
		
		
	}
		
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}

