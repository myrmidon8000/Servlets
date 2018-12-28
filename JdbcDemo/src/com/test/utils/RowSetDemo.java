package com.test.utils;
import javax.sql.rowset.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
public static void main(String []args)
{
	try
	{
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String uname= "hr";
		String pwd="hr";
	JdbcRowSet rowset =RowSetProvider.newFactory().createJdbcRowSet();
	rowset.setUrl(url);
	rowset.setUsername(uname);
	rowset.setPassword(pwd);
	rowset.setCommand("select first_name"+"hiredate,salary from employees");
	rowset.execute();
	while(rowset.next())
	{ System.out.println(rowset.getString(1));
	System.out.println(rowset.getString(2));
	System.out.println(rowset.getString(3));
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
