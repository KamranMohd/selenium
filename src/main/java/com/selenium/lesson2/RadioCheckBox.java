package com.selenium.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_D-1.html");

		WebElement radioButton = driver.findElement(By.cssSelector("input[value='masters']"));
		if (radioButton.isDisplayed() && radioButton.isEnabled()) {
			System.out.println("radio button is enabled and displayed");
			if (!radioButton.isSelected())
				radioButton.click();
			if (radioButton.isSelected())
				System.out.println("it worked!! radio button was selected");
			else
				System.out.println("something went wrong");
		} else
			System.out.println("something went wrong!!");

		WebElement checkbox = driver.findElement(By.cssSelector("input[value='receiveEmails']"));
		if (checkbox.isDisplayed() && checkbox.isEnabled()) {
			System.out.println("checkbox is both enabled and displayed");
			if (!checkbox.isSelected())
				checkbox.click();
			if (checkbox.isSelected()) {
				System.out.println("it worked. the checkbox was selected. clearing it now");
				checkbox.click();
			}
			else
				System.out.println("something went wrong. checkbox was not selected");
		} else
			System.out.println("checkbox is either not enabled or displayed");

		Thread.sleep(2000);
		driver.quit();

	}

}
