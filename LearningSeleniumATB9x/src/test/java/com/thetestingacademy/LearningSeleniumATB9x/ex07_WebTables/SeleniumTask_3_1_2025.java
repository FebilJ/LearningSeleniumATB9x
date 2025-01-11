package com.thetestingacademy.LearningSeleniumATB9x.ex07_WebTables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

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


public class SeleniumTask_3_1_2025 {
		 	WebDriver driver;
		    WebDriverWait wait;
		    ChromeOptions options;

    @BeforeTest
	public void setupBrowser() {
	        	options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        
		        driver = new ChromeDriver(options);
		        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
		        
		        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    }
    
    @Test
	public  void test_orange_HRM_login() throws Exception {		
				
				WebElement usernameTxtBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
				usernameTxtBox.sendKeys("admin");

				WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@name='password']"));
				passwordTxtBox.sendKeys("Hacker@4321");
				
				WebElement LoginBtn = driver.findElement(By.xpath("//button[text()=' Login ']"));
				LoginBtn.click();
				
				// Wait for table to load
			    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-card']")));
			    
				List<WebElement> rows = driver.findElements(By.xpath("//div[@class='oxd-table-card']"));
				System.out.println("Total rows :" + rows.size());
				
				for(WebElement r : rows) {
						List<WebElement> cols = r.findElements(By.xpath("//div[@class='oxd-table-card']//div[@class='oxd-table-cell oxd-padding-cell']"));
						System.out.println("Total Columns :" + cols.size());
						for(WebElement c : cols) {
					System.out.println(c.getText() + " | ");
				}
				System.out.println(); // New line after each row
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