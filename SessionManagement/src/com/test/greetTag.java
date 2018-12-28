package com.test;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class greetTag extends SimpleTagSupport{
	public void doTag()throws JspException,IOException{
		StringWriter writer=new StringWriter();
		JspWriter out=getJspContext().getOut();
		out.println("<h1 style='color:red'>Greetings!!></h1>");
		getJspBody().invoke(writer);
		getJspContext().getOut().println("<h3 style='height:10px,width:10px,border:1px;'>"+writer.toString()+"</h3>");		
	}

}
