package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
// <a class="gb_Ue gb_Ba gb_Tb" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=
//		true&amp;continue=https://www.google.com/" target="_top">Sign in</a>
		
		//driver.findElement(By.id("gb_70")).click();
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		// WebElement  is an interface in Selenium WebDriver
		WebElement signIn=driver.findElement(By.partialLinkText("Sign"));
		// since an element is found and saved in a Variable - it should be declared as WebElement
		signIn.click();

	}

}
