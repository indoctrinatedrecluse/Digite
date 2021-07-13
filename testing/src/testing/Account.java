package testing;

public class Account {
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double deposit (double amount) throws BalanceException {
		if (amount<0)
			throw new NumberFormatException("Negative Amount!");
		if (amount<1000)
			throw new BalanceException("Min deposit is 1000!");
		this.balance += amount;
		return balance;
	}
	
	public double withdraw (double amount) throws BalanceException {
		if (amount<0)
			throw new NumberFormatException("Negative Amount!");
		if (amount>balance)
			throw new BalanceException("Insufficient Balance!");
		this.balance -= amount;
		return balance;
	}
}
