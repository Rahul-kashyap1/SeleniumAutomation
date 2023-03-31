package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic {
/*
BeforeSuite
BeforeTest
BeforeClass
BeforeMethod
Test
AfterMethod
AfterClass
AfterTest
AfterSuite
 */
	@BeforeSuite
	public void setUp() {
		System.out.println("Set up the system property for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("Enter url");
	}
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	public void googleSearchTest() {
		System.out.println("Google search test");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close Browser");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterSuite
	public void generateAllReport() {
		System.out.println("Generating report");
	}
	
}
