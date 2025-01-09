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

public class TestSelenium21 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestSelenium21 testObject = new  TestSelenium21();
		testObject.test_webTables();
	}
	
	@Test(groups = "QA")
	@Description("Test Case Description")
	public  void test_webTables() throws Exception {
		
				ChromeOptions Options = new ChromeOptions();
				Options.addArguments("-start-maximized");
				
				WebDriver driver = new ChromeDriver(Options);
				driver.get("https://awesomeqa.com/webtable.html");
				
				//Xpath -->//table[@id='customers']/tbody/tr[2]/td[1]
				
				String first_part = "//table[@id=\'customers\']/tbody/tr[";
				String Second_part = "]/td[";
			    String thrid_part = "]";
			    
			    int row = driver.findElements(By.xpath("//table[@id=\'customers\']/tbody/tr")).size();
			    int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
			    
			    
			    for(int i = 2; i <= row; i++) {
			    	for(int j=1; j<=col; j++) {
			    		String dynamic_path = first_part+i+Second_part+j+thrid_part;
			    		//System.out.println(dynamic_path);
			    		
			    		String data = driver.findElement(By.xpath(dynamic_path)).getText();
			    		//System.out.println(data);
			    		
			    		if(data.contains("Helen Bennett")) {
			    			
			    			//String country_path = dynamic_path+"/following-sibling::td";
			    			String country_text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]")).getText();
			    			//String country_text = driver.findElement(By.xpath(country_path)).getText();
			    			
			    			System.out.println("------------------------------------");
			    			System.out.println("Helen Bennett is in " +country_text);
			    		}
			    	}
			    }
		        Thread.sleep(3000);
		        driver.quit();
		        
		        System.out.println("Test Passed");
	}
}