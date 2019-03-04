package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeMethod
	public void applicationlaunch()
	{
		System.out.println(" Gmail Application Navigation and logIn");
	}
	
	@Test(priority=1)
	public void SentMail()
	{
		System.out.println(" Gmail Application  SentMail functionality Testing  ");
	}
	
	@Test(priority=0)
	public void inbox()
	{
		System.out.println("Gmail Application  inBox functionality Testing ");
	}
	
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println(" Gmail Application  composeMail functionality Testing  ");
	}

	@AfterMethod
	public void applicationClose()
	{
		System.out.println(" Gmail application Close");
	}

}
