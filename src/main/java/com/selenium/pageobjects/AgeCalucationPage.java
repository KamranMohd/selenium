package com.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgeCalucationPage {
	private WebDriver driver;
	final private String URL = "https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html";

	public AgeCalucationPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDayOfBirth() {
		return this.driver.findElement(By.id("dayOfBirth"));
	}

	public WebElement getMonthOfBirth() {
		return this.driver.findElement(By.id("monthOfBirth"));
	}

	public WebElement getYearOfBirth() {
		return this.driver.findElement(By.id("yearOfBirth"));
	}

	public WebElement getCalculateBtn() {
		return this.driver.findElement(By.id("calculate"));
	}

	public WebElement getAgeElement() {
		return this.driver.findElement(By.id("age"));
	}

	public WebElement getZodiacSignElement() {
		return this.driver.findElement(By.id("zodiacSign"));
	}

	public void calculate(String day, String month, String year) {
		this.getDayOfBirth().sendKeys(day);
		this.getMonthOfBirth().sendKeys(month);
		this.getYearOfBirth().sendKeys(year);
		this.getCalculateBtn().click();
	}

	public String getAge() {
		return getAgeElement().getText();
	}

	public String getZodiacSign() {
		return getZodiacSignElement().getText();
	}

	public void open() {
		this.driver.get(URL);
	}

	public void close() {
		this.driver.quit();
	}

}