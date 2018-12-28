package com.test.threads;

public class Reciever extends Thread{
private Data data;
public Reciever(Data data)
{
	this.data=data;
}
public void run()
{
	
	String nm = Thread.currentThread().getName();
	System.out.println(nm);
	synchronized(data)
	{
	try {
		System.out.println("WAITING FOR DATA!!");
		data.wait(1000);
	}catch(InterruptedException e)
		{
		System.out.println("Wait Interrupted!!");
		}
	}
	
	System.out.println("Recieved data.." +data.getMessage());
}
}

