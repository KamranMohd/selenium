package com.selenium.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.selenium.pageobjects.AgeCalucationPage;

public class CalculateAgeSeleniumHub {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities(new ChromeOptions());
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.5:4444/wd/hub"),capabilities);
		
		AgeCalucationPage ageCalculator = new AgeCalucationPage(driver);

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
