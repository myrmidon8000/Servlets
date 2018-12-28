package com.lti.misc;
import java.time.LocalDate;
import java.io.*;
import java.util.*;
public class Citizen extends Person implements Serializable {
	private 	String aadharId;
	private 	String name;
	private  Address address;
	private LocalDate dob;
	
	public void eats()
	{}
	public void sleeps()
	{ }
	public Citizen(String aadharId, String name, Address address, LocalDate dob) {
		super();
		this.aadharId = aadharId;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizen [aadharId=" + aadharId + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}
	

}
