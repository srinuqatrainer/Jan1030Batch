package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
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

	@AfterTest
	public void applicationClose()
	{
		System.out.println(" Gmail application Close");
	}

}
