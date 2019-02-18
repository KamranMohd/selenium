package com.selenium.advanced.testcases;

import org.testng.annotations.Test;

import com.selenium.advanced.base.BaseTest;

public class LoginTest extends BaseTest{
	@Test
	public void loginTest(){
		driver.get("https://google.com");
		System.out.println("Page opened");
	}
}
