package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium04 {
		
			@Description(" ")
			@Test
			public void test_selenium01() {

				WebDriver driver = new FirefoxDriver();
				driver.get("https://google.com");
				driver.manage().window().maximize();
			}
}