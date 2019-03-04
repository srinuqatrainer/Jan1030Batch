package com.BasicJava;

public class ChildClass extends ParentClass
{

	public void test3()
	{
		System.out.println(" Test3 method executed successfully ");
	}
	
	
	public static void main(String[] args)
	{
		ChildClass c = new ChildClass();
		c.test3();
		
		c.test1();
		c.test2();

	}

}
