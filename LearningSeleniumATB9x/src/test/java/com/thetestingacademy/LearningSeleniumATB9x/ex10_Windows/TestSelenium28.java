package com.thetestingacademy.LearningSeleniumATB9x.ex10_Windows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Description;

import java.time.Duration;
import java.util.List;
import java.util.Set;

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


public class TestSelenium28 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
    			
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	options.addArguments("--guest");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
    
    @Test
    @Description("Window Handles Complex Scenario")
	public  void test_windowHandlesComplex() throws Exception {		
				
				    	String parentWindowHandle = driver.getWindowHandle();
				        System.out.println("Parent -> " + parentWindowHandle);
				
				        List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));
				
				        Actions actions  = new Actions(driver);
				        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();
				
				        Thread.sleep(13000);
				
				        Set<String> allHandles = driver.getWindowHandles();
				        System.out.println("All Window Handles: " + allHandles);
				
				
				        for(String handle: allHandles){
				            if(!handle.equals(parentWindowHandle)){
				                driver.switchTo().window(handle);
				                driver.switchTo().frame("heatmap-iframe");
				
				                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
				                clickmap.click();
				            }
				        }
		        //System.out.println("Test Passed");
		        
		}
	  @AfterTest
	    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
	  	}
}