package com.NewTours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelComeMercuryTours {
	
	// Object Repository
	
	// <a href="mercurysignon.php">SIGN-ON</a>
	
	//WebElement signOn=driver.findElement(By.linkText("SIGN-ON"));
	//singOn.click();
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void logIn(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
	}

}
