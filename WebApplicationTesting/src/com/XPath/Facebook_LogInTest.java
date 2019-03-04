package com.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="http://facebook.com";
		String userName="admin";
		String password="password";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
// <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">

		// xpath based on external property
// driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys(userName);
		
		// xpath based on locator of WebDriver
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(userName);
		
// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		//xpath based on multiple properties
driver.findElement(By.xpath("//*[@class='inputtext' and @data-testid='royal_pass']"))
                                                                        .sendKeys(password);
		
		
	}

}
