package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void loginTest() {
		System.out.println("Login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")        //home page is depending on login page
	public void HomePageTest() {
		System.out.println("Home page test");
	}
	
	@Test
	public void SearchPageTest() {
		System.out.println("Search page test");
	}
	
}
