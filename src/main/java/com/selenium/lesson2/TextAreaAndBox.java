package com.selenium.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAreaAndBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_D-1.html");

		WebElement textArea = driver.findElement(By.id("aboutYourself"));

		if (textArea.isDisplayed() && textArea.isEnabled()) {
			System.out.println("Text area is disabled and enabled");
			if (textArea.getText().equals("")) {
				System.out.println("text area is empty. entering text");
				textArea.sendKeys("My name is Mohd Kamran");
			} else
				System.out.println("text area is already filled with text");

		}
		Thread.sleep(2000);
		driver.quit();
	}
}