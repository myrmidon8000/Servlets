package com.lti.banking;

public class StringDemo {
public static void main(String args[])
{
	StringBuilder sb1=new StringBuilder();
	sb1.append("This is a new string");
	System.out.println(sb1);
	System.out.println(sb1.length() + " :length");
	System.out.println(sb1.capacity() + " :capacity");
	sb1.ensureCapacity(100);
	System.out.println("New Capacity: "+sb1.capacity());
	System.out.println("10th Character: "+sb1.charAt(10));
	StringBuilder sb2=sb1.reverse();
	System.out.println(sb1);
}
}
