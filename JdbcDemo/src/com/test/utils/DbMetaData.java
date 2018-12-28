
package com.test.utils;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class DbMetaData {
	static Connection con=null;
	public static void main(String args[])
	{
		 Connection con=ConnectionManager.getConnection();
	
	try
	{
		DatabaseMetaData metadata=con.getMetaData();
		String dbprod=metadata.getDatabaseProductName();
		int version=metadata.getDatabaseMajorVersion();
		System.out.println(version);
		System.out.println(dbprod);
	ResultSet rs=	metadata.getSchemas();
	while(rs.next())
	{
		System.out.println("printing schema");
		String tableschema =rs.getString(1);
	}
	
	rs =metadata.getCatalogs();
	while(rs.next())
	{
		System.out.println("printing catalogs");
		String catalog =rs.getString(1);
		System.out.println(catalog);
	}
	rs = metadata.getTableTypes();
	while(rs.next())
	{
		System.out.println("printing tables types");
		String tabletypes = rs.getString(1);
		System.out.println(tabletypes);
	}
	rs=metadata.getColumns(null, "hr", "employees", "first_name");
	while (rs.next())
	{
		String tablename =rs.getString("table_name");
		String colname =rs.getString("column_name");
		String datatype=rs.getString("datatype");
		String nullable=rs.getString("nullable");
		System.out.println(tablename+" "+colname+" " +datatype+" "+nullable);
		
	}
	}catch (Exception e)
	{
	e.printStackTrace();
	}

		}
	
	}
	
