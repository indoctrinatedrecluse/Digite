package com.digite.bank;

public class Savings extends Accounts {

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String holder) {
		super(holder, MIN_SAVINGS_BALANCE);
		// TODO Auto-generated constructor stub
	}

	@BusinessLogic(type="withdraw")
	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if (amount < (balance-MIN_SAVINGS_BALANCE)) {
			balance -= amount;
			txns.add(new Transactions("WD", amount, balance));
		}
		else
			throw new BalanceException("Insufficient balance!");
	}
}
