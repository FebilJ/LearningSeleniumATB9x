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
		// 1. Find the email inputbox and enter the email
		// 2. Find the password inputbox and enter the password
		// 3. Find the submit button and click on it.
		// 4. Find the invalid error message and verify.

public class TestSelenium16 {
	
				public static void main (String arg[]) throws Exception {
					test_negative_vwo_login();
				}
				@Description("APP VWO")
				public static  void test_negative_vwo_login() throws Exception {
					
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--start-maximized");
					
//					ChromeOptions options = new ChromeOptions();
//					options.addArguments("start-maximized");
					
					WebDriver driver = new ChromeDriver(chromeOptions);
					driver.get("https://app.vwo.com");
					
					// 1. Find the email inputbox and enter the email
				
					//<input type="email" 
					//class="text-input W(100%)" 
					//name="username" 
					//id="login-username" 
					//data-qa="hocewoqisi">
					
					WebElement emailInputBox = driver.findElement(By.id("login-username"));
					emailInputBox.sendKeys("admin@admin.com");
					
					// 2. Find the password inputbox and enter the password
					
					//<input type="password" 
					//class="text-input W(100%)" 
					//name="password" 
					//id="login-password" 
					//data-qa="jobodapuxe">
					
					WebElement passwordInputBox = driver.findElement(By.name("password"));
					passwordInputBox.sendKeys("admin");
					
					// 3. Find the submit button and click on it.
					
					//<button type="submit" 
					//id="js-login-btn" 
					//class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" 
					//onclick="login.login(event)" 
					//data-qa="sibequkica">
					//<span class="icon loader hidden" 
					//data-qa="zuyezasugu"></span>
					//<span data-qa="ezazsuguuy">Sign in</span>
				    //</button>
					
					WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
					buttonSubmit.click();
					
					Thread.sleep(3000);
					
					// 4. Find the invalid error message and verify.
					
					//<div 
					//class="notification-box-description" 
					//id="js-notification-box-msg" 
					//data-qa="rixawilomi">
					//Your email, password, IP address or location did not match</div>
					
					WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
					//WebElement error_message = driver.findElement(By.className("notification-box-description"));
					
					Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");
					
					Thread.sleep(5000);
					driver.quit();
					System.out.println("Test Passed");
			}
}
