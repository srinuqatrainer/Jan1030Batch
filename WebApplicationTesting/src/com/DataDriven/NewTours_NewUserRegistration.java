package com.DataDriven;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration extends BaseTest
{
	// <a href="mercuryregister.php">REGISTER</a>
	
	@Test(priority=0)
	public void register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=1)
	public void aNewuserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Srinu");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("784548787");
		driver.findElement(By.id("userName")).sendKeys("Srinu@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("HiTech");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("sriniiiii");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="sriniiiii";
		System.out.println(" The expected UserName is : "+expected_UserName);
		
		// get the xpath of the registered User Text
		//
		String actual_RegisteredUserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(" The Registed UserName is : "+actual_RegisteredUserName);
		
		if(actual_RegisteredUserName.contains(expected_UserName))
		{
			System.out.println("User Registed Successfully - PASS");
		}
		else
		{
			System.out.println("User Registration Failed - FAIL");
		}
	}
	

}
