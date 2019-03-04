package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUUpload {
	
	WebDriver driver = null;
	String url="https://imgur.com/";
	
	@BeforeTest
	public void setUp()
	{
	driver = new FirefoxDriver();
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void fileUpload() throws IOException
	{
		//class="Button-label" - newPost element property
		driver.findElement(By.className("Button-label")).click();
		
		// class ="browse-btn" - property of element Browser
		driver.findElement(By.className("browse-btn")).click();
		
		// Right on the AutoIT Script -- select Compile the Scripts
		// The Script will be converted to .exe file(Application)
//.exe Script is called onto WebDriver to Perform the operations related to Window components
		
		// autoIt Script is executed
		java.lang.Runtime.getRuntime().exec("./AutoITScripts/FileUpload.exe");
		
		
		
	}
}
