package com.MouseHoverOpeation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_LogIn_PIM_MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
				
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement pim=driver.findElement(By.linkText("PIM"));
		
		Actions act = new Actions(driver);
		// performing mouseHover operation on PIM element - using actions class object using
		// perform method
		act.moveToElement(pim).perform();;
		
		// automating AddEmployee Element - which is an hidden element
		WebElement addEmployee=driver.findElement(By.linkText("Add Employee"));
		addEmployee.click();
	}
}
