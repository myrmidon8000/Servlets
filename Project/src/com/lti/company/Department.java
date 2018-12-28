package com.lti.company;

public class Department {
private int d_id;
private String d_name;
private int manager_id;

@Override
public String toString() {
	return "Department [d_id=" + d_id + ", d_name=" + d_name + ", manager_id=" + manager_id + "]";
}
public Department(int d_id, String d_name, int manager_id) {
	super();
	this.d_id = d_id;
	this.d_name = d_name;
	this.manager_id = manager_id;
}
public int getD_id() {
	return d_id;
}
public void setD_id(int d_id) {
	this.d_id = d_id;
}
public String getD_name() {
	return d_name;
}
public void setD_name(String d_name) {
	this.d_name = d_name;
}
public int getManager_id() {
	return manager_id;
}
public void setManager_id(int manager_id) {
	this.manager_id = manager_id;
}

}
