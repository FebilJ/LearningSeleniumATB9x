package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestSelenium08 {
		
			@Description("open url")
			@Test
			public void test_selenium() {
				
				   WebDriver driver = new FirefoxDriver();
			        driver.get("https://google.com");
				
			        driver.manage().window().maximize();
			        
			      //Use Navigation method
			        driver.navigate().to("https://bing.com");
			        driver.navigate().back();
			        driver.navigate().forward();
			        driver.navigate().refresh();
			}
}