package Practiclademo.Practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
	
WebDriver driver ;
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void search(){
		driver.findElement(By.id("uh-search-box")).sendKeys("gmail");}
	@Test
	public void Bellnotification(){
	boolean	b=driver.findElement(By.xpath("//button[@title='Notifications']")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
		public void tearDown(){
			driver.quit();
		}
	
	
	

}
