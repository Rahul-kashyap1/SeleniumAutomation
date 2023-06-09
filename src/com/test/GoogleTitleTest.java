package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class GoogleTitleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\browserDriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	
	@Test(priority = 1,groups = "Title")       
	public void GoogleTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
   Assert.assertEquals(title,"Google","title is not matched");
	
	}
	
	@Test
	public void GoogleLogoTest() {
	boolean b=	driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	Assert.assertTrue(b, "Image is not present");
//	Assert.assertEquals(b, true);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
