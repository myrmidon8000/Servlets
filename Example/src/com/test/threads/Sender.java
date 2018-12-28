package com.test.threads;

public class Sender  extends Thread{
private Data data;
public Sender(Data data)
{
	this.data=data;
}
public void run()
{
	String nm = Thread.currentThread().getName();
	synchronized(data)
	{
	System.out.println(nm+ " Thread Started");
	//data.setMessage( );
	data.setMessage("Processing Multi Threads");
	System.out.println("Message sent. ");
	try
	{
		Thread.sleep(2000);
	}catch(InterruptedException e)
	{
	System.out.println("Wait Interrupted!!");
	}
	data.notifyAll();
	System.out.println("Notification sent to all!!");
	}
	
	}
}
