package com.lti.inheritance;

public enum CoverColor {
BLACK(1000,"MUMBAI"),
GOLDEN(100,"CHANDIGARH"),
ROSE_PINK(50,"PUNE"),
WHITE(100,"HYDERABAD");
	int manu;
	String city;
	CoverColor (int n,String city)
	{
		this.manu=n;
		this.city=city;
		
	}
	public int getManu() {
		return manu;
	}
	public void setManu(int manu) {
		this.manu = manu;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
