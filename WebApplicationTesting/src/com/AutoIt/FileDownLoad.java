package com.AutoIt;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileDownLoad {
	WebDriver driver = null;
	String url="https://www.seleniumhq.org/download/";
	
	@BeforeTest
	public void setUp()
	{
	driver = new FirefoxDriver();
	driver.get(url);
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void fileDownload() throws IOException
	{
		driver.findElement(By.xpath("//*[@id='mainContent']/p[3]/a")).click();
		
		java.lang.Runtime.getRuntime().exec("./AutoITScripts/FileDownload.exe");
	}

}
