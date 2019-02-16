package com.selenium.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_4/exercise_4_1.html");
		
		WebElement list = driver.findElement(By.className("list-group-item"));
		System.out.println("using class name " + list.getText());
		
		WebElement listByCss = driver.findElement(By.cssSelector("ul#list"));
		System.out.println("using css selectors " + listByCss.getText());
		
		System.out.println("first child : " + listByCss.findElement(By.cssSelector("li:first-child")).getText());
		
		System.out.println("last child : " + listByCss.findElement(By.cssSelector("li:last-child")).getText());
		
		System.out.println("nth child : " + listByCss.findElement(By.cssSelector("li:nth-child(2)")).getText());
		
		System.out.println("sibling of 2 child : " + listByCss.findElement(By.cssSelector("li:nth-child(2) + li")).getText());
		
		driver.quit();

	}

}
