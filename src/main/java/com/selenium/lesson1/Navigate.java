package com.selenium.lesson1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//	applying implicit wait to tell the driver to wait 
		// 	for some time before quiting with exception
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		try{
			System.out.println("Navigation to amazon India");
			driver.get("http://amazon.in");
			
			if(driver.getTitle().toLowerCase().contains("india"))
				System.out.println("Successfully navigated to amazon india");
			else
				System.out.println("navigated to incorrect site");
			
			//	Navigate back and then navigate to amazon.com
			driver.navigate().back();
			driver.get("http://amazon.com");
			if(driver.getTitle().toLowerCase().contains("online shopping"))
				System.out.println("Successfully navigated to amazon.com");
			else
				System.out.println("navigated to incorrect site");
			
		}
		finally{
			driver.quit();
		}
		
	}

}
