package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		/*
	
<a href="mercuryregister.php">REGISTER</a>

 a - anchor Tag

 attribute - href (will have reference url address)

 Type of Element is - link

 locator - linkText
 Selector - REGISTER
		 */
		driver.findElement(By.linkText("REGISTER")).click();
		
		System.out.println(driver.getTitle());
	}

}
