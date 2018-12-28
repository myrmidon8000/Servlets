package com.lti.banking;

import com.test.threads.LessFundsException;

public class Account {
	private int accountId;
	private String accountType;
	private float  accountBalance;
	//public int getAccountId() {
	//	return accountId;
	// }
	

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountType=" + accountType + ", accountBalance=" + accountBalance
				+ "]";
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float  getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void applyCharges()
	{
		//Local class inside method


	class Audit
	{
		 float charges =  0.0f;
	void calculateCharges(int daysoverdue )
	{
	if(daysoverdue >7&&daysoverdue<=10)	
	{
	charges=1000.00f;
	}
	
	else if(daysoverdue>=10)
	{
		charges=2000.00f;
	}
	System.out.println("Before charges,balance :"+accountBalance);
	accountBalance= accountBalance-charges;
	System.out.println("Charges amounted :"+charges);
	}
	
	}
	Audit a1=new Audit( );
	a1.calculateCharges(100);
	System.out.println(accountBalance);
}
	public void withdraw(double amt) throws LessFundsException
	{
		if(amt>this.accountBalance) {
			throw new LessFundsException("not enough balance");
	}
		else
		{
			this.accountBalance=(float) (this.accountBalance-amt);
		}
	}
	
	public Account(int accountId, String accountType, float accountBalance) {
		super();
		this.accountId = accountId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public static void main(String args[ ])
	{
		Account a2=new Account(3432,"current",212121);
		a2.applyCharges();
	}
}