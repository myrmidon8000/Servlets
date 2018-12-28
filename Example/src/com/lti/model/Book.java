package com.lti.model;

public class Book {
	private static int ctr=0;
	private int id;
	private String title;
	private String date;
	private String author;

	Book(int a ,String b,String  c,String  d)
	 { 
		this.id=a;
		this.title=b;
		this.date=c;
		this.author=d;
		ctr++;
	 }
Book()
	
	{
		//System.out.println("Default");
		ctr++;
	}
	
	
	Book(Book b)
	{
		this.id=b.id;
		this.title=b.title;
		this.date=b.date;
		this.author=b.author;
		ctr++;
	}
	//setter 
	 public void setid(int idd)
	 {
		 this.id=idd;
	 }
	 public void settitle(String b)
	 {
		 this.title=b;
	 }
	 
	 public void setdate(String c)
	 {
		 this.date=c;
	 }
	 public void setauthor(String d)
	 {
		 this.author=d;
	 }
	 //getters
	 public int getid()
	 {
		 return this.id;
	 }
	 public String gettitle()
	 {
		 return this.title;
	 }
	 public String getdate()
	 {
		 return this.date;
	 }
	 public String getauthor()
	 {
		 return this.author;
	 }
	 /*public String tostring()
	 {
		 return "ID :"+this.id+"\n"+"Brand: "+this.brand+"\nPrice: "+this.price+"\nColor: "+this.color_p;
	 }*/
	 public   static  int getctr()
	 {
		 return ctr ;
	 }
}

