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


public class TestSelenium20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestSelenium20 testObject = new  TestSelenium20();
		testObject.test_katalon_login();
	}
	
	public  void test_katalon_login() throws Exception {
		
				ChromeOptions Options = new ChromeOptions();
				Options.addArguments("-start-maximized");
				
				WebDriver driver = new ChromeDriver(Options);
				driver.get("https://katalon-demo-cura.herokuapp.com/");
				
				WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
				make_appointment_btn.click();
				
				Thread.sleep(2000);
				
				List <WebElement> username = driver.findElements(By.xpath("//input[@placeholder='Username']"));
				username.get(1).sendKeys("John Doe");
				
				List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
		        password_input_box.get(1).sendKeys("ThisIsNotAPassword");
		
		        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
		        login_input_box.click();
		
		        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
		        
		        Thread.sleep(3000);
		        driver.quit();
		        
		        System.out.println("Test Passed");
	}
}