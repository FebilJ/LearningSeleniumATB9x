package com.thetestingacademy.LearningSeleniumATB9x.ex05_Locators;

import org.openqa.selenium.WebDriver;

// Locator Imports
import org.openqa.selenium.By;

// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;

import io.qameta.allure.Description;

public class TestSelenium15 {
	
	@Description("By FullXpath")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		}catch (Exception e){
			System.out.println("Error Encountered--->>"+ e.getMessage());
			//e.getStackTrace();
		}finally{
			Thread.sleep(5000);
			driver.quit();
		}
	}
}