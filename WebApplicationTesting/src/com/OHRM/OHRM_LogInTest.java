package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		driver = new FirefoxDriver();
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
