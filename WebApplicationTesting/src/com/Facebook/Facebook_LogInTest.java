package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		/*
<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">

 locator - id
 Selector - email
		 */
		
		driver.findElement(By.id("email")).sendKeys("Srini");
		
		/*
		 	<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">

locator - id
selector - pass
		 */
		
		driver.findElement(By.id("pass")).sendKeys("hello");
		
		/*
		 <label class="uiButton uiButtonConfirm" id="loginbutton" 
		 */
		
		driver.findElement(By.id("loginbutton")).click();
		

		driver.quit();
	}

}
