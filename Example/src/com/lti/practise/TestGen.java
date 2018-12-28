package com.lti.practise;
import com.lti.model.Pen;
public class TestGen {
public static void main(String args[]) {
	Gen<String>genstring=new Gen<>("hello there");
	System.out.println(genstring.getT());
	genstring.add("Using Genrics");
	
	Gen<Pen>genpen=new Gen<>(new Pen(12,"Parker",344.0f,"Black"));
	Pen p1=genpen.getT();
	System.out.println(p1);
}
}
