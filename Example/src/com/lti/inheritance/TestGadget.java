package com.lti.inheritance;

public class TestGadget {
public static void main(String args[])
{
	Mobile m1=new Mobile(123,"Android",CoverColor.ROSE_PINK);
	m1.turnOn();		
	m1.turnOff();
		
			System.out.println(m1);
}
Gadget g1=new Television(new Gadget( ),54);
Gadget g2=new Television(145,"MOTO",CoverColor.Golden);
turnOn(g1);

}
