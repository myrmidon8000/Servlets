package com.lti.model;
import java.util.*;
public class Testfact {
public static void main(String args[])
{
int n,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number: ");
n=sc.nextInt();
Fact f1=new Fact();
b=f1.facto(n);
System.out.println(b);

}
}
