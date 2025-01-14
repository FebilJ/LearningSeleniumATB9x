package com.thetestingacademy.LearningSeleniumATB9x.ex10_Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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


public class TestSelenium29 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://the-internet.herokuapp.com/window");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
    
    @Test
	public  void test_windowHandles() throws Exception {		
					
		    	String parentWindow = driver.getWindowHandle();
		
		        driver.findElement(By.linkText("Click Here")).click();
		
		        Set<String> windowHandles = driver.getWindowHandles();
		        System.out.println("Window Handles: " + windowHandles);
		
		
		        for(String handle : windowHandles){
		            driver.switchTo().window(handle);
		            if(driver.getPageSource().contains("New Window"))
		            {
		                System.out.println("Test Passed");
		                break;
		            }
		        }
	    	 	      
			    //Thread.sleep(5000);
		       System.out.println("Test Passed");
		}
	  @AfterTest
	    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
	  	}
}