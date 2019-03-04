package com.BasicJava;

public class StringCompare {

	public static void main(String[] args)
	{
		String a="Hello";
		String b="Hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}
		
		System.out.println("********************************");
		
		String x="Hello";
		String y="hello";
		
		if(x.equals(y))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}
		
		System.out.println("####################################");
		
		String p="Hello";
		String q=" Hello";
		
		if(p.equals(q))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}

		System.out.println("----------------------------------------");
		
		String k="Hello";
		String l="hello";
		
		if(k.equalsIgnoreCase(l))
		{
			System.out.println(" Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		
		String i="Hello";
		String j="ello";
		
		if(j.contains(i))
		{
			System.out.println(" i contains j ");
		}
		else
		{
			System.out.println(" i not existing in j");
		}
		
		System.out.println("===================================");
		
		String o="LiveTech";
		int r=o.length();
		
		System.out.println("The length of the String is : "+r);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		if(i.length()>j.length())
		{
			System.out.println("lenght of i string greater than j");
		}
		else
		{
			System.out.println("lenght of i string less than j");
		}
		
	}

}
