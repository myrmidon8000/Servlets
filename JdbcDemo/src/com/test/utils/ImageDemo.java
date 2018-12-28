package com.test.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class ImageDemo {
static Connection con;
static PreparedStatement ps;
public static void main(String args[])
{
	try {
		
	Scanner sc=new Scanner(System.in);
	String query="insert into profile values(?,?,?)";
	con=ConnectionManager.getConnection();
	System.out.println("ID: ");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Name: ");
	String name=sc.nextLine();
	System.out.println("Path of image: ");
	String path=sc.nextLine();
	FileInputStream fis=new FileInputStream(path);
	
	//JDBC Part	
	ps=con.prepareStatement(query);
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setBinaryStream(3, fis,fis.available());
	int retval=ps.executeUpdate();
	if (retval==1)
		System.out.println("Profile Added");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
