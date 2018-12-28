package com.lti.model;

import java.util.Scanner;

public class Square extends TwoD {
	Scanner sc=new Scanner(System.in);
	public void Square ()
	{
		this.numofsides=4;
		System.out.println("enter side");
		this.breadth=sc.nextInt();
		this.length=this.breadth;
	}
		public float calcArea( )
		{
			return ( float)(this.length*this.breadth);
			
		}
		public float calcVol( )
		{
			System.out.println("  No volume for 2d shape");
			return 0;
		}
	

}
