package com.digite.bank;

public class Current extends Accounts {
	private double overdraft;
	
	public Current() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Current(String holder) {
		super(holder, INIT_CURRENT_BALANCE);
		this.overdraft = OVERDRAFT_LIMIT;
		// TODO Auto-generated constructor stub
	}

	@BusinessLogic(type="deposit")
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.overdraft += amount;
		if (this.overdraft>OVERDRAFT_LIMIT) {
			this.balance += this.overdraft-OVERDRAFT_LIMIT;
			this.overdraft = OVERDRAFT_LIMIT;
		}
	}

	@BusinessLogic(type="withdraw")
	@Override
	public void withdraw(double amount) throws BalanceException {
		// TODO Auto-generated method stub
		if (amount < (this.balance + this.overdraft)) {
			this.balance -= amount;
			if (this.balance < MIN_CURRENT_BALANCE) {
				this.overdraft += this.balance;
				this.balance = MIN_CURRENT_BALANCE;
			}
		}
		else
			throw new BalanceException("Insufficient balance!");
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		super.summary();
		System.out.println("Overdraft: "+this.overdraft);
	}
	
}
