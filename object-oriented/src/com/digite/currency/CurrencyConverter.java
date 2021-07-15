package com.digite.currency;

public class CurrencyConverter {
	public static double convert(Currency C1, Currency C2, double amount) {
		return (double)Math.round((amount*C1.getRate()/C2.getRate()) * 100000d) / 100000d;
	}
	
	public static void convert_print(Currency C1, Currency C2, double amount) {
		System.out.println(amount + " " + C1.getAbbreviation() + " is tantamount to " + convert(C1, C2, amount) + " " + C2.getAbbreviation() + "!");
	}
}
