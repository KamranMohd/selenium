package com.selenium.lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomExplicit1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_5/exercise_5_1.html");
		
		try{
			WebElement element = new WebDriverWait(driver, 5).until(new ExpectedCondition<WebElement> (){
				public WebElement apply(WebDriver d){
					return d.findElement(By.id("runTestButton"));
				}
			});
			if(element.getAttribute("id").contains("runTestButton"))
				System.out.println("element found");
			else
				System.out.println("snap, something went wrong!!");
		}
		finally{
			driver.quit();
		}

	}

}
