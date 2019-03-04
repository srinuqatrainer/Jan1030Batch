package com.BasicJava;

public class ObjectArray {

	public static void main(String[] args)
	{
		
		Object a[] = new Object[3];
		
		a[0] = 10;
		a[1] = "Srini";
		a[2] = 10.1233;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
