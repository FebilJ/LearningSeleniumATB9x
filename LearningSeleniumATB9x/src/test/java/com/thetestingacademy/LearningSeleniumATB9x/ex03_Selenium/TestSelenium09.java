package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestSelenium09 {
		
			@Description("open url")
			@Test
			public void test_selenium() throws InterruptedException {
				
				 WebDriver driver = new FirefoxDriver();
				    driver.get("https://google.com");

				    Thread.sleep(3000);
				    //driver.close(); it will close current tab and not the session and session != null
				    driver.quit();
				    // it will close all tab and session = null
			}
}