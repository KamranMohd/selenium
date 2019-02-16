package com.selenium.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//	Set path to the chrome driver if it is 
		//	not in the same project path
		// 	String chromeDriverPath = "/Users/kamran/Documents/EclipseWorkspace/chromedriver";
		//	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.quit();
	}
}
