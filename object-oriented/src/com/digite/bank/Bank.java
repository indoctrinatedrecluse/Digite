package com.digite.bank;

public interface Bank {
	
	void deposit (double amount);
	void withdraw (double amount) throws BalanceException;
	void summary();
	void txn_summary();
	double getBalance();
	
	//Application Constants
	public static final int INIT_ACNT_NO=11001;
	public static final double MIN_SAVINGS_BALANCE = 1000;
	public static final double INIT_CURRENT_BALANCE = 0;
	public static final double MIN_CURRENT_BALANCE = 0;
	public static final double OVERDRAFT_LIMIT = 10000;
}
