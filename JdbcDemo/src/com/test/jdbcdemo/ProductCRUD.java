package com.test.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductCRUD {
public static void main(String []args)
{
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String uname= "hr";
	String pwd="hr";
	String query="Select employee_id,first_name,last_name,salary from employees";
Connection connection=null;
Statement stmt=null;
ResultSet rs=null;
	//1.Step:Register driver class

	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	//2.Connection Object
connection= DriverManager.getConnection(url,uname,pwd);
//3.Create statement 
//	System.out.println(connection.toString());
stmt=connection.createStatement();
//4.executing statements 
rs=stmt.executeQuery(query);
//5.Fetching records from resultset
while(rs.next())
{
	int employee_id=rs.getInt(1);
	String first_name=rs.getString(2);
	String last_name=rs.getString(3);
	Float salary=rs.getFloat(4);
	System.out.println(employee_id + "  "+first_name+"  "+last_name+"  "+salary+" ");
}
	}
catch (ClassNotFoundException e)
	{
	System.out.println("driver class not found..");
	}
	catch (SQLException  e)
	{
	System.out.println("sql exception..");
	}
}
}
