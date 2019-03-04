package com.HandlingAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APSRTC_CheckAvailability__CLick {

WebDriver driver = null;
	
	String url="https://apsrtconline.in/oprs-web/";
		
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	public void handlingAlert() throws InterruptedException
	{
		// id="searchBtn" - property of Check Availability button
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt=driver.switchTo().alert();
		
		// get the text of alert window
		
		String alertText=alt.getText();
		System.out.println(" The text of an alert window is : "+alertText);
		
		Thread.sleep(5000);
		
		// accept the alert - OK
		alt.accept();
		
		// cancel
		//alt.dismiss();
		
		// text / edit element
		//alt.sendKeys("hello");
		
		
	}
}
