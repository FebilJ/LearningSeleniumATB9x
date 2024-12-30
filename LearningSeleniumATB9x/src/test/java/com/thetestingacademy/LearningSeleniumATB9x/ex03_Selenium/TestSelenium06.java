package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestSelenium06 {
		
			@Description(" ")
			@Test
			public void test_selenium() {

				WebDriver driver = new ChromeDriver();
				driver.get("https://google.com");
				
				Assert.assertEquals(driver.getTitle(), "Google");
			}
}