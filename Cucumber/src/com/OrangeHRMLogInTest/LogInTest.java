package com.OrangeHRMLogInTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest {
	
	WebDriver driver = null;
	String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	//String userName="admin";
	//String password="password";
	
		@Given("^Open FireFox browser and navigate to OrangeHRM application$")
		public void Open_FireFox_browser_and_navigate_to_OrangeHRM_application()
		{
			driver = new FirefoxDriver();
			driver.get(url);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	/*	@When("^User enters valid UserName and Password and click on LogIn button$")
		public void User_enters_valid_UserName_and_Password_and_click_on_LogIn_button() 
		{
			// <input name="txtUsername" id="txtUsername" type="text">
			
			driver.findElement(By.id("txtUsername")).sendKeys(userName);
			
			// <input name="txtPassword" id="txtPassword" type="password">
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			
			// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			
			driver.findElement(By.id("btnLogin")).click();
		}*/
		
		
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on LogIn button$")
		public void User_enters_valid_and_and_click_on_LogIn_button
	                                                  (String UserName, String Password) 
		{
			// <input name="txtUsername" id="txtUsername" type="text">
			
						driver.findElement(By.id("txtUsername")).sendKeys(UserName);
						
		// <input name="txtPassword" id="txtPassword" type="password">
						driver.findElement(By.name("txtPassword")).sendKeys(Password);
						
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
						
						driver.findElement(By.id("btnLogin")).click();
			
		}

@Then("^User should be able to successfully logIn to the application and close the browser$")
public void User_should_be_able_to_successfully_logIn_to_the_application_and_close_the_browser() throws IOException 
		{
		
			try{
				String expected_text="Welcome Admin";
		System.out.println("The expected text is :"+expected_text);
		
		// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		String actual_Text=driver.findElement(By.id("welcome")).getText();
		System.out.println("The actual text is : "+actual_Text);
		
		if(actual_Text.contains(expected_text))
		{
			System.out.println("Successfully logIn - PASS");
		}
		
	}
		catch(Exception e)
		{
	if(driver.findElement(By.id("spanMessage")).getText().equals("Invalid credentials"))
			{
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenShot, new File("./ScreenShot/LogIn.png"));
				
				System.out.println("LogIn Failed - FAIL");
				driver.quit();
			}
		}
		driver.quit();
	}

		}


