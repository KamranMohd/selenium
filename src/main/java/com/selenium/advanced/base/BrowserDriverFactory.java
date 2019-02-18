package com.selenium.advanced.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserDriverFactory {
	private WebDriver driver;
	private String browser;
	
	public BrowserDriverFactory(String browser) {
		this.browser = browser;
	}
	
	public void setDriver(WebDriver driver){
		this.driver = driver;
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
	
	public WebDriver createDriver(){
		System.out.println("[INFO]: Opening the browser");
		switch(browser){
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			driver = new SafariDriver();
			break;
			
		default:
			System.out.printf("[INFO]: Invalid browser %s selected. Opening chrome instead", browser);
			driver = new ChromeDriver();
			break;
		}
		return this.getDriver();
	}
}
