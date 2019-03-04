package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		// class="border_grey1" - current location element property
		
		WebElement currentLoation=driver.findElement(By.className("border_grey1"));
		
		/*List<WebElement>currentLocationNames=currentLoation.findElements(By.tagName("option"));
		
		System.out.println(currentLocationNames.size());
		
		for(int k=0;k<currentLocationNames.size();k++)
		{
			System.out.println(currentLocationNames.get(k).getText());
		}*/
		
		Select selection = new Select(currentLoation);
		selection.selectByVisibleText("Bengaluru / Bangalore");
		selection.selectByIndex(1);
		
		// id="id_industry" - property of Industry Element
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select sel = new Select(industry);
		sel.selectByIndex(1);
		sel.selectByValue("4");
		sel.selectByVisibleText("Banking/ Financial Services");
		
		sel.deselectByValue("5");
		sel.deselectByIndex(1);
		sel.deselectByVisibleText("Banking/ Financial Services");
		
		sel.deselectAll();
				
		
		
		
		

		//driver.quit();
	}

}
