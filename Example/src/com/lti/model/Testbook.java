package com.lti.model;
import java.util.*;
public class Testbook {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Book [ ] ar=new Book[2];
		for(int i =0;i<ar.length;i++ )
		{
			ar[i]=new Book( );
			
		}
		for(int i =0;i<ar.length;i++ )
		{
			System.out.println("Enter Book id: ");
			ar[i].setid(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Book Title: ");
			ar[i].settitle(sc.nextLine());
			System.out.println("Enter Book Date: ");
			ar[i].setdate(sc.nextLine());
			System.out.println("Enter Book Author: ");
			ar[i].setauthor(sc.nextLine());
		}
		for(int i =0;i<ar.length;i++ )
		{
			System.out.println(" Book id: "+ar[i].getid());
		
			System.out.println(" Title: "+ar[i].gettitle());
	
			System.out.println(" Date: "+ar[i].getdate());

			System.out.println("Author: "+ar[i].getauthor());
		
		}
	}
}
