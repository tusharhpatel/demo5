package Practiclademo.Practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 {
	
WebDriver driver ;
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tusha\\Desktop\\New folder\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();}
	
	@Test
	public void menuclick(){
		driver.findElement(By.id("navbtn_tutorials")).click();}
	 @Test
	 public void logovalid(){
		 driver.findElement(By.className("w3schools-logo")).isDisplayed();
	 }

     @AfterMethod
    	 public void tearDown(){
    	 driver.quit();

}
}