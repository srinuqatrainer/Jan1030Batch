package com.MouseHoverOpeation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIN_YourOrders {

	public static void main(String[] args) {


		WebDriver driver = null;
		String url="http://amazon.in";
		
		driver = new FirefoxDriver();
		// Maximize the Browser
		driver.manage().window().maximize();
		
		driver.get(url);
		
		// Hello signIn element property
		// id="nav-link-yourAccount"
		
		WebElement helloSingIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(helloSingIn).perform();;
		
		driver.findElement(By.linkText("Your Orders")).click();
		

	}

}
