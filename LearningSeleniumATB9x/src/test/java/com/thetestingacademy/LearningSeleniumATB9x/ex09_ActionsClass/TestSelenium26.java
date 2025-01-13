package com.thetestingacademy.LearningSeleniumATB9x.ex09_ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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


public class TestSelenium26 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://www.spicejet.com/");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    }
    
    @Test
	public  void test_spicejet() throws Exception {		
				
    	
    				WebElement source = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
				
			    	// move to element
			        // click
			        // sendkeys - BLR
    				//build().perform();
			    	
			    	Actions act = new Actions(driver);
			    	
			    	act
			    		 .moveToElement(source)
			    		 .click()
			    		 .sendKeys("BLR")
			    		 .build().perform();
			    
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