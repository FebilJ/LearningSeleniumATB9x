package com.thetestingacademy.LearningSeleniumATB9x.ex07_WebTables;

import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class TestSelenium22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestSelenium22 testObject = new  TestSelenium22();
		testObject.test_webTables();
	}
	
	@Test(groups = "QA")
	@Description("Test Case Description")
	public  void test_webTables() throws Exception {
		
				ChromeOptions Options = new ChromeOptions();
				Options.addArguments("-start-maximized");
				
				WebDriver driver = new ChromeDriver(Options);
				driver.get("https://awesomeqa.com/webtable1.html");
				
				//Xpath -->//table[@id='customers']/tbody/tr[2]/td[1]
				
				WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));


		        // rows and columns
		        List<WebElement> rows_tables = table.findElements(By.tagName("tr"));
		        
		        for( int i=0; i <rows_tables.size();i++){
		            List<WebElement> col = rows_tables.get(i).findElements(By.tagName("td"));
		            for(WebElement c: col){
		                System.out.println(c.getText());
		            }

			    }
		        Thread.sleep(3000);
		        driver.quit();
		        
		        System.out.println("Test Passed");
	}
}