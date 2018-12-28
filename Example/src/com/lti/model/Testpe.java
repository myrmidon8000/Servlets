package com.lti.model;
 public class Testpe
 {
public static void main(String args[])
{
	Pen p1=new Pen();
	p1.setid(1);
	p1.setBrand("Roman");
	p1.setprice(70.0f);
	p1.setcolor_p("black");
	System.out.println(p1);
	//System.out.println(p1.getbrand()+" "p1.setprice()+" "+setcolor_p());
	Pen p2=new Pen(2,"Parker",200.00f,"blue");
	System.out.println(p2);
	
	System.out.println("Number of pen objects"+Pen.getctr());
}}
