package com.KeyBoardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="http://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("Srini");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();;
		
		act.sendKeys("ello").perform();;
		
		act.sendKeys(Keys.ENTER).perform();
		
		
			

	}

}
