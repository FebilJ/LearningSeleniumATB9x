package com.thetestingacademy.LearningSeleniumATB9x.ex04_Options;

import org.testng.annotations.Test;
import io.qameta.allure.Description;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class TestSelenium10 {
		
	@Description("Using Options to change setting")
		@Test
		public void test_Selenium() {
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--window-size=1080,720");  // Start in private browsing mode
			
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.get("https://google.com");
			
		}
}