package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LogInTest {
		
	@Parameters("Browser")
	
	@Test
	public void logIn(String browser) throws MalformedURLException
	{
		// Nodes
		System.out.println("The browser is : "+browser);
		
		DesiredCapabilities cap=null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
						
			}
		
		// Hub 
		
		RemoteWebDriver driver = new 
				            RemoteWebDriver(new URL("http://192.168.0.6:4444/wd/hub"),cap);
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		driver.get(url);
		
		// <input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		// <input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.id("btnLogin")).click();
		
		String expectedTitle="OrangeHRM";
		System.out.println("The expected title is : "+expectedTitle);
		
		String actualTitle=driver.getTitle();
		System.out.println("the actual title is : "+actualTitle);

		if(actualTitle.equals(expectedTitle))
		{
			System.out.println(" LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn FAILED - FAIL");
		}
		
		driver.quit();
		
	}
	
	

}
