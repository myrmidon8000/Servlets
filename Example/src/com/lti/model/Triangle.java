package com.lti.model;

import java.util.Scanner;

public class Triangle extends TwoD {
	Scanner sc=new Scanner(System.in);
	Triangle ()
	{
		this.numofsides=3;
		System.out.println("enter base");
		this.breadth=sc.nextInt();
		System.out.println("enter height");
		this.length=sc.nextInt();
	
	}
	
	@Override
public float calcArea( )
{
	return ( float)(0.5*this.length*this.breadth);
	
}
public float calcVol( )
{
	System.out.println("  No volume for 2d shape");
	return 0;
}
}
