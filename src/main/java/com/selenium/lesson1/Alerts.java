package com.selenium.lesson1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_03.html");

		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();

		System.out.println("confirmation alert should pop up");

		simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(2000);
		simpleAlert.accept();

		simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		simpleAlert.sendKeys("java");
		Thread.sleep(2000);
		simpleAlert.dismiss();
		
		if(driver.getTitle().toLowerCase().contains("java"))
			System.out.println("arrived at the right page");
		else
			System.out.println("arrived at incorrect page");
		driver.quit();

	}

}
