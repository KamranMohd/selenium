package com.selenium.problems;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File screenshot = sc.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("screenshots/youtube.png"));
		
		driver.quit();

	}

}
