package com.selenium.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/activity_5_B-1.html");
		
		driver.findElement(By.id("runTestButton")).click();
		
		//	Set an explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("Explicit"));
		
		if(driver.getTitle().contains("Explicit12"))
			System.out.println("it worked!!");
		else
			System.out.println("Snap!! Something went wrong");
		
		driver.quit();

	}

}
