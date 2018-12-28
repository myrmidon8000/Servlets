package com.lti.model;
import java.util.*;
public class TestEmp {
public static void main(String args[])
{
	/*Employee e=new Employee();
	Manager m=new Manager();
	e.setId(1);
	e.setName("Sayak");
	e.setSalary(25000.0f);
	e.setDoj(2018-11-27);
	*/
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	Employee m2=new Manager();
	
	e.greeting();
	Employee e3=null;
	if( e instanceof Manager)
	{
		//Downcast
		
		Manager m1=(Manager) e;
		m1.greeting();
		
	}
	System.out.println("Enter type of employee: ");
			String typeofemp =sc.next();
			if(typeofemp.equals("Employee"))
			{
				e3=new Employee();
				
			}
			else if (typeofemp.equals("Manager"));
			{
				e3=new Manager();
			}
			callGreeting(e3);
			callGreeting(m2);
			
			}
public static void callGreeting(Employee e)
{
	if(e instanceof Employee)

	{
		e.greeting();
	}
	else if( e instanceof Manager)
	{
			e.greeting();	
	}
}
}
	


