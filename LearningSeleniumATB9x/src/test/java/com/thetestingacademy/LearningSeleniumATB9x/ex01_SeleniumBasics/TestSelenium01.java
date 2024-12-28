package com.thetestingacademy.LearningSeleniumATB9x.ex01_SeleniumBasics;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium01 {
		
	@Description("Open the App.vwo.com and Get the title")
		@Test
		public void test_Selenium() {
			
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://app.vwo.com/#/login");
			System.out.println(driver.getTitle());
		}
}