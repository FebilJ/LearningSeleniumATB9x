package com.thetestingacademy.LearningSeleniumATB9x.ex09_ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSelenium25 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
    			
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	options.addArguments("--guest");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://awesomeqa.com/practice.html");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
    
    @Test
	public  void test_svg() throws Exception {		
				
				WebElement firstnameTxtBox = driver.findElement(By.xpath("//input[@name='firstname']"));
				
				Actions act = new Actions(driver);
				
				act.keyDown(Keys.SHIFT) //press shift key
					  .sendKeys(firstnameTxtBox,"the test academy") //start typing
					  .keyUp(Keys.SHIFT).build().perform(); //release the shift key
				
				Thread.sleep(5000);
				
		        System.out.println("Test Passed");
		        
		}
	  @AfterTest
	    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
	  	}
}