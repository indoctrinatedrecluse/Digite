package com.digite.bank;

import java.util.ArrayList;

public abstract class Accounts implements Bank{
	private int acnNo;
	private String holder;
	protected double balance;
	protected ArrayList<Transactions> txns;
	
	private static int counter = INIT_ACNT_NO;
	
	public Accounts(){
	}

	public Accounts(String holder, double balance) {
		this.acnNo = counter++;
		this.holder = holder;
		this.balance = balance;
		txns = new ArrayList<Transactions>();
		txns.add(new Transactions("OB", balance, balance));
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		txns.add(new Transactions("DP", amount, balance));
	}
	
	public void summary()
	{
		System.out.println("Account No: "+this.acnNo+"\tHolder: "+this.holder+"\tBalance: "+this.balance);
	}
	
	public void txn_summary()
	{
		for (Transactions T:txns) {
			if (T!=null) {
				T.print_transaction();
			}
		}
	}
}
