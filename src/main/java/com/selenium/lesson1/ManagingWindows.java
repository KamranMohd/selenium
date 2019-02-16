package com.selenium.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_2/exercise02_concept_05.html");
		
		System.out.println("Title of the window is : " + driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		
		//	Switch to the window name TwitterWindow.
		//	To find the name of the window, type window.name in the console
		//	of the Developer Tools
		driver.switchTo().window("TwitterWindow");
		
		System.out.println("Title of the window : " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println("Title of the window is : " + driver.getTitle());
		
		driver.quit();
	}

}
