package com.test.jdbcdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import com.test.jdbcdemo.DAO.DepartmentDaoImpl;
import com.test.jdbcdemos.model.Department;

public class DmlDept {
	static Scanner sc=new Scanner(System.in);
 public static Department department=null;
 static DepartmentDaoImpl daoimpl=new DepartmentDaoImpl( );
	public static void AcceptDetails()
	{
		try {
			int id,l_id,m_id;
			String dname;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department ID: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department Name: ");
		dname=sc.nextLine();
		System.out.println("Enter Location ID: ");
		l_id=sc.nextInt();
		System.out.println("Enter Manager ID: ");
		m_id=sc.nextInt();
		department =new Department(id,dname,m_id,l_id);
		System.out.println(department);
		}catch(Exception ee)
		{
			System.out.println("ERROR!!!");
		}
	}
	public static void main(String[]args) {
	
	int deptid=0;
	List <Department> listofdept=new ArrayList<>();
	try {
		
	Scanner sc=new Scanner(System.in);
			
			int choice=1;
			while(choice>=1 && choice<=6)
			{
				System.out.println("Departments Crud");
				System.out.println("1.ADD Departments ");
				System.out.println("2.UPDATE Departments");
				System.out.println("3.DELETE Departments");
				System.out.println("4.LIST ALL  Department ");
				System.out.println("5.LIST BY  Department ID");
				System.out.println("6.EXIT");
				System.out.println("Choose a Crud: ");
				choice=sc.nextInt();
				System.out.println(choice);
				switch(choice)
				{
					case 1: 
						AcceptDetails();
						daoimpl.addDepartment(department);
					break;
					case 2: 
						AcceptDetails();
						daoimpl.updateDepartment(department);
					break;
					case 3: System.out.println("Enter id to be deleted: "); 
								deptid=sc.nextInt();
						daoimpl.deleteDepartment(deptid);
					break;
					case 4: listofdept=daoimpl.listAllDepartments();
									for (Department d:listofdept)
										System.out.println(d.toString());
					break;
					case 5:System.out.println("Enter department to be viewed");
									deptid=sc.nextInt();
						department=daoimpl.listDeptById(deptid);
						System.out.println(department.toString());
					break;
					case 6: System.exit(0);
					break;
				}
			}
	}catch (Exception ee) {
		ee.printStackTrace();
}
}
}
