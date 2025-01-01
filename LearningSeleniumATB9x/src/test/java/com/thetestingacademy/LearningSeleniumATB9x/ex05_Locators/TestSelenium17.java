package com.thetestingacademy.LearningSeleniumATB9x.ex05_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


// Locator Imports
import org.openqa.selenium.By;
// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.qameta.allure.Description;

		//Rough Logic
		// 1. Find Start a free Trial

public class TestSelenium17 {
	
				public static void main (String arg[]) throws Exception {
					test_negative_vwo_login();
				}
				
				@Description("Find Start a free trial")
				public static  void test_negative_vwo_login() throws Exception {
					
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--start-maximized");
					
//					ChromeOptions options = new ChromeOptions();
//					options.addArguments("start-maximized");
					
					WebDriver driver = new ChromeDriver(chromeOptions);
					driver.get("https://app.vwo.com");
					
					// 1. Find Start a free Trial
				
					//<a 
					//href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage" 
					//class="text-link" 
					//data-qa="bericafeqo">Start a free trial</a>
					
					//By Link Text
					//WebElement a_tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
					//a_tag_free_trial.click();
					
					//By Partial Text
					WebElement a_tag_free_trial = driver.findElement(By.partialLinkText("Start"));
					a_tag_free_trial.click();
					
					Thread.sleep(5000);
					driver.quit();
					System.out.println("Test Passed");
			}
}
