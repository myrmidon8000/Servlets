package com.lti.misc;

public class TestPerson {
public static void main(String args[])
{
	Person p1=new Person()
			{
		// Object creation...
		public void eats()
		{
			System.out.println("Eats");
		}
		public void sleeps()
		{
			System.out.println("Sleeps");
		}
		};
		
			p1.eats();
			p1.sleeps();
}
}