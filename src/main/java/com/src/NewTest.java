package com.src;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	@BeforeClass
	public void open()
	{
		System.setProperty("webdriver.gecko.driver","E:/softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void verifyText()
	{
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		
	}
	@AfterClass
	public void close()
	{
		driver.close();
		
	}
  @Test
  public void f() {
	  System.out.println("test1");
	  Assert.assertEquals(driver.getTitle(),"Google1");
	  
  }
}
