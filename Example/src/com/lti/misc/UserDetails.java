package com.lti.misc;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class UserDetails {
	public static String username;
	public static String d;
	public static void main(String args[])
	{
		System.out.println("enter Id");
		Scanner sc=new Scanner(System.in);
		username=sc.nextLine();
		System.out.println("enter password");
		d=sc.nextLine();
		System.out.println("Values taken!!");
		System.out.println("Id: "+username);
		System.out.println("Password: "+d);
		
		}
}
