package com.lti.model;

public class Fact {
public int facto(int a)
{
	if (a==0)
		return 1;
	else		
		return a*facto(a-1);
}
}
