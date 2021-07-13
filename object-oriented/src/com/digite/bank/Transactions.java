package com.digite.bank;

public class Transactions {
	private String type;
	private double amount;
	private double balance;
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
	
	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	public void print_transaction()
	{
		System.out.println("Type: "+this.type+"\tAmount: "+this.amount+"\tBalance: "+this.balance);
	}
}
