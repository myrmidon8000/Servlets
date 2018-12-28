package com.lti.misc;

public class ExceptionHandling {
public static void main(String args[])
{
	try {
		//int z=50/0;
		String s=null;
		String s1="10";
		int i=Integer.parseInt(s1);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("error arithmatic");
	}
	
	catch(NullPointerException ne)
	{
		System.out.println("Nulll error");
		
	}
	
	catch(NumberFormatException ae)
	{
		System.out.println("cannot extract the data");
	}
	
	/*	catch(Exception e)
	{
			System.out.println("Errpr ");
	}
	*/
}
}

