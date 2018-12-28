package com.lti.practise;
import java.lang.annotation.*;
import java.lang.reflect.Method;
public class TestAnn {
public static void main(String args[])
{
	//Class 
	Class e=Emp.class; //reflection
	Annotation [] ann=e.getAnnotations();
	for (Annotation a:ann)
		System.out.println(a.toString());
	//Methods 
	Method [] methods=e.getMethods();
	for (Method m: methods)
	{
		Annotation [] m_ann=m.getAnnotations();
	for (Annotation m_an:m_ann)
		{
		System.out.println(m_an.toString());
		}
	}
	
}
}
