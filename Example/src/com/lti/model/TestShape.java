package com.lti.model;

import java.util.Scanner;

public class TestShape {
public static void main(String args[])
{
	//object of Shape class
	Shape shape=null;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Shape: ");
	System.out.println("1.Equilateral Triangle.");
	System.out.println("2.Square.");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1: shape = new EquilateralTriangle();
	break;
	case 2: shape = new Square();
	break;
	default: System.out.println("Invalid Choice!!");
	} 
	// call to draw Shape
	
	drawShape(shape);
	}
public static void drawShape(Shape s)
{
	s.draw();
}
}

