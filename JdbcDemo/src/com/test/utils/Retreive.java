package com.test.utils;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Retreive {

	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	public static void main(String args[])
	{
		try {
			
		Scanner sc=new Scanner(System.in);
		String query="select *  from  profile";
		con=ConnectionManager.getConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		FileOutputStream fos=new FileOutputStream("D:\\Shaggy\\ww.png");
		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			Blob path=rs.getBlob(3);
		byte []b=path.getBytes(1,(int) path.length());
		fos.write(b);
		System.out.println(id);
		System.out.println(name);
		}
		
}
		catch(Exception e)
		{
			e.printStackTrace( );
		}
	}
}
