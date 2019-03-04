package com.BasicJava;



public class SubChildClass extends ChildClass
{

	public void test4()
	{
		System.out.println(" Test4 exectuted Successfully");
	}
	
	
	public static void main(String []args)
	{
		SubChildClass sc = new SubChildClass();
		sc.test4();
		
		sc.test1();
		sc.test2();
	}
}
