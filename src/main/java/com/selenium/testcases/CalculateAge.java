package com.selenium.testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.pageobjects.AgeCalucationPage;

public class CalculateAge {

	public static void main(String[] args) {
		AgeCalucationPage ageCalculator = new AgeCalucationPage(new ChromeDriver());

		ageCalculator.open();
		ageCalculator.calculate("4", "June", "1992");

		if (ageCalculator.getAge().equals("26"))
			System.out.println("age was calulcated correctly!!");
		else
			System.out.println("snap!! something went wrong");

		System.out.println("zodiac sign : " + ageCalculator.getZodiacSign());
		ageCalculator.close();

	}

}
