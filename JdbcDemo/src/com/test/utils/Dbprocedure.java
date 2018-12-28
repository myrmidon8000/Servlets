package com.test.utils;
import java.util.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;
import java.io.*;
public class Dbprocedure {

	static Connection con;
	 static CallableStatement stmt,stmt1;
	public static void main(String args[])
	{
		try {
			int id=0;
			String name=null;
			float sal =0.0f;
			Scanner sc = new Scanner(System.in);
	System.out.println("enter id");
	id=sc.nextInt();
	con=ConnectionManager.getConnection();
	stmt=con.prepareCall(" { call t(?,?,?)}");
	stmt1=con.prepareCall("{?=call sqrr(?)}");
	stmt1.setInt(2, id);
	
	stmt1.registerOutParameter(1,Types.INTEGER);
	stmt1.execute();
	int str=stmt1.getInt(1);
	System.out.println("Square is "+str);
	stmt.setInt(1,id);
	stmt.registerOutParameter(2,Types.VARCHAR);
	stmt.registerOutParameter(3,Types.FLOAT);
	stmt.execute();
	name=stmt.getString(2);
	sal=stmt.getFloat(3);
	System.out.println("Name: "+name);
	System.out.println("Sal: "+sal);
	
}catch (SQLException e)
{
	e.printStackTrace();
}
}
}