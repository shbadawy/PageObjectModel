package com.crm.qa.testcases;

import java.io.IOException;
import java.util.Collections;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import  org.openqa.selenium.chrome.ChromeDriver.options.Options;

//from selenium.webdriver.chrome.options import Options;

public class FreeCrmTest {

	WebDriver driver = null;
	static JavascriptExecutor js;
	
	@BeforeMethod
	public void setUp() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/home/shimaa/Selenuim jars/chromedriver");
		//*****************************************
		System.setProperty("webdriver.gecko.driver", "/home/shimaa/Selenuim jars/geckodriver");
		 driver = new FirefoxDriver();
		//*****************************************
	
		//js = (JavascriptExecutor) driver;
		driver.get("http://127.0.0.1:8000");
		
	}

	@Test
	public void freeCrmTitleTest() throws InterruptedException, IOException {
		//*************************************//
		Thread.sleep(2000);
		
		driver.findElement(By.id("fNumber")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.id("sNumber")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.id("menu")).sendKeys("+");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		//*************************************//
		Thread.sleep(2000);
		
		driver.findElement(By.id("fNumber")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.id("sNumber")).sendKeys("3057");
		Thread.sleep(1000);
		driver.findElement(By.id("menu")).sendKeys("-");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		//*************************************//
		Thread.sleep(2000);
		
		driver.findElement(By.id("fNumber")).sendKeys("13");
		Thread.sleep(1000);
		driver.findElement(By.id("sNumber")).sendKeys("152");
		Thread.sleep(1000);
		driver.findElement(By.id("menu")).sendKeys("*");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		//*************************************//
		Thread.sleep(2000);
		
		driver.findElement(By.id("fNumber")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.id("sNumber")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.id("menu")).sendKeys("/");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		driver.close();

		

	}

}
