package com.IsSelected;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_FindingTheStatus {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element 
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int countriesCount=countries.size();
		
		System.out.println("The total number of countries are : "+countriesCount);
		
		for(int k=0;k<countriesCount;k++)
		{
			String countryName=countries.get(k).getText();
			System.out.println("The name of the Country is : "+countryName);
			
			countries.get(k).click();
			
			if(countries.get(k).isSelected())
			{
				System.out.println(" ELement is active");
			}
			else
			{
				System.out.println("Element is InActive");
			}
			
		}
	driver.quit();

	}

}
