package com.test.jdbcdemo.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.test.jdbcdemos.model.Department;
import com.test.utils.ConnectionManager;

public class DepartmentDaoImpl implements DepartmentDao  {
Connection connection=ConnectionManager.getConnection();

PreparedStatement ps=null;

@Override
public Department addDepartment (Department department) {
System.out.println("IN ADD");
	String query="insert into departments values(?,?,?,?)";
try{
	//connection.setAutoCommit(false);
	ps=connection.prepareStatement(query);
	System.out.println(connection);
	System.out.println(ps);
	ps.setInt(1,department.getDepartment_id());
	ps.setString(2, department.getDepartment_name());
	ps.setInt(4, department.getLocation_id());
	ps.setInt(3, department.getManager_id());
	int retval=ps.executeUpdate();
	System.out.println(retval);
	if (retval==1)
		System.out.println("Departments added!!");
}catch (SQLException e)
{
	e.printStackTrace();
}
return department;
}


@Override
public void deleteDepartment(int deptid) {
	try{
		String query="delete from departments where "+ "department_id=?";
		ps=connection.prepareStatement(query);
		ps.setInt(1,deptid);
		ps.executeUpdate();
		System.out.println("Departments deleted!!");
		/*int retval=ps.executeUpdate();
		if (retval==1)
		{
		
			System.out.println("Departments deleted2s!!");
		}
		*/
	}catch (SQLException e)
	{
		e.printStackTrace();
	}
}


@Override
public Department updateDepartment(Department department) {
String query="update departments set department_name=?," + "location_id=?,"+"manager_id=? where department_id=?";
try{
	ps=connection.prepareStatement(query);
	ps.setString(1, department.getDepartment_name());
	ps.setInt(2, department.getLocation_id());
	ps.setInt(3, department.getManager_id());
	ps.setInt(4,department.getDepartment_id());
	ps.executeUpdate();
	int retval=ps.executeUpdate();
	if (retval==1)
		System.out.println("Departments Updated!!");
}catch (SQLException e)
{
	e.printStackTrace();
}
return department;
}

@Override
public List<Department> listAllDepartments() {
	List <Department> listsofdepts=new ArrayList<>();
	String query="Select * from departments ";
	try {
	Statement stmt=connection.createStatement();
	ResultSet rs=stmt.executeQuery(query);
	while(rs.next())
	{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		int m_id=rs.getInt(3);
		int l_id=rs.getInt(4);
		
		Department d=new Department(id,name,m_id,l_id);
		listsofdepts.add(d);
	}
}
	catch(SQLException aee) {
		System.out.println("error");
	}
	return listsofdepts ;
}

@Override
public Department listDeptById(int deptid) {

		Department d=null;
		List <Department> listofdepts=new ArrayList<>();
	String query ="Select * from departments where department_id=?";
	try {
	ps=connection.prepareStatement(query);
	ps.setInt(1, deptid);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		int id=rs.getInt(1);
		String name=rs.getString(2);
		int m_id=rs.getInt(3);
		int l_id=rs.getInt(4);
		
		d=new Department(id,name,m_id,l_id);
	}
	}
	catch(SQLException se)
	{
		System.out.println("SQL exception");
	}
	return d;
	} 
}
