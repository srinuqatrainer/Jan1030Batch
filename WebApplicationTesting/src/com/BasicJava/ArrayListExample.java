package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args)
	{
		
		List<Object>a = new ArrayList<>();
		
		a.add("Selenium");
		a.add("LoadRunner");
		
		
		for(int p=0;p<a.size();p++)
		{
			System.out.println(a.get(p));
		}

	}

}
