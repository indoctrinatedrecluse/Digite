package com.digite.bank;

public final class AccountFactory {
	
	private AccountFactory() {
		
	}

	@BusinessLogic(type="account_type")
	public static Bank openAccount(String type, String holder) {
		Bank acnt = null;
		
		if (type.equalsIgnoreCase("Savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);
		
		return acnt;
	}
}
