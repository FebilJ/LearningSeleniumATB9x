package com.thetestingacademy.LearningSeleniumATB9x.ex08_SVGElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
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


public class TestSelenium23 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
		        driver = new ChromeDriver(options);
		        driver.get("https://www.flipkart.com/");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }
    
    @Test
	public  void test_svg() throws Exception {		
				
				WebElement usernameTxtBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
				usernameTxtBox.sendKeys("Fossil");
				
				List<WebElement> svg = driver.findElements(By.xpath("//*[local-name()='svg']"));
				svg.get(0).click();
				
		        System.out.println("Test Passed");
		}
	  @AfterTest
	    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
	  	}
}