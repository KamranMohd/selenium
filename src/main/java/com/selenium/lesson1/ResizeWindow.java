package com.selenium.lesson1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		System.out.println("Current size of the window");
		System.out.println("width : " + driver.manage().window().getSize().getWidth() + ", height : "
				+ driver.manage().window().getSize().getHeight());
		Thread.sleep(2000);

		System.out.println("set the window size to 800 by 600");
		driver.manage().window().setSize(new Dimension(800, 600));
		Thread.sleep(2000);
		System.out.println("width : " + driver.manage().window().getSize().getWidth() + ", height : "
				+ driver.manage().window().getSize().getHeight());

		System.out.println("maximizing the window");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.quit();

	}
}