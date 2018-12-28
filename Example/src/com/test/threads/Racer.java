package com.test.threads;

public class Racer extends Thread {
private int i;
Racer(int i)
{
	this.i=i;

}
public void run() {
	for(int j=0;j<10;j++)
	{
		System.out.println(this.i*j);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("sleep interrupted");
		}
	}
}
}
