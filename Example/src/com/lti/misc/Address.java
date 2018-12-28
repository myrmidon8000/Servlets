package com.lti.misc;
import java.io.*;
public class Address implements Serializable {
private String bridgename;
private String  cityname;
private String  streetname;
private String pincode;

public Address(String bridgename, String cityname, String streetname, String pincode) {
	super();
	this.bridgename = bridgename;
	this.cityname = cityname;
	this.streetname = streetname;
	this.pincode = pincode;
}


public String getBridgename() {
	return bridgename;
}
public void setBridgename(String bridgename) {
	this.bridgename = bridgename;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [bridgename=" + bridgename + ", cityname=" + cityname + ", streetname=" + streetname + ", pincode="
			+ pincode + "]";
}

}

