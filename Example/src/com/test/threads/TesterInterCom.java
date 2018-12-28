package com.test.threads;
import java.util.Scanner;
public class TesterInterCom {
public static void main(String args[])
{

	Data msg=new Data("Process it");
	Data msg2=new Data("Java Multithreading");
	Sender sender1 =new Sender(msg2);
	Sender sender2 =new Sender(msg);
	new Thread(sender2,"sender2").start();
	Reciever receiver=new Reciever(msg);
	receiver.start();
	sender2.start();
	new Thread(receiver,"reciever").start();

	System.out.println("All Threads Started..");
	}
	}
