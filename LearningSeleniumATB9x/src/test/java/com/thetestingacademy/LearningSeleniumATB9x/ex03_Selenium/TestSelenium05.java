package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestSelenium05 {
		
			@Description(" ")
			@Test
			public void test_selenium() {

				WebDriver driver = new ChromeDriver();
				driver.get("https://google.com");
				
				
				System.out.println("URL->>>"+driver.getCurrentUrl());
				System.out.println("Title->>>"+driver.getTitle());
				//System.out.println("Page Source"+driver.getPageSource());
				
				driver.manage().window().fullscreen();
				driver.manage().window().maximize();
		        driver.manage().window().minimize();
		        driver.manage().window().maximize();
			}
}