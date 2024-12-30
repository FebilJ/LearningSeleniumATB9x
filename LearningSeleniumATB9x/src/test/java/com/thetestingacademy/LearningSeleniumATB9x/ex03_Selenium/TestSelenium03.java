package com.thetestingacademy.LearningSeleniumATB9x.ex03_Selenium;

import org.testng.annotations.Test;
import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSelenium03 {
		
			@Description(" ")
			@Test
			public void test_selenium01() {
				EdgeDriver driver = new EdgeDriver();
				driver.get("https://google.com");
				driver.manage().window().maximize();
			}
}