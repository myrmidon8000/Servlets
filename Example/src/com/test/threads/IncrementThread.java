package com.test.threads;

public class IncrementThread extends Thread {
VolatileDemo vdemo=new VolatileDemo();

public IncrementThread(VolatileDemo vdemo) {
	super();
	this.vdemo = vdemo;
}

public VolatileDemo getVdemo() {
	return vdemo;
}

public void setVdemo(VolatileDemo vdemo) {
	this.vdemo = vdemo;
}

public void run() {
	vdemo.increment();
	try {
		Thread.sleep(1000);
		
	}
	catch(Exception e)
	{
		System.out.println("Interrupted");
	}
}
}
