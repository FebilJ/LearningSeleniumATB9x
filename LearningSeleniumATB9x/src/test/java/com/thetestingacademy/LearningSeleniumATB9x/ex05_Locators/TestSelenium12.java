package com.thetestingacademy.LearningSeleniumATB9x.ex05_Locators;

import org.openqa.selenium.WebDriver;

// Locator Imports
import org.openqa.selenium.By;

// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Description;

public class TestSelenium12 {
	
	@Description("By ID")
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("hi febil"); 
	}
}