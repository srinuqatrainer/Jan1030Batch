package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
		
		// Array size is fixed
		// Array can save only similer dataType values
		// Memory wastage if not assiged with a value in the index of an array
		int x[] = new int[3];
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		
	/*	System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]); */
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(x[i]);
		}

	}

}
