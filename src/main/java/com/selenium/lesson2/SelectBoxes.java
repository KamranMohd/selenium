package com.selenium.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_3/activity_3_D-1.html");

		Select singleOption = new Select(driver.findElement(By.id("monthOfBirth")));
		if(!singleOption.isMultiple() && singleOption.getOptions().size()==13){
			System.out.println("date of birth is single select option and holds 13 options");
			singleOption.selectByVisibleText("June");
			if(singleOption.getFirstSelectedOption().equals("June"))
				System.out.println("June is my month of birth");
			else
				System.out.println("something went wrong");
		}
		else
			System.out.println("either is not single select or does not have exactly 13 options");
		
		Select multiSelect = new Select(driver.findElement(By.name("hobbies")));
		if(multiSelect.isMultiple() && multiSelect.getOptions().size()==4){
			System.out.println("dropdown is displayed and enabnled on the screen");
			multiSelect.selectByVisibleText("Reading");
			multiSelect.selectByVisibleText("Traveling");
			multiSelect.selectByVisibleText("Sports");
			System.out.println("currently selected options : " + multiSelect.getAllSelectedOptions().size());
			multiSelect.deselectByVisibleText("Traveling");
			System.out.println("currently selected options after removing one item: " + multiSelect.getAllSelectedOptions().size());
			multiSelect.deselectAll();
			System.out.println("currently selected options : " + multiSelect.getAllSelectedOptions().size());
		}
		else
			System.out.println("dropdown is either not multiple or the options are not exactly 13");
				
		Thread.sleep(2000);
		driver.quit();
	}

}
