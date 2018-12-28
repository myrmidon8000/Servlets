package com.lti.model;

public  abstract class Shape implements Changeable {
	protected int numofsides;
	protected int length;
	protected int breadth;
public abstract float calcArea();
public abstract float calcVol();

public void draw()
{
System.out.println("Drawing a shape");	
}
@Override
public void color() {
	// TODO Auto-generated method stub
	
}
@Override
public void outline() {
	// TODO Auto-generated method stub
	
}
@Override
public void shadow() {
	// TODO Auto-generated method stub
	
}
}
