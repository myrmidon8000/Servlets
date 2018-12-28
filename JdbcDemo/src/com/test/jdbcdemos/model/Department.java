package com.test.jdbcdemos.model;

public class Department {
@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", location_id="
				+ location_id + ", manager_id=" + manager_id + "]";
	}
private int department_id;
private String department_name;
private int location_id;
private int manager_id;
public Department(int department_id, String department_name, int manager_id, int location_id) {
	super();
	this.department_id = department_id;
	this.department_name = department_name;
	this.location_id = location_id;
	this.manager_id = manager_id;
}

public Department() {
	super();
	// TODO Auto-generated constructor stub
}

public int getDepartment_id() {
	return department_id;
}
public void setDepartment_id(int department_id) {
	this.department_id = department_id;
}
public String getDepartment_name() {
	return department_name;
}
public void setDepartment_name(String department_name) {
	this.department_name = department_name;
}
public int getLocation_id() {
	return location_id;
}
public void setLocation_id(int location_id) {
	this.location_id = location_id;
}
public int getManager_id() {
	return manager_id;
}
public void setManager_id(int manager_id) {
	this.manager_id = manager_id;
}

}

