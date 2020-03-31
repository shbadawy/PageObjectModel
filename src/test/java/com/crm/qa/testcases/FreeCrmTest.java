package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmTest {

	static WebDriver driver;
	static JavascriptExecutor js;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/home/shimaa/Selenuim jars/chromedriver");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.get("https://www.freecrm.com/index.html");
	}

	@Test
	public void freeCrmTitleTest() throws InterruptedException, IOException {
		String title = driver.getTitle();
		System.out.println("title is: " + title);
		getRunTimeInfoMessage("info", title);

		if (title.equals("Free CRM software in the cloud powers sales and customer serviceQQQQ")) {
			getRunTimeInfoMessage("info", "title is correct!! YAY!!!");
			Assert.assertTrue(true);
		} else {
			getRunTimeInfoMessage("error", "title is not correct!! BUG BUG BUG!!!");
			takeScreenshot("freecrmloginpage");
			Assert.assertTrue(false);
		}

	}

}
