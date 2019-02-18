package com.selenium.advanced.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	protected void setUp(@Optional("chrome") String browser){
		//	Setup the browser
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun=true)
	protected void tearDown(){
		System.out.println("[INFO]: Closing the browser");
		driver.quit();
	}
}
