package Practiclademo.Practical;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Demo1 {
	WebDriver driver ;
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		}
	
	@Test(priority=2,groups="title")
	public void Validate(){
		String Title =driver.getTitle();
		System.out.println("Title1="+Title);
		
		
		}
	@Test(priority=1,groups="logo")
	public void validateyahoologo(){
		boolean Logo=driver.findElement(By.id("uh-logo")).isDisplayed();}
	    
	
	@Test(priority=3,groups="singin")
	public void SignIn(){
		driver.findElement(By.id("uh-signin")).click();}
	
	@Test(priority=4,groups="Login")
	public void EnterId(){
		driver.findElement(By.id("login-username")).sendKeys("tusharh_patel@yahoo.com");
	}
	@Test(priority=5,groups="Login")
	public void EnterFirstName(){
		driver.findElement(By.id("login-signin")).click();}
	
	
	//@Test(priority=6,groups="Login")
	//public void LastName(){
		//driver.findElement(By.name("lastName")).sendKeys("Patel");}
	
	//@Test(priority=7,groups="Login")
	//public void CreatId(){
		//driver.findElement(By.name("yid")).sendKeys("anjali.tech197837");}
	
	//@Test(priority=8,groups="Login")
	//public void  Password(){
		//driver.findElement(By.name("password")).sendKeys("Anjali1234$");}
	@Test(priority=9,groups="Login")
	//public void CountryCode(){
		//Select action= new Select(driver.findElement(By.name("shortCountryCode")));
		//action.selectByIndex(4);}
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("Bye");	
	}	
	}
	
	

