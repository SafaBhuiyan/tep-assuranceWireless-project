package com.assurencewireless.coverageMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LifeLineServiceTest {
	
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("//www.assurancewireless.com");
	}
	
	@Test
	public void lifeLineService_WhatisLiceLine() {
		String title = driver.getTitle();
		System.out.println("The Title is "+ title);
		
	}
	
	@AfterTest
	public void tesrDown() {
		driver.quit();
	}

}
