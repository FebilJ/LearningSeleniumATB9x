package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestSelenium07 {
		
			@Description("open url")
			@Test
			public void test_selenium() throws Exception {
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://katalon-demo-cura.herokuapp.com/");
				
				driver.manage().window().maximize();
				
				if(driver.getPageSource().contains("CURA Healthcare Service")) {
					System.out.println("CURA Healthcare Service is visible");
		            Assert.assertTrue(true);
				}else {
		            throw new Exception("CURA Healthcare Service is not visible");
				}
			}
}