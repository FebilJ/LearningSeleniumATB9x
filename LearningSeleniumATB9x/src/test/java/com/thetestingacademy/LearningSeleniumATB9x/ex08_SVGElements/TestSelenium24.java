package com.thetestingacademy.LearningSeleniumATB9x.ex08_SVGElements;

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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSelenium24 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://www.amcharts.com/svg-maps/?map=india");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    }
    
    @Test
	public  void test_advSvg() throws Exception {		
				
    			//cookie button
    			WebElement cookieBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value = 'I agree']")));
    			cookieBtn.click();
    			
    			//All State Paths
    			List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]//*[local-name()='path']"));
				
    			for (WebElement state:  states){
    	            System.out.println(state.getAttribute("aria-label"));
    	            if(state.getAttribute("aria-label").contains("Tripura")){
    	            	
    	                    state.click();
    	            }
    			}
		        System.out.println("Test Passed");
		}
	  @AfterTest
	    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
	  	}
}