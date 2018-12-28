package com.lti.practise;

public class Gen <T>{
	T  t1;
	Gen(T t)
	{
		this.t1=t;
	}
public void add(T t)
{
	System.out.println("Object added of type" +t);
}
public T getT()
{
	return this.t1;
}
}
