package com.DynamicXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffMail_FullNameElementAutomation {

	public static void main(String[] args) {
		
		WebDriver driver=null;
	String url="https://register.rediff.com/register/register.php?FormName=user_details";
		
		 driver = new FirefoxDriver();
		 driver.get(url);
		 
		 // name="name70cb8977" - property of Full Name Element
		 // name="name65a67048"
		 // the Property of Full Name is dynamically changing when the browser is refreshed
		 // it need to be handled using dynamic Xpath Creation
		 
		// driver.findElement(By.name("name70cb8977")).sendKeys("Srini");
		  driver.findElement(By.xpath("//*[starts-with(@name,'name')]")).sendKeys("Srini");
		 
		 
		 
	}

}
