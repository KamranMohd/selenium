package com.selenium.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_04.html");
		
		driver.switchTo().frame("title");
		if(driver.getPageSource().contains("Frame Title"))
			System.out.println("Inside Title Frame");
		else
			System.out.println("incorrect frame selected");
		
		//	Switch back to main screen or the default content
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("info");
		if(driver.getPageSource().contains("Frame Info"))
			System.out.println("Inside Info Frame");
		else
			System.out.println("incorrect frame selected");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("twitter");
		
		try{
			//	Handle Iframe
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			driver.findElement(By.id("follow-button")).click();
			Thread.sleep(2000);
		}
		finally{
			driver.quit();
		}
	}

}
