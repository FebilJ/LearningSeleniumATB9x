package com.thetestingacademy.LearningSeleniumATB9x.ex05_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.qameta.allure.Description;

		//Rough Logic
		 // 1. Find Make Appointment button
		 // 2. Find Input Text Box for Name
		 // 3. Find Input Text Box for Password
		 // 4. Find the Login Button & Click
		 // 5. Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment

public class SeleniumTask_30 {
	
				public static void main (String arg[]) throws Exception {
					test_negative_katalon_login();
				}
				@Description("https://katalon-demo-cura.herokuapp.com/")
				public static  void test_negative_katalon_login() throws Exception {
					
					ChromeOptions chromeOptions = new ChromeOptions();
					chromeOptions.addArguments("--start-maximized");
					
//					ChromeOptions options = new ChromeOptions();
//					options.addArguments("start-maximized");
					
					WebDriver driver = new ChromeDriver(chromeOptions);
					driver.get("https://katalon-demo-cura.herokuapp.com/");
					
				//1. Find Make Appointment button
				
					//<a 
					//id="btn-make-appointment" 
					//href="./profile.php#login" class="btn btn-dark btn-lg">
					//Make Appointment
					//</a>
					
					WebElement MakeApp = driver.findElement(By.id("btn-make-appointment"));
					MakeApp.click();
					
				// 2. Find Input Text Box for Name
					
					//<input type="text" 
					//class="form-control" 
					//id="txt-username" 
					//name="username" 
					//placeholder="Username" 
					//value="" autocomplete="off">
					
					WebElement NameBox = driver.findElement(By.name("username"));
					NameBox.sendKeys("John Doe");
					
				// 3. Find Input Text Box for Password
					
					//<input type="password" 
					//class="form-control" 
					//id="txt-password" 
					//name="password" 
					//placeholder="Password" 
					//value="" autocomplete="off">
					
					WebElement PassBox = driver.findElement(By.name("password"));
					PassBox.sendKeys("ThisIsNotAPassword");
					
				// 4. Find the Login Button & Click
					
					//<button 
					//id="btn-login" 
					//type="submit" 
					//class="btn btn-default">
					//Login
					//</button>
					
					WebElement Login = driver.findElement(By.id("btn-login"));
					Login.click();
					
					Thread.sleep(2000);
				 // 5. Verify the current URL == https://katalon-demo-cura.herokuapp.com/#appointment
					
					String currURL = driver.getCurrentUrl();
					Assert.assertEquals(currURL, "https://katalon-demo-cura.herokuapp.com/#appointment");
					
					Thread.sleep(3000);
					
					driver.quit();
					System.out.println("Test Passed");
			}
}
