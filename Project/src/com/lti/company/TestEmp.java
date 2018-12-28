package com.lti.company;
import java.util.*;
import java.io.*;
public class TestEmp {
public static void main(String args[])
{
	Department d1=new Department(1,"IT",235);
	Department d2=new Department(2,"ADMIN",567);
	Department d3=new Department(3,"HR",789);
	
	Employee e1=new Employee(235,"John",33343,1);
	Employee e2=new Employee(456,"Alex",33345,2);
	Employee e3=new Employee(789,"Steve",24344,3);
	Employee e4=new Employee(233,"Harry",24544,1);
	Employee e5=new Employee(901,"Ron",24344,3);
}
}

