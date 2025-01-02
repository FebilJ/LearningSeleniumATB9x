package com.thetestingacademy.LearningSeleniumATB9x.ex06_Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

// Locator Imports
import org.openqa.selenium.By;
// Browser-Specific Drivers
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class SeleniumTask_31 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SeleniumTask_31 testObject = new  SeleniumTask_31();
		testObject.test_idrive360_login();
	}
	
	public  void test_idrive360_login() throws Exception {
		
				ChromeOptions Options = new ChromeOptions();
				Options.addArguments("-start-maximized");
				
				WebDriver driver = new ChromeDriver(Options);
				driver.get("https://www.idrive360.com/enterprise/login");
				
				Thread.sleep(3000);
				WebElement usernameTxtBox = driver.findElement(By.xpath("//input[@id='username']"));
				usernameTxtBox.sendKeys("augtest_040823@idrive.com");
				
				WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@id='password']"));
				passwordTxtBox.sendKeys("123456");
				
				WebElement SignInBtn = driver.findElement(By.xpath("//button[@id='frm-btn']"));
				SignInBtn.click();
				
				Thread.sleep(10000);
				
				//WebElement VerfyTxt = driver.findElement(By.xpath("//h5[@class='id-card-title']"));
				WebElement VerfyTxt = driver.findElement(By.xpath("//h5[text()='Your free trial has expired']"));
				
		        Assert.assertEquals(VerfyTxt.getText(),"Your free trial has expired");
		        
		        Thread.sleep(3000);
		        driver.quit();
		        
		        System.out.println("Test Passed");
	}
}