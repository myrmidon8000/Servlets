package com.test.threads;

public class Runna implements Runnable {
public void run() {
	for(int i=1;i<100;i+=10)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Sleep Interupted");
		}
	}
}
}
