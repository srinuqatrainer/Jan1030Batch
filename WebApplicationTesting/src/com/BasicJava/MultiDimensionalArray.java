package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		String a[][] = new String[2][2];
		
		a[0][0] = "Manual Testing";
		a[0][1] = "Venkat Sir";
		
		a[1][0] = "Selenium";
		a[1][1] = "Srini" ;
		
	//	System.out.println("Srini");
	// System.out.println(a[0][1] );
		for(int i=0;i<a.length;i++) // goes to a particular Row
		{
			for(int j=0;j<a.length;j++) // goes to every Row of all the columns
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
