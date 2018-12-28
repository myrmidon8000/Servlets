package com.test.threads;

public class DecrementThread extends Thread {
VolatileDemo vdemo1=new VolatileDemo();

public DecrementThread(VolatileDemo vdemo1) {
	super();
	this.vdemo1= vdemo1;
}

public void run()
{
	vdemo1.decrement();
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	{
		System.out.println("Interrupted");
	}
}
}
