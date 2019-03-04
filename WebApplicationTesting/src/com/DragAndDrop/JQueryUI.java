package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JQueryUI {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;
		String url="https://jqueryui.com/droppable/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// Drag Me to my Target Element property
		//id="draggable"
		
		Thread.sleep(10000);
					
	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
	// identifying a particular frame of the WebPage in which we have Elements	
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement dragElement=driver.findElement(By.id("draggable"));
		
		// id="droppable"
		WebElement dropElement=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragElement, dropElement).perform();

		driver.switchTo().defaultContent();
	}

}
