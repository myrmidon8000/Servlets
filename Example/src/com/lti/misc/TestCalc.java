package com.lti.misc;
import java.util.*;

public class TestCalc {
public static void main (String args[])
{
	int input1,input2,output;
	System.out.println("Enter first no");
	Scanner sc=new Scanner(System.in);
	input1= sc.nextInt();
	System.out.println("Enter second  no");
			input2  = sc.nextInt();
			
			
	
	/*Calculator c1= new Calculator();
	int input1,input2,output;
	input1=c1.getNum1();
	input2=c1.getNum2();*/
	
	
	/*Calculator c1= new Calculator(6,12);
	input1=c1.getNum1();
	input2=c1.getNum2();*/
	
	Calculator c2= new Calculator(9,10);
	c2.getNum1();
	c2.getNum2();  
	Calculator c1= new Calculator(input1,input2);
	output =c1.Add(c1.getNum1(),c1.getNum2());
	System.out.println("Addition"+output );
	
	/*Calculator c4= new Calculator( );
	c4.setNum1(45);
	c4.setNum1(67);
	System.out.println(c4.add());
	System.out.println(c4.sub());
	*/
	
	output =c1.Sub(input1, input2);
	System.out.println("Subs"+output );
	
	output =c1.Mul(input1, input2);
	System.out.println("Mul"+output );
	
	output =c1.Div(input1, input2);
	System.out.println("Div"+output );
}
}
