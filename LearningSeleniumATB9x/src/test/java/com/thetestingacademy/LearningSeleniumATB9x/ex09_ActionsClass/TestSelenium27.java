package com.thetestingacademy.LearningSeleniumATB9x.ex09_ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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


public class TestSelenium27 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://www.makemytrip.com/");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    }
    
    @Test
	public  void test_mmt() throws Exception {		
					
    				//Modal Xpath
    	 			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
    	 			
    	 			driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
    	 			
    	 			 WebElement fromCity = driver.findElement(By.id("fromCity"));
    	 			 
    	 			// move to element
 			        // click
 			        // sendkeys - BLR
     				//build().perform();
    	 			 
    	 	        Actions actions = new Actions(driver);
    	 	        actions.moveToElement(fromCity).click().sendKeys("del").build().perform();
    	 			
    	 	       Thread.sleep(3000);

    	 	        actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
			    
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