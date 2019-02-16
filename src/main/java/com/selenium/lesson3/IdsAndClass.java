package com.selenium.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdsAndClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_4/exercise_4_3.html");
		
		WebElement input = driver.findElement(By.cssSelector("input#inputName"));
		
		System.out.println("name using id : " + input.getAttribute("placeholder"));
		
		WebElement address = driver.findElement(By.cssSelector("input#inputName"));
		
		System.out.println("address using id : " + address.getAttribute("placeholder"));
		
		input = driver.findElement(By.cssSelector("input.enter-name"));
		
		System.out.println("name using class : " + input.getAttribute("placeholder"));
		
		address = driver.findElement(By.cssSelector("input.enter-address"));
		
		System.out.println("address using class : " + address.getAttribute("placeholder"));
		
		System.out.println("name using attribute : " + driver.findElement(By.cssSelector("input[placeholder='Name']")).getAttribute("id"));
		
		System.out.println("address using attribute : " + driver.findElement(By.cssSelector("input[placeholder='Address']")).getAttribute("id"));
		
		System.out.println("name using attribute which starts with Na : " + driver.findElement(By.cssSelector("input[placeholder^='Na']")).getAttribute("id"));
		
		System.out.println("address using attribute which ends with ess: " + driver.findElement(By.cssSelector("input[placeholder$='ess']")).getAttribute("id"));

		System.out.println("address using attribute which contains with am: " + driver.findElement(By.cssSelector("input[placeholder*='am']")).getAttribute("id"));
		
		System.out.println("Button with register id : " + driver.findElement(By.cssSelector("button#register")).getText());
		
		System.out.println("Cancel button inside the div tag : " + driver.findElement(By.cssSelector("div #cancelButton")).getText());
		
		driver.quit();
		
	}

}
