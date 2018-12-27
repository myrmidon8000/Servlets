package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
private static Connection connection=null;
private ConnectionManager()
{
	
}
public static Connection getConnection()
{
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String uname= "hr";
	String pwd="hr";
	Connection connection=null;
	//Statement stmt=null;
	//ResultSet rs=null;
	//1.Step:Register driver class
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//2.Connection Object
	connection= DriverManager.getConnection(url,uname,pwd);
	System.out.println(connection.toString());
	return connection;
	}catch (ClassNotFoundException e)
	{
	System.out.println("driver class not found..");
	}
	catch (SQLException  ae)
	{
	System.out.println("sql exception..");
}
return connection;
}
public static void main(String args[])
{
connection=getConnection();
System.out.println(connection);
}
}
