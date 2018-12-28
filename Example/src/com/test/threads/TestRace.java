package com.test.threads;

public class TestRace {
public static void main(String args[])
{
/*	Racer r1=new Racer(10);
	r1.start();
	Racer r2=new Racer(1);
r2.start();*/
Runnable runna=new Runna();
Thread t1=new Thread(runna);
t1.setName("RACER 1");
t1.start();

Runnable runna2=new Runna();
Thread t2=new Thread( runna2);
t2.setName("Racer 2");
t2.start();
}
}