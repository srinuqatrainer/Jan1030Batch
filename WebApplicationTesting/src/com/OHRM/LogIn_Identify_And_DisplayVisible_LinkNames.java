package com.OHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn_Identify_And_DisplayVisible_LinkNames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		String userName="admin";
		String password="password";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <input name="txtUsername" id="txtUsername" type="text">
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		
		// <input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		driver.findElement(By.id("btnLogin")).click();
		
		String expectedText="Welcome";
		System.out.println("The expected Text after logIn is : "+expectedText);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		WebElement actual_WelcomeAdminText=driver.findElement(By.id("welcome"));
		String actual_LogInWelcomeAdminText=actual_WelcomeAdminText.getText();
		
		System.out.println("The actual text after logIn is : "+actual_LogInWelcomeAdminText);
		
		if(actual_LogInWelcomeAdminText.contains(expectedText))
		{
			System.out.println("LogIN Successfull - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
		}
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println("The total number of links on the WebPage are : "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
			String linkName=links.get(i).getText();
			System.out.println(linkName);
			}
		}
		
		actual_WelcomeAdminText.click();
		
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		// <a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		// Explicit wait
		Thread.sleep(10000);
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		

		driver.quit();
	}

}
