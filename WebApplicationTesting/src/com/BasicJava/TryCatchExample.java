package com.BasicJava;

public class TryCatchExample {

	public static void main(String[] args)
	{
		try
		{
			int a=10;
			int b=0;
			int c;
			
			c=a/b;
			System.out.println("The value of c is : "+c);
		}
		catch(Exception e)
		{
			System.out.println("Cannot perform the operation");
			System.out.println(e);
		}

	}

}
