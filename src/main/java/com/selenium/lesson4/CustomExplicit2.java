package com.selenium.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomExplicit2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_3.html");
		
		try{
			driver.findElement(By.id("runTestButton")).click();
			Boolean isVisible = new WebDriverWait(driver, 5).until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver d){
					return d.findElement(By.id("runTestButton")).isDisplayed();
				}
			});
			if(isVisible)
				System.out.println("button was invisible");
			else
				System.out.println("snap, something went wrong");
		}
		finally{
			driver.quit();
		}

	}

}
