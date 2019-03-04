package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 {
	
	@Test(priority=0)
	public void applicationLaunch()
	{
		System.out.println(" Gmail Application Launch ");
	}
	
	@Test(priority=1)
	public void logIn()
	{
		System.out.println(" Gmail Application  logIn functionality Testing  ");
	}
	
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("Gmail Application  inBox functionality Testing ");
	}
	
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println(" Gmail Application  composeMail functionality Testing  ");
	}

}
