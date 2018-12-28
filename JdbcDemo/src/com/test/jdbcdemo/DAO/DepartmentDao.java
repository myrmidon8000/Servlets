package com.test.jdbcdemo.DAO;

import java.util.List;

import com.test.jdbcdemos.model.Department;

public interface DepartmentDao {
public Department addDepartment(Department department);

public void  deleteDepartment(int deptid);

public Department  updateDepartment(Department department);

public List<Department> listAllDepartments();

public Department listDeptById(int deptid);



}
