package com.lti.model;

public class Pen {
	private static int ctr=0;
	private int id;
	private String brand;
	private float price;
	private String color_p;
	
	//private class InkChanger
	//{
		//String
//	}
	/* Static class CountTracker
	{
	
		static void displayCounter()
		{
			System.out.println(ctr);
			public static void main(String [ ]args)
			{
				System.out.println("Number of objects");
				displayCounter( );
			}
			}
		
	
		void ChangeInk( )
		{
			String new_color;
			void changeInk();
		}
				color_p=this.new_color;
				System.out.println("color changes to red.. ");
			}
			String getNewcolor()
			{
				return new_Color;
			}
			
		}
	}
	/*public void setbrand()
	{
		String brandname="RENOLDS";
	this.brand	=brandname;
	System.out.println(" Name of brand:"+brand);
	}*/

	public Pen(int a ,String b,float  c,String  d)
	 { 
		this. id=a;
		this .brand=b;
		this.price=c;
		this.color_p=d;
		ctr++;
	 }
	Pen()
	
	{
		System.out.println("Default");
		ctr++;
	}
	
	
	Pen(Pen p)
	{
		this.id=p.id;
		this.brand=p.brand;
		this.price=p.price;
		this.color_p=p.color_p;
		ctr++;
	}
	//setter 
	 public void setid(int idd)
	 {
		 this.id=idd;
	 }
	 public void setBrand(String b)
	 {
		 this.brand=b;
	 }
	 
	 public void setprice(float c)
	 {
		 this.price=c;
	 }
	 public void setcolor_p(String d)
	 {
		 this.color_p=d;
	 }
	 //getters
	 public int getid()
	 {
		 return this.id;
	 }
	 public String getbrand()
	 {
		 return this.brand;
	 }
	 public float getprice()
	 {
		 return this.price;
	 }
	 public String getcolor_p()
	 {
		 return this.color_p;
	 }
	 public String tostring()
	 {
		 return "ID :"+this.id+"\n"+"Brand: "+this.brand+"\nPrice: "+this.price+"\nColor: "+this.color_p;
	 }
	 public   static  int getctr()
	 {
		 return ctr ;
	 }
}
	/* public static void main(String[ ] args)
	 {
		 Pen p1=new Pen(1212,"Parker",4343,"blue");
		 Pen.InkChanger ink_changer =p1.new InkChanger('black" ink_changer.changerIn( );
		 System.out.println(p1);
	 }
}
	 */


