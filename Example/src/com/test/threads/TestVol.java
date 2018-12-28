package com.test.threads;

public class TestVol {
public static void main(String[]args)
{
VolatileDemo vdemo1=new VolatileDemo();
	
	IncrementThread t1=new IncrementThread(vdemo1);
	t1.start();
	System.out.println(vdemo1.getX());
	
	IncrementThread t2=new IncrementThread(vdemo1);
	t2.start();
	System.out.println(vdemo1.getX());
	
	IncrementThread t3=new IncrementThread(vdemo1);
	t3.start();
	System.out.println(vdemo1.getX());
	
	IncrementThread t4=new IncrementThread(vdemo1);
	t4.start();
	System.out.println(vdemo1.getX());
	
	DecrementThread t5=new DecrementThread(vdemo1);
	DecrementThread t6=new DecrementThread(vdemo1);
	DecrementThread t7=new DecrementThread(vdemo1);
	t5.start();
	System.out.println(vdemo1.getX());
	t6.start();
	System.out.println(vdemo1.getX());
	t7.start();
	System.out.println(vdemo1.getX());
	
	
}
}
