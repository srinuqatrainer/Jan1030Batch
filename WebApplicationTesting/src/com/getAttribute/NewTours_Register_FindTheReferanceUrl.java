package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_FindTheReferanceUrl {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
String register_ReferanceUrl=driver.findElement(By.linkText("REGISTER"))
                                                                      .getAttribute("href");
	
System.out.println("The referance URL of Regisgter element is  : "+register_ReferanceUrl);


driver.findElement(By.linkText("REGISTER")).click();

String actualUrl=driver.getCurrentUrl();
System.out.println("The actual Url of Register WebPage is  "+actualUrl);

if(actualUrl.equals(register_ReferanceUrl))
{
	System.out.println(" Successfully navigated to Register WebPage");
}
else
{
	System.out.println(" Failed to naviagete to Register WebPage");
}


		
		driver.quit();

	}

}
