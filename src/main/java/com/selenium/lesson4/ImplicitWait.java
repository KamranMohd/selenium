package com.selenium.lesson4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/activity_5_A-1.html");
		WebElement info = null;
		// Set implicit wait for 5 secods
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		try {
			info = driver.findElement(By.id("lesson"));
			System.out.println("initial text : " + info.getText());
			
			driver.findElement(By.id("runTestButton")).click();
			info = driver.findElement(By.id("lesson"));
			System.out.println("text after clicking the button : " + info.getText());

			driver.navigate().refresh();
			// This should through StaleElementException,
			System.out.println(info.getText());
		} catch (StaleElementReferenceException e) {
			System.out.println("Stale element exception is caught. Resetting the element");
			info = driver.findElement(By.id("lesson"));
			System.out.println("text after refreshing the page : " + info.getText());
		} finally {
			driver.quit();
		}
	}
}
