package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element 
		WebElement country=driver.findElement(By.name("country"));
		
		Select selection = new Select(country);
		
//selection.selectByVisibleText("INDIA"); //provide the text of the Optional value to select
		//selection.selectByIndex(6); // indexing of the dropDown optional values starts with 0
		selection.selectByValue("8"); // identify the value number given to the Element
		
				

	}

}
