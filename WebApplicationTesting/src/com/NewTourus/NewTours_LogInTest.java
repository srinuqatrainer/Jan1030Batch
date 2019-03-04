package com.NewTourus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <input type="text" name="userName" size="10">
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		driver.findElement(By.name("password")).sendKeys("tutoial");
		
// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=f80f17dcc1ac17c29f0e557aaa302f55"
//		width="58" height="17" alt="Sign-In" border="0">		
		
		
		driver.findElement(By.name("login")).click();
		
		
		String expectedTitle="Find";
		System.out.println("The expected title is : "+expectedTitle);

		String actualTitle=driver.getTitle();
		System.out.println("THe actual title is : "+actualTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
		}
		
		driver.quit();
	}

}
