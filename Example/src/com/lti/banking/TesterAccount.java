package com.lti.banking;

import com.test.threads.LessFundsException;

public class TesterAccount {
	public static void main(String args[])
	{

Account acc1=new Account(221,"Savings",56000);
try
	{
	acc1.withdraw(50000);
	}
catch(LessFundsException e)
{
	System.out.println(e.getMessage());
}
System.out.println(acc1.getAccountBalance());
}
}