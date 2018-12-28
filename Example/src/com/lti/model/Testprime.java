package com.lti.model;
import java.util.*;
public class Testprime {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	int i;
	int j;
	for (i=1;i<=n;i++)
	{
		int c=0;
		for(j=2;j<=(i/2);j++)
		{
			if (i%j==0)
			{
				c++;
			break;
			}}
			if (c==0 && i!=1)
				{
				System.out.println("Prime Numbers are: "+i);
				}
}
}
}

//int [] arr=new int[n];
	//Prime p1=new Prime();
	//p1.Prim(n);