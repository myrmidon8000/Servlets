package com.lti.misc;

public class Calculator {
	
private  int num1;
private int  num2;
//private float results;

//constructor

Calculator(int a,int b)
{
	this.num1=a;
	this.num2=b;
}

public Calculator() {
	super();
}

Calculator(Calculator c)
{
	this.num1=c.num1;
	this.num2=c.num2;	
}

/*Calculator(int a,int b)
{
	this.num1=5;
	this.num2=10;
}*/

//getters or accessors
public int getNum1()
{
	return this.num1;

}
public int getNum2()
{
	return this.num2;

}
public int  Add(int  a,int  b)
{
	return a+b;
	
	}
public int   Sub(int  a,int b)
{
	return a-b;
	}
public int   Mul(int  a,int b)
{
	return a*b;
	}
 
public int   Div(int  a,int b)
{
	return a/b;
}
}
