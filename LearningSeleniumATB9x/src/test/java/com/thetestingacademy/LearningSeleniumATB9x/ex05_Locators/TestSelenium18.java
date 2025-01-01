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
		// 1. Find the Input Text Box & enter random data
		//  2. Find the CheckBox & Click
		//  3. Find the submit button and click on it.
		//  4. Find the invalid error message and verify.

public class TestSelenium18 {
	
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
					driver.get("https://vwo.com/free-trial/");
					
				// 1. Find the Input Text Box & enter random data
				
					//<input 
					//class="W(100%) Py(14px) input-text invalid-input" 
					//placeholder="name@yourcompany.com" 
					//type="email" 
					//id="page-v1-step1-email" 
					//name="email" 
					//data-qa="page-su-step1-v1-email" 
					//required="" data-gtm-form-interact-field-id="1">
					
					WebElement InputBox = driver.findElement(By.id("page-v1-step1-email"));
					InputBox.sendKeys("Blah..blahblah");
					
				// 2. Find the CheckBox & Click
					
					//<input 
					//class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)" 
					//type="checkbox" 
					//name="gdpr_consent_checkbox" 
					//id="page-347cu-gdpr-consent-checkbox" 
					//value="true" 
					//data-qa="page-gdpr-consent-checkbox" 
					//data-gtm-form-interact-field-id="0">
					
					WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
					checkBox.click();
					
				// 3. Find the submit button and click on it.
					
					//<button type="submit" 
					//class="button W(100%) btn-modal-form-submit" 
					//data-qa="page-su-submit" value="">
					//Create a Free Trial Account
					//</button>
					
					List<WebElement> buttonSubmit = driver.findElements(By.tagName("button"));
					buttonSubmit.get(0).click();
					
					
					Thread.sleep(2000);
					
				// 4. Find the invalid error message and verify.
					
					//<div 
					//class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
					//The email address you entered is incorrect.
					//</div>
					
					WebElement error_message = driver.findElement(By.className("invalid-reason"));
					//WebElement error_message = driver.findElement(By.className("notification-box-description"));
					
					Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");
					
					Thread.sleep(3000);
					
					driver.quit();
					System.out.println("Test Passed");
			}
}
