package com.lti.practise;
import java.util.*;
import com.lti.model.Employee;
public class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	private float salary;
	
public Emp(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
@AuthorOfCode(name="Hemant",id=900,email="hemant@gmail.com")
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Deprecated
	public String getName() {
		return name;
	}
	@AuthorOfCode(name="Shyam",id=123,email="shyam@gmail.com")
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
@Override
public int compareTo(Emp e2) {
	if (this.salary==e2.salary)
		return 0;
	else if(this.salary>e2.salary)
		return 1;
	else 
		return -1;
}
}
